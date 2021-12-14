package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutStepOnePage extends BasePage {
    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='first-name']")
    WebElement checkoutFirstName;
    @FindBy(xpath = "//*[@id='last-name']")
    WebElement checkoutLastName;
    @FindBy(xpath = "//*[@id='continue']")
    WebElement continueButton;
    @FindBy(xpath = "//*[@id='postal-code']")
    WebElement fieldZipPostalCode;
    @FindBy(xpath = "//*[@data-test='error']")
    WebElement errorMessageCheckout;

    public CheckoutStepOnePage setCheckoutFirstName(String name) {
        checkoutFirstName.sendKeys(name);
        return this;
    }

    public CheckoutStepTwoPage clickContinueButton() {
        continueButton.click();
        return new CheckoutStepTwoPage(driver);
    }

    public String setErrorMessageCheckoutLastName() {
        return errorMessageCheckout.getText();
    }

    public CheckoutStepOnePage setCheckoutLastName(String lastName) {
        checkoutLastName.sendKeys(lastName);
        return this;
    }

    public String getErrorMessageText() {
        return errorMessageCheckout.getText();
    }

    public CheckoutStepOnePage setZipPostalCode(String zipPostalCode) {
        fieldZipPostalCode.sendKeys(zipPostalCode);
        return this;
    }
}
