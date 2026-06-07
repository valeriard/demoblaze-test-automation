package com.demoblaze.automation.steps;

import com.demoblaze.automation.models.OrderData;
import com.demoblaze.automation.pagesobject.PlaceOrderPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class PlaceOrderSteps {
    @Page
    PlaceOrderPage placeOrderPage;


    @Step("Fill order form")
    public void fillOrder(OrderData orderData){
        placeOrderPage.fillOrderForm(orderData);
    }

    @Step("Click on Purchase button")
    public void clickPurchaseButton(){
        placeOrderPage.buttonPurchase.click();
        placeOrderPage.waitFor(5).seconds();
    }

    @Step("Ensure the order was placed")
    public void ensureOrderWasPlaced(){
    that(placeOrderPage.isVisibleMessagePurchase()).isTrue();
    that(placeOrderPage.getConfirmationMessage()).isEqualTo("Thank you for your purchase!");

    }

    @Step
    public void clickOkButton(){
        placeOrderPage.buttonOk.click();
    }


}
