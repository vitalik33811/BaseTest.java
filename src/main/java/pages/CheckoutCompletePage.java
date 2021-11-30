package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage{
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class='title']")
    WebElement checkoutCompleteTitle;

    public String setCheckoutCompleteTitle(){
       return checkoutCompleteTitle.getText();
    }
}
