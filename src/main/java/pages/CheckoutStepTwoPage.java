package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepTwoPage extends BasePage{
    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);
    }

    private static final By CHECKOUT_2_FINISH_BUTTON = By.xpath("//*[@id='finish']");

    public void setCheckout2FinishButton(){
        driver.findElement(CHECKOUT_2_FINISH_BUTTON).click();
    }
}
