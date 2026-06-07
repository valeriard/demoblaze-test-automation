#Author: Valeria Rivera
@EndToEnd
Feature: Stay on the Demoblaze home page
  Background:
    Given the customer is on the Demoblaze home page as a guest user

  @Purchaseproduct
  Scenario: Add multiple products to the cart
    When the customer selects the "Monitors"
    And the customer add the  "ASUS Full HD" product to the cart
    And the customer goes to home page
    And the customer add the  "Nexus 6" product to the cart
    And the customer goes to "Cart" page
    Then the cart should contain 2 products
    And the customer clicks on Place Order button
    And the customer fills in the purchase form with valid information
    Then a confirmation message should be displayed confirming the purchase


