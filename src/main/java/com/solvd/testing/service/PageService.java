package com.solvd.testing.service;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.testing.web.page.AbstrPage;
import org.openqa.selenium.WebDriver;

public class PageService {

    private final AbstrPage abstrPage;

    public PageService(WebDriver webDriver) {
        this.abstrPage = new AbstrPage(webDriver);
    }

    public void getStateAnimation (int animationSeconds){
        ExtendedWebElement extendedWebElement = abstrPage.getStateAnimated();
        extendedWebElement.waitUntilElementDisappear(20);
    }

}
