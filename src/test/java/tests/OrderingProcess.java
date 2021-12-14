package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderingProcess extends BaseTest {

    @Test
    public void OrderWithNameOnly() {
        loginPage.openPage()
        .login("standard_user", "secret_sauce")
        .addProductToCart("Sauce Labs Bike Light")
        .clickShoppingCartLink()
        .clickCheckoutButton()
        .setCheckoutFirstName("Vitaliy")
        .clickContinueButton();
        Assert.assertEquals(checkoutStepOnePage.setErrorMessageCheckoutLastName(), "Error: Last Name is required");
    }

    @Test
    public void OrderWithCorrectData() {
        loginPage.openPage()
        .login("standard_user", "secret_sauce")
        .addProductToCart("Sauce Labs Bike Light")
        .clickShoppingCartLink()
        .clickCheckoutButton()
        .setCheckoutFirstName("Vitaliy")
        .setCheckoutLastName("Vasilevich")
        .setZipPostalCode("12345")
        .clickContinueButton()
        .clickCheckoutFinishButton();
        Assert.assertEquals(checkoutCompletePage.getCheckoutCompleteTitleText(), "CHECKOUT: COMPLETE!");
    }
}
