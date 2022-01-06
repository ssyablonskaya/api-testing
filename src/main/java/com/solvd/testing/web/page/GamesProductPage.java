package com.solvd.testing.web.page;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.solvd.testing.web.page.components.FilterBlock;
import com.solvd.testing.web.page.components.ProductBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GamesProductPage extends AbstrPage {

    @FindBy(id = "schema-filter")
    private FilterBlock filterBlock;

    @FindBy(xpath = "//*[@id='schema-products']/*[contains(@class, 'group')]")
    private List<ProductBlock> productBlocks;

    public GamesProductPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("catalog_url") + "games");
    }

    public FilterBlock getFilterBlock() {
        return this.filterBlock;
    }

    public List<ProductBlock> getProductBlocks() {
        return this.productBlocks;
    }
}
