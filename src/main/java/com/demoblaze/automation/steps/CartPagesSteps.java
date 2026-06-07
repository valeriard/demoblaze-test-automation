package com.demoblaze.automation.steps;

import com.demoblaze.automation.pagesobject.CartPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class CartPagesSteps {
    @Page
    CartPage cartPage;

    @Step("Verify cart contains {0} products")
    public void verifyProductCount(int expectedCount) {
        int actualCount = cartPage.getProductCount();
        that(actualCount).isEqualTo(expectedCount);
    }

    @Step("Click on Place Order button")
    public void clickPlaceOrder() {
        cartPage.buttonPay.click();
        cartPage.waitFor(5).seconds();
    }
}
