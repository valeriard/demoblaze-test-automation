package com.demoblaze.automation.pagesobject;

import com.demoblaze.automation.pagesobject.basepage.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;



public class CartPage extends BasePage {

    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElementFacade buttonPay;

    @FindBy(xpath = "//tbody[@id='tbodyid']/tr")
    public List<WebElementFacade> cartProducts;

    public int getProductCount() {
        return cartProducts.size();
    }

}
