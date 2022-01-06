package com.solvd.testing.web.page;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.testing.web.page.components.UsedCarMarketDropdownMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AbstrPage extends AbstractPage {

    @FindBy(xpath = "//*[contains(@class, 'state_animated')]")
    private ExtendedWebElement stateAnimated;

    @FindBy(xpath = "//*[@class='b-main-navigation']//li[2]//*[contains(@class, 'dropdown-grid')]")
    private UsedCarMarketDropdownMenu usedCarMarketDropdownMenu;

    public AbstrPage(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getStateAnimated() {
        return stateAnimated;
    }

    public UsedCarMarketDropdownMenu getUsedCarMarketDropdownMenu() {
        return usedCarMarketDropdownMenu;
    }

}
