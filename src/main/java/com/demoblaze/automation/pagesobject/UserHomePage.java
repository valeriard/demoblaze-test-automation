package com.demoblaze.automation.pagesobject;

import com.demoblaze.automation.pagesobject.basepage.BasePage;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;


@DefaultUrl("https://www.demoblaze.com/")
public class UserHomePage extends BasePage {

    @FindBy(xpath = "//div[@class='list-group']//a[contains(@onclick,'byCat')]")
    public List<WebElementFacade> categoryTitles;

}
