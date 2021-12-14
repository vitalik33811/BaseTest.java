package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends BaseTest {

    @Test
    public void emptyFieldsLoginPageTest() {
        loginPage.openPage()
        .login("", "");
    }

    @Test
    public void fillInOneFieldTest() {
        loginPage.openPage()
        .login("standard_user", "");
    }

    @Test
    public void fillInTheFieldsTest() {
        loginPage.openPage()
        .login("standard_user", "secret_sauce");
    }

    @Test
    public void fillInOneFieldErrorMessageTest() {
        loginPage.openPage()
        .login("standard_user", "");
        Assert.assertEquals(loginPage.errorMessagePassword(), "Epic sadface: Password is required");
    }

    @Test
    public void emptyFieldsLoginErrorMessageTest() {
        loginPage.openPage()
        .login("", "secret_sauce");
        Assert.assertEquals(loginPage.errorMessagePassword(), "Epic sadface: Username is required");
    }
}

