package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NotebooksPage {
    private static WebDriver driver;
    private final By locatorTitle = By.xpath("//div[@class='page-title']");
    private final By locatorPrices = By.xpath("//span[@class='price actual-price']");
    private final By locatorLenovoThinkpad = By.xpath(
            "//h2[@class='product-title']//a[contains(text(),'Lenovo Thinkpad X1 Carbon Laptop')]");
    public NotebooksPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitle(){return driver.findElement(locatorTitle).getText();}
    public String getPrices(int index){
        List<WebElement> listOfElements = driver.findElements(locatorPrices);
        return listOfElements.get(index).getText();
    }
    public int getNumberOfProducts(){
        List<WebElement> listOfElements = driver.findElements(locatorPrices);
        return listOfElements.size();
    }
    public void clickLenovoThinkpad(){
        driver.findElement(locatorLenovoThinkpad).click();
    }
}
