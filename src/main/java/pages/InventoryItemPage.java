package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryItemPage extends BasePage {
    public InventoryItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='shopping_cart_link']")
    WebElement shoppingCartLink;

    public CartPage setCartPage() {
        shoppingCartLink.click();
        return new CartPage(driver);
    }
}
