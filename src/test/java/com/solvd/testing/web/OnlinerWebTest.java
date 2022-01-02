package com.solvd.testing.web;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.testing.web.page.GamesProductPage;
import com.solvd.testing.web.page.components.FilterBlock;
import com.solvd.testing.web.page.components.ProductBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Locale;

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


        /*Wait<WebDriver> wait = new WebDriverWait(getDriver(), 10);
        wait.until(driver -> !driver.findElement(By.xpath(".//*[contains(@class, 'state_animated')])")).isDisplayed());*/
//dosele ne ok

        List<ProductBlock> productBlocks = gamesProductPage.getProductBlocks();

        SoftAssert searchAssert = new SoftAssert();
        productBlocks.forEach(productBlock ->
                searchAssert.assertTrue(productBlock.getTitleTextMethod().toLowerCase(Locale.ROOT).contains("playstation 5")));
        searchAssert.assertAll();

    }



}
