package com.solvd.testing.web.page;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.testing.web.page.components.SearchResultItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchFrame extends AbstractUIObject {

    @FindBy(xpath = "//*[@id='search-page']//*[contains(@class, 'result')]//li[contains(@class, 'result')]")
    private List<SearchResultItem> searchResultItems;

    public SearchFrame(WebDriver driver) {
        super(driver);
        setRootElement(driver.findElement(By.xpath("//*[@class='modal-iframe']")));
    }

    public List<SearchResultItem> getSearchResultItems() {
        return searchResultItems;
    }
}
