package com.solvd.testing.web;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.solvd.testing.service.PageService;
import com.solvd.testing.web.page.*;
import com.solvd.testing.web.page.components.FilterBlock;
import com.solvd.testing.web.page.components.ProductBlock;
import com.solvd.testing.web.page.components.SearchResultItem;
import com.solvd.testing.web.page.components.UsedCarMarketDropdownMenu;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public class OnlinerWebTest implements IAbstractTest {

    @Test
    public void verifyGamesFilterTest() {
        GamesProductPage gamesProductPage = new GamesProductPage(getDriver());
        gamesProductPage.open();
        FilterBlock filterBlock = gamesProductPage.getFilterBlock();
        Assert.assertTrue(filterBlock.isUIObjectPresent(), "Filters block doesn't exist");

        filterBlock.getFilterBlockItems().stream()
                .filter(filterBlockItem -> "PlayStation 5".equals(filterBlockItem.getLabelTextMethod()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Unable to find filter with label \"PlayStation 5\""))
                .clickCheckbox();

        PageService pageService = new PageService(getDriver());
        pageService.getStateAnimation(20);

        List<ProductBlock> productBlocks = gamesProductPage.getProductBlocks();

        SoftAssert searchAssert = new SoftAssert();
        productBlocks.forEach(productBlock ->
                searchAssert.assertTrue(productBlock.getTitleTextMethod().toLowerCase(Locale.ROOT).contains("playstation 5")));
        searchAssert.assertAll();

    }

    @Test
    public void verifySearchResultsTest() {
        CatalogPage catalogPage = new CatalogPage(getDriver());
        catalogPage.open();
        Assert.assertTrue(catalogPage.getSearchBox().isPresent(), "Search box doesn't exist");
        catalogPage.SearchBoxTypeMethod("Xiaomi");

        SearchFrame searchFrame = new SearchFrame(getDriver());
        getDriver().switchTo().frame(searchFrame.getRootElement());

        Wait<?> wait = new WebDriverWait(getDriver(), 15);
        wait.until(driver -> !searchFrame.getSearchResultItems().isEmpty());

        List<SearchResultItem> searchResultItems = searchFrame.getSearchResultItems();

        Assert.assertFalse(searchResultItems.isEmpty(), "Search item \"Xiaomi\" wasn't found");
        searchResultItems.forEach(searchResultItem ->
                Assert.assertTrue(searchResultItem.getSearchResultItemTextMethod().toLowerCase(Locale.ROOT).contains("xiaomi"),
                        "Search result isn't correct"));

    }

    @Test
    public void verifyClickVKGroupButtonAndURLTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.clickVKbutton();
        homePage.switchWindow();
        Assert.assertEquals(getDriver().getCurrentUrl(), R.CONFIG.get("vk_url"), "VK group's button has incorrect URL");

    }

    @Test
    public void verifyLoadCatalogTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.clickCatalogButton();

        PageService pageService = new PageService(getDriver());
        pageService.getStateAnimation(15);

        CatalogPage catalogPage = new CatalogPage(getDriver());
        Assert.assertTrue(catalogPage.getCatalogBlock().isUIObjectPresent(), "Catalog page wasn't loaded");

    }

    @DataProvider(name = "dropdownUsedCarMarketItems")
    public Object[][] dropdownUsedCarMarketItems() {
        return new Object[][]{{"автобарахолка",
                List.of("автобарахолка", "мотобарахолка")}};
    }

    @Test(dataProvider = "dropdownUsedCarMarketItems")
    public void verifyUsedCarMarketMenuItem(String itemName, List<String> dropdownUsedCarMarketItems) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.getMenuBar().hoverMenuBarItem(itemName);

        AbstrPage abstrPage = new AbstrPage(getDriver());
        UsedCarMarketDropdownMenu usedCarMarketDropdownMenu = abstrPage.getUsedCarMarketDropdownMenu();
        Assert.assertTrue(usedCarMarketDropdownMenu.isUIObjectPresent(), "Dropdown menu is absent");

        SoftAssert softAssert = new SoftAssert();
        IntStream.range(0, dropdownUsedCarMarketItems.size())
                .boxed()
                .forEach(index -> {
                    softAssert.assertEquals(usedCarMarketDropdownMenu.getUsedCarMarketMenuVariants()
                                    .get(index).getTitleTextMethod().toLowerCase(Locale.ROOT),
                            dropdownUsedCarMarketItems.get(index).toLowerCase(Locale.ROOT), "Dropdown menu item is incorrect:");
                });
        softAssert.assertAll();

    }
}
