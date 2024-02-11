package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.util.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private static WebDriver driver;
    private final By locatorTitle = By.xpath("//div[@class='page-title']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitle(){
        Utils.scrollToElement(driver,locatorTitle);
        return driver.findElement(locatorTitle).getText();}
}
