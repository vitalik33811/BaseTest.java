package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderingProcess extends BaseTest {

    @Test
    public void OrderWithNameOnly() {
        loginPage.openPage()
        .login("standard_user", "secret_sauce")
        .addProductToCart("Sauce Labs Bike Light")
        .setCartPage()
        .setCheckoutButton()
        .setCheckoutFirstName("Vitaliy")
        .setContinueButton();
        Assert.assertEquals(checkoutStepOnePage.setErrorMessageCheckoutLastName(), "Error: Last Name is required");
    }

    @Test
    public void OrderWithCorrectData() {
        loginPage.openPage()
        .login("standard_user", "secret_sauce")
        .addProductToCart("Sauce Labs Bike Light")
        .setCartPage()
        .setCheckoutButton()
        .setCheckoutFirstName("Vitaliy")
        .setCheckoutLastName("Vasilevich")
        .setZipPostalCode("12345")
        .setContinueButton()
        .setCheckout2FinishButton();
        Assert.assertEquals(checkoutCompletePage.setCheckoutCompleteTitle(), "CHECKOUT: COMPLETE!");
    }
}
