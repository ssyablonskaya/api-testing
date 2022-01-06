package com.solvd.testing.web.page;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.testing.web.page.components.MenuBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id='container']//header//nav/ul[1]")
    private MenuBar menuBar;

    @FindBy(xpath = "//*[contains (@class,'text') and text()='Каталог']")
    private ExtendedWebElement catalogButton;

    @FindBy(xpath = "//*[contains(@class, 'button_vk')]")
    private ExtendedWebElement vkGroupButton;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("url"));
    }

    public void clickVKbutton() {
        vkGroupButton.click();
    }

    public void clickCatalogButton() {
        catalogButton.click();
    }

    public ExtendedWebElement getVkGroupButton() {
        return vkGroupButton;
    }

    public ExtendedWebElement getCatalogButton() {
        return catalogButton;
    }

    public MenuBar getMenuBar() {
        return menuBar;
    }

    /*    @FindBy(xpath="//div[@class='header-style__middle']")
    private MenuBlock menuBlock;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public MenuBlock getMenuBlock() {
        return menuBlock;
    }*/
}

