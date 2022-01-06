package com.solvd.testing.web.page.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MenuBarItem extends AbstractUIObject {

    @FindBy(xpath = ".//*[contains(@class,'_link')]")
    private ExtendedWebElement menuBarItemPoint;

    @FindBy(xpath = ".//*[contains(@class,'_text')]")
    private ExtendedWebElement menuBarItemText;

    public MenuBarItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getMenuBarItemPoint() {
        return menuBarItemPoint;
    }

    public ExtendedWebElement getMenuBarItemText() {
        return menuBarItemText;
    }
}
