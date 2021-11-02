package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepOnePage extends BasePage {
    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);
    }

    private static final By CHECKOUT_FIRST_NAME = By.xpath("//*[@id='first-name']");
    private static final By CHECKOUT_LAST_NAME = By.xpath("//*[@id='last-name']");
    private static final By CONTINUE_BUTTON = By.xpath("//*[@id='continue']");
    private static final By ZIP_POSTAL_CODE = By.xpath("//*[@id='postal-code']");
    private static final By ERROR_MESSAGE_CHECKOUT = By.xpath("//*[@data-test='error']");

    public void setCheckoutFirstName(String name) {
        driver.findElement(CHECKOUT_FIRST_NAME).sendKeys(name);
    }

    public void setContinueButton() {
        driver.findElement(CONTINUE_BUTTON).click();
    }

    public String setErrorMessageCheckoutLastName() {
        return driver.findElement(ERROR_MESSAGE_CHECKOUT).getText();
    }

    public void setCheckoutLastName(String lastName) {
        driver.findElement(CHECKOUT_LAST_NAME).sendKeys(lastName);
    }

    public String setErrorMessageCheckoutFirstName() {
        return driver.findElement(ERROR_MESSAGE_CHECKOUT).getText();
    }
    public void setZipPostalCode(String zipPostalCode){
        driver.findElement(ZIP_POSTAL_CODE).sendKeys(zipPostalCode);
    }
}
