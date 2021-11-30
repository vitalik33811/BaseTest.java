package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory extends BasePage{

   public LoginPageFactory(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id='user-name']")
    WebElement userNameInput;
    @FindBy(xpath = "//*[@id='password']")
    WebElement passwordInput;
    @FindBy(xpath = "//*[@id='login-button']")
    WebElement loginButton;
    @FindBy(xpath = "//*[@class='bot_column']")
    WebElement botLogo;

    public void login(String username, String password) {
        waitForElementLocated(userNameInput, 10);
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void waitForPageOpenedExample() {
        waitForElementLocated(botLogo, 10);
    }

    public void typeTextInFrames() {
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        driver.findElement(By.id("tinymce")).sendKeys("asdsd");
        driver.switchTo().defaultContent();
    }

    public String errorMessagePassword() {
        return driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
    }

    public String errorMessageEmptyFields() {
        return driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/text()")).getText();
    }
}
