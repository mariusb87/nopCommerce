package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HeaderPage {
    private static WebDriver driver;

    private final By locatorCurrency = By.xpath("//select[@id='customerCurrency']");
    private final By locatorRegister = By.xpath("//a[@class='ico-register']");
    private final By locatorLogin = By.xpath("//a[@class='ico-login']");
    private final By locatorWishlist = By.xpath("//span[@class='wishlist-label']");
    private  final By locatorShoppingCart = By.xpath("//span[@class='cart-label']");
    private final By locatorSearchInput = By.xpath("//input[@id='small-searchterms']");
    private final By locatorSearchButton = By.xpath("//button[@type='submit']");
    private final By locatorComputersButton = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");

    public HeaderPage(WebDriver driver) {

        this.driver = driver;
    }

    public  void selectCurrency (String selectedCurrency){
        WebElement currency = driver.findElement(locatorCurrency);
        Select dropdownElement = new Select(currency);
        dropdownElement.selectByVisibleText(selectedCurrency);
    }
    public boolean isRegisterDisplayed(){return driver.findElement(locatorRegister).isDisplayed();}
    public void clickRegister(){
        driver.findElement(locatorRegister).click();
    }
    public void clickLogin(){driver.findElement(locatorLogin).click();}
    public void clickWishlist(){
        driver.findElement(locatorWishlist).click();
    }
    public void clickShoppingCart(){
        driver.findElement(locatorShoppingCart).click();
    }
    public void searchProduct(String product){
        driver.findElement(locatorSearchInput).sendKeys(product);
        driver.findElement(locatorSearchButton).click();
    }
    public void clickComputers(){
        driver.findElement(locatorComputersButton).click();
    }

}
