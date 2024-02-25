package Test_Cases.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages{
    public Pages(WebDriver driver) {
//        this.driver = driver;
        // Initialize elements using PageFactory
            PageFactory.initElements(driver, this);

    }
    @FindBy(id = "user-name")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;



    // Methods for interacting with the elements
    public void enterUsername(String username) {
        usernameInput.sendKeys("standard_user");
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys("secret_sauce");
    }

    public void clickLoginButton() {
        loginButton.click();
    }

}
