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
        cartPage.clickCheckoutButton();
        checkoutStepOnePage.setCheckoutFirstName("Vitaliy");
        checkoutStepOnePage.clickContinueButton();
        Assert.assertEquals(checkoutStepOnePage.getErrorMessageCheckoutLastNameText(), "Error: Last Name is required");
    }
    @Test
    public void OrderWithCorrectData() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProductToCart("Sauce Labs Bike Light");
        inventoryItemPage.setCartPage();
        cartPage.clickCheckoutButton();
        checkoutStepOnePage.setCheckoutFirstName("Vitaliy");
        checkoutStepOnePage.setCheckoutLastName("Vasilevich");
        checkoutStepOnePage.setZipPostalCode("12345");
        checkoutStepOnePage.clickContinueButton();
        checkoutStepTwoPage.clickCheckoutFinishButton();
        Assert.assertEquals(checkoutCompletePage.getCheckoutCompleteTitleText(), "CHECKOUT: COMPLETE!");
    }
}
