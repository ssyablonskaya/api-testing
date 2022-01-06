package com.solvd.testing.web.page.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Locale;

public class MenuBar extends AbstractUIObject {

    @FindBy(xpath = "//*[contains(@class, 'main-navigation')]//*[contains(@class,'_item')]")
    private List<MenuBarItem> menuBarItems;

    public void hoverMenuBarItem(String name) {
        this.menuBarItems.stream()
                .filter(menuBarItem -> menuBarItem.getMenuBarItemText().getText().toLowerCase(Locale.ROOT).equals(name))
                .findFirst()
                .map(menuBarItem -> menuBarItem.getMenuBarItemPoint())
                .orElseThrow(() -> new RuntimeException("Can't find menu point"))
                .hover();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public MenuBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
