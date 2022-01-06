package com.solvd.testing.web.page.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UsedCarMarketMenuVariant extends AbstractUIObject {

    //@FindBy(xpath = "//*[@id='container']//nav/ul[1]/li[3]//div[1]/a")
    //@FindBy(xpath = "//header[@class='g-top']//*[@class='b-top-navigation']//*[contains(@class, 'dropdown-column')]//a[contains(@class, 'title-link')]")
    @FindBy(xpath = ".//a[contains(@class, 'title-link')]")
    private ExtendedWebElement subTitle;

    public UsedCarMarketMenuVariant(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getTitleTextMethod() {
        return subTitle.getText();
    }

    public ExtendedWebElement getSubTitle() {
        return subTitle;
    }
}
