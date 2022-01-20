package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    private static final By CHECKOUT_BUTTON = By.xpath("//*[@id='checkout']");

    private static final String PRODUCT_PRICE = "//*[text()='%s']/ancestor::*[@class='cart_item']//*[@class='inventory_item_price']";

    public String getProductPrice(String productName) {
        return driver.findElement(By.xpath(String.format(PRODUCT_PRICE, productName))).getText();
    }

    public void clickCheckoutButton(){
        driver.findElement(CHECKOUT_BUTTON).click();
    }
}