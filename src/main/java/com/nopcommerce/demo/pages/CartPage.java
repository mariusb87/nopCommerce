package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private static WebDriver driver;
    private final By locatorTitle = By.xpath("//div[@class='page-title']");
    private final By locatorProductName = By.xpath("//a[@class='product-name']");
    private final By locatorProductPrice = By.xpath("//span[@class='product-unit-price']");
    private final By locatorProductQuantity = By.xpath("//input[@id='itemquantity11221']");
    private final By locatorTotalPrice= By.xpath("//span[@class='product-subtotal']");
    private final By locatorProductRemove= By.xpath("//button[@class='remove-btn']");
    private final By locatorEmptyMessage = By.xpath("//div[@class='no-data']");
    private final By locatorAgreeTerms = By.xpath("//input[@id='termsofservice']");
    private final By locatorCheckoutButton = By.xpath("//button[@id='checkout']");

    public CartPage(WebDriver driver) {this.driver = driver;}
    public String getTitle(){return driver.findElement(locatorTitle).getText();}
    public String getEmptyMessage(){return driver.findElement(locatorEmptyMessage).getText();}
    public String getProductName(){return driver.findElement(locatorProductName).getText();}
    public String getProductPrice(){return driver.findElement(locatorProductPrice).getText();}
    public String getProductQuantity(){return driver.findElement(locatorProductQuantity).getText();}
    public String getTotalPrice(){return driver.findElement(locatorTotalPrice).getText();}
    public void clickRemove(){driver.findElement(locatorProductRemove).click();}
    public void checkAgreeTerms(){driver.findElement(locatorAgreeTerms).click();}
    public void clickCheckoutButton(){driver.findElement(locatorCheckoutButton).click();}

}
