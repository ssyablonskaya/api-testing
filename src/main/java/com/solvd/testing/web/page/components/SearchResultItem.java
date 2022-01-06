package com.solvd.testing.web.page.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchResultItem extends AbstractUIObject {

    @FindBy(xpath = ".//*[contains(@class, 'title')]//*[contains(@class, 'link')]")
    private ExtendedWebElement searchResultItemText;

    public SearchResultItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getSearchResultItemText() {
        return searchResultItemText;
    }

    public String getSearchResultItemTextMethod() {
        return searchResultItemText.getText();
    }

}
