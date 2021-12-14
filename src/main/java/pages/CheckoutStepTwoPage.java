package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutStepTwoPage extends BasePage {
    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='finish']")
    WebElement checkoutButton;


    public CheckoutCompletePage clickCheckoutFinishButton() {
        checkoutButton.click();
        return new CheckoutCompletePage(driver);
    }
}
