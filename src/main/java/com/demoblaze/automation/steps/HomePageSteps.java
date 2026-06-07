package com.demoblaze.automation.steps;

import com.demoblaze.automation.pagesobject.ProductPage;
import com.demoblaze.automation.pagesobject.UserHomePage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HomePageSteps {
    @Page
    UserHomePage userHomePage;
    ProductPage productPage;

    @Step("Open the Demoblaze home page")
    public void openDemoblazeHomePage(){
        userHomePage.open();
    }

    @Step("Select the category")
    public void selectCategory(String category){
        userHomePage.clickItemByText(userHomePage.categoryTitles, category);
        userHomePage.waitFor(3).seconds();
    }

    @Step("Go back to the home page")
    public void goBackToHomePage(){
        productPage.clickOn(productPage.productStore);
        productPage.waitFor(5).seconds();
    }
}
