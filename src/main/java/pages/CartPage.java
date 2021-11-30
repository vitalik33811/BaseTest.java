package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='checkout']")
    WebElement checkoutButton;
    private static final String PRODUCT_PRICE = "//*[text()='%s']/ancestor::*[@class='cart_item']//*[@class='inventory_item_price']";
    public static final String CART_URL = "/cart.html";

    public String getProductPrice(String productName) {
        return driver.findElement(By.xpath(String.format(PRODUCT_PRICE, productName))).getText();
    }

    public CheckoutStepOnePage setCheckoutButton() {
        checkoutButton.click();
        return new CheckoutStepOnePage(driver);
    }

    public CartPage openPage() {
        openPage(BASE_URL + CART_URL);
        waitForPageLoaded();
        return this;
    }
}