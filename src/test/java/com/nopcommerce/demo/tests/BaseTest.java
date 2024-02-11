package com.nopcommerce.demo.tests;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
    public static WebDriver driver;
    HeaderPage headerPage;
    RegisterPage registerPage;
    LoginPage loginPage;
    ComputersPage computersPage;
    NotebooksPage notebooksPage;
    ProductPage productPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;


    @BeforeTest
    @Parameters({"browser"})
    public void setUp(String browser){
        switch (browser){
            case "chrome": driver = new ChromeDriver();break;
            case "edge": driver = new EdgeDriver();break;
            case "firefox": driver = new FirefoxDriver();break;
            default: driver = new ChromeDriver();
        }
        driver.get(Constants.BASE_URL);
        driver.manage().window().maximize();

        headerPage = new HeaderPage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        computersPage = new ComputersPage(driver);
        notebooksPage = new NotebooksPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }
    @AfterTest(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

}
