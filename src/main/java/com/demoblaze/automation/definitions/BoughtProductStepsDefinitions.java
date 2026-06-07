package com.demoblaze.automation.definitions;

import com.demoblaze.automation.enums.TestOrderData;
import com.demoblaze.automation.models.OrderData;
import com.demoblaze.automation.steps.CartPagesSteps;
import com.demoblaze.automation.steps.ChooseProductsSteps;
import com.demoblaze.automation.steps.HomePageSteps;
import com.demoblaze.automation.steps.PlaceOrderSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class BoughtProductStepsDefinitions {

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    ChooseProductsSteps chooseProductsSteps;

    @Steps
    CartPagesSteps cartPageSteps;

    @Steps
    PlaceOrderSteps placeOrderSteps;


    @Given("the customer is on the Demoblaze home page as a guest user")
    public void theDemoblazeHomePage(){
     homePageSteps.openDemoblazeHomePage();
    }

    @When("the customer selects the {string}")
    public void selectToCategory(String category) {
        homePageSteps.selectCategory(category);
    }

    @And("the customer add the  {string} product to the cart")
    public void chooseTheProduct(String product) {
        chooseProductsSteps.selectProduct(product);
        chooseProductsSteps.addToCart();
        chooseProductsSteps.acceptAlert();
    }

    @And("the customer goes to {string} page")
    public void goToAnyPageOnWebsite(String element) {
        chooseProductsSteps.selectNavigation(element);
    }

    @And("the customer goes to home page")
    public void theCustomerGoesToHomePage() {
        homePageSteps.goBackToHomePage();
    }

    @Then("the cart should contain {int} products")
    public void theCartShouldContainProducts(int count) {
        cartPageSteps.verifyProductCount(count);
    }

    @And("the customer clicks on Place Order button")
    public void theCustomerClicksOnPlaceOrderButton() {
        cartPageSteps.clickPlaceOrder();
    }

    @And("the customer fills in the purchase form with valid information")
    public void theCustomerFillsInThePurchaseFormWithValidInformation() {
        OrderData order = TestOrderData.VALID_ORDER.toOrderData();
        placeOrderSteps.fillOrder(order);
        placeOrderSteps.clickPurchaseButton();
    }

    @Then("a confirmation message should be displayed confirming the purchase")
    public void aConfirmationMessageShouldBeDisplayedConfirmingThePurchase() {
        placeOrderSteps.ensureOrderWasPlaced();
        placeOrderSteps.clickOkButton();
    }
}
