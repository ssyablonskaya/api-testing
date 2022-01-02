package com.solvd.testing.web.page.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductBlock extends AbstractUIObject { //GOTOVO

    @FindBy(xpath = ".//*[contains(@class, 'title')]/a//span")
    private ExtendedWebElement titleText;

    public ProductBlock(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getTitleText() {
        return this.titleText;
    }

    public String getTitleTextMethod() {
        return this.titleText.getText();
    }

}
