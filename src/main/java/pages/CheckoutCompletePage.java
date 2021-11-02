package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends BasePage{
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }
    private static final By CHECKOUT_COMPLETE_TITLE = By.xpath("//*[@class='title']");

    public String setCheckoutCompleteTitle(){
       return driver.findElement(CHECKOUT_COMPLETE_TITLE).getText();
    }
}
