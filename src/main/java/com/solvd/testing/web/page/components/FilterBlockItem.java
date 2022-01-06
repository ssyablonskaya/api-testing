package com.solvd.testing.web.page.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FilterBlockItem extends AbstractUIObject {

    @FindBy(xpath = ".//input[@type='checkbox']")
    private ExtendedWebElement checkbox;

    @FindBy(xpath = ".//*[contains(@class, 'checkbox-text')]")
    private ExtendedWebElement labelText;

    public FilterBlockItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getCheckbox() {
        return this.checkbox;
    }

    public void clickCheckbox() {
        this.checkbox.click();
    }

    public ExtendedWebElement getLabelText() {
        return this.labelText;
    }

    public String getLabelTextMethod() {
        return this.labelText.getText();
    }

}
