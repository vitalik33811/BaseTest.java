package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutStepTwoPage extends BasePage {
    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='finish']")
    WebElement checkoutTwoFinishButton;


    public CheckoutCompletePage setCheckout2FinishButton() {
        checkoutTwoFinishButton.click();
        return new CheckoutCompletePage(driver);
    }
}
