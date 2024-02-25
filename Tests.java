package Test_Cases.Test;

import Test_Cases.Base.BasePage;
import Test_Cases.Page.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.annotation.Priority;

public class Tests {
    private WebDriver driver;
    private BasePage basePage;
    private Pages loginPage;





    @BeforeClass
    public void setUp() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        basePage = new BasePage(driver);
        loginPage = new Pages(driver);

        // Navigate to the login page
        driver.get("https://www.saucedemo.com/v1");
    }

    @Test
    public void testLogin() {
//
        // Perform login actions
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();

        // Add assertions to verify the login is successful
        // For example: Assert.assertTrue(homePage.isHomePageDisplayed());
    }


    //    @AfterClass
//    public void tearDown() {
//        // Close the WebDriver
//        driver.quit();
    }


