package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryItemPage extends BasePage{

    public InventoryItemPage(WebDriver driver) {
        super(driver);
    }
    private static final By CART_PAGE = By.xpath("//*[@class='shopping_cart_link']");

    public void setCartPage() {
        driver.findElement(CART_PAGE).click();
    }
}
