package com.solvd.testing.web.page.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UsedCarMarketDropdownMenu extends AbstractUIObject {

    @FindBy(xpath = ".//*[contains(@class, 'dropdown-column')]")
    private List<UsedCarMarketMenuVariant> usedCarMarketMenuVariants;

    public UsedCarMarketDropdownMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public List<UsedCarMarketMenuVariant> getUsedCarMarketMenuVariants() {
        return usedCarMarketMenuVariants;
    }
}
