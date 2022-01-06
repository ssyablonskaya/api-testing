package com.solvd.testing.web.page;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.testing.web.page.components.CatalogBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends AbstrPage {

    @FindBy(xpath = "//*[@id='container']/div/div/div/div")
    private CatalogBlock catalogBlock;

    @FindBy(xpath = "//*[@id='fast-search']/form")
    private ExtendedWebElement searchBox;

    @FindBy(xpath = "//*[@id='fast-search']//input[@type='text']")
    private ExtendedWebElement searchBoxType;

    public CatalogPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("catalog_url"));
    }

    public void SearchBoxTypeMethod(String searchBoxText){
        searchBoxType.type(searchBoxText, 10L);
    }

    public CatalogBlock getCatalogBlock() {
        return catalogBlock;
    }

    public ExtendedWebElement getSearchBox() {
        return searchBox;
    }
}
