package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends BasePage{
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class='title']")
    WebElement checkoutCompleteTitle;

    public String getCheckoutCompleteTitleText(){
       return driver.findElement(CHECKOUT_COMPLETE_TITLE).getText();
    }
}
