package com.demoblaze.automation.steps;

import com.demoblaze.automation.pagesobject.ProductPage;
import org.fluentlenium.core.annotation.Page;

public class ChooseProductsSteps {
    @Page
    ProductPage productPage;

    public void selectProduct(String product) {
        productPage.clickItemByText(productPage.listProducts, product);
    }

     public void addToCart() {
        productPage.addToCart.click();
        productPage.waitFor(3).seconds();
    }

    public void acceptAlert() {
        productPage.acceptAlert();
    }

    public void selectNavigation(String navigation){
        productPage.iterateElementsNavBar(productPage.navBarItems);
        productPage.clickItemByText(productPage.navBarItems, navigation);

    }

}
