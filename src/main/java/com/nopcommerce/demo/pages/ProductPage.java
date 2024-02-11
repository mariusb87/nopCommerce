package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.util.Constants;
import com.nopcommerce.demo.util.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    private static WebDriver driver;
    private final By locatorTitle = By.xpath("//div[@class='product-name']");
    private final By locatorConfirmationMessage = By.xpath("//p[@class='content']");
    private final By locatorCloseConfirmationButton = By.xpath("//span[@title='Close']");
    private final By locatorQuantity = By.xpath("//input[@id='product_enteredQuantity_9']");
    private final By locatorAddToCartButton = By.xpath("//button[@id='add-to-cart-button-9']");
    private final By locatorAddToWishlistButton = By.xpath("//button[@id='add-to-wishlist-button-9']");
    private final By locatorAddToCompareButton = By.xpath("//div[@class='compare-products']");
    private final By locatorEmailAFriendButton = By.xpath("//button[@class='button-2 email-a-friend-button']']");
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitle(){
        return driver.findElement(locatorTitle).getText();
    }
    public String getConfirmationMessage(){return driver.findElement(locatorConfirmationMessage).getText();}
    public void clickCloseConfirmationButton(){
        driver.findElement(locatorCloseConfirmationButton).click();
    }
    public void setQuantity(String quantity){
        driver.findElement(locatorQuantity).clear();
        driver.findElement(locatorQuantity).sendKeys(quantity);
    }
    public void clickAddToCartButton(){
        driver.findElement(locatorAddToCartButton).click();
    }
    public void clickAddToWishlist(){
        driver.findElement(locatorAddToWishlistButton).click();
    }
    public void clickAddToCompare(){
        driver.findElement(locatorAddToCompareButton).click();
    }
    public void clickEmailAFriend(){
        driver.findElement(locatorEmailAFriendButton).click();
    }

}
