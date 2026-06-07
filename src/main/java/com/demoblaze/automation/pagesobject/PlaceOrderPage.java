package com.demoblaze.automation.pagesobject;

import com.demoblaze.automation.models.OrderData;
import com.demoblaze.automation.pagesobject.basepage.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class PlaceOrderPage extends BasePage {

    @FindBy(xpath = "//button[text()='Purchase']")
    public WebElementFacade buttonPurchase;

    @FindBy(css = "#orderModal input[class='form-control']")
    public List<WebElementFacade> listPlaceOrder;

    @FindBy(xpath = "//h2[contains(text(),'Thank you for your purchase!')]")
    public WebElementFacade messagePurchase;

    @FindBy(xpath="//button[@class='confirm btn btn-lg btn-primary']")
    public WebElementFacade buttonOk;

    public void fillOrderForm(OrderData order) {
        listPlaceOrder.get(0).type(order.getName());
        listPlaceOrder.get(1).type(order.getCountry());
        listPlaceOrder.get(2).type(order.getCity());
        listPlaceOrder.get(3).type(order.getCreditCard());
        listPlaceOrder.get(4).type(order.getMonth());
        listPlaceOrder.get(5).type(order.getYear());
    }

    public boolean isVisibleMessagePurchase(){
        messagePurchase.waitUntilVisible();
        return messagePurchase.isVisible();
    }

    public String getConfirmationMessage() {
        return messagePurchase.getText();
    }

}
