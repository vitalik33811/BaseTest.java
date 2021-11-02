package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutCompletePage;

public class OrderingProcess extends BaseTest {

    @Test
    public void OrderWithNameOnly() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProductToCart("Sauce Labs Bike Light");
        inventoryItemPage.setCartPage();
        cartPage.setCheckoutButton();
        checkoutStepOnePage.setCheckoutFirstName("Vitaliy");
        checkoutStepOnePage.setContinueButton();
        Assert.assertEquals(checkoutStepOnePage.setErrorMessageCheckoutLastName(), "Error: Last Name is required");
    }

    @Test
    public void OrderWithCorrectData() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProductToCart("Sauce Labs Bike Light");
        inventoryItemPage.setCartPage();
        cartPage.setCheckoutButton();
        checkoutStepOnePage.setCheckoutFirstName("Vitaliy");
        checkoutStepOnePage.setCheckoutLastName("Vasilevich");
        checkoutStepOnePage.setZipPostalCode("12345");
        checkoutStepOnePage.setContinueButton();
        checkoutStepTwoPage.setCheckout2FinishButton();
        Assert.assertEquals(checkoutCompletePage.setCheckoutCompleteTitle(), "CHECKOUT: COMPLETE!");
    }
}
