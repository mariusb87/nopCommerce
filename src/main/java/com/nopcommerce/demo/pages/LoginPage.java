package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static WebDriver driver;

    private final By locatorEmailInput = By.xpath("//input[@class='email']");
    private final By locatorPasswordInput = By.xpath("//input[@class='password']");
    private final By locatorLoginButton = By.xpath("//button[@class='button-1 login-button']");
    private final By locatorFailedLogin = By.xpath("//div[@class='message-error validation-summary-errors']");
    private final By locatorMyAccount = By.xpath("//a[@class='ico-account']");
    private final By locatorLogout = By.xpath("//a[@class='ico-logout']");

    public LoginPage(WebDriver driver) {this.driver = driver;}
    public void doLogin(String username, String password){
        driver.findElement(locatorEmailInput).sendKeys(username);
        driver.findElement(locatorPasswordInput).sendKeys(password);
        driver.findElement(locatorLoginButton).click();
    }
    public String getFailedLoginMessage(){
        return driver.findElement(locatorFailedLogin).getText();
    }
    public boolean isMyAccountDisplayed(){
        return driver.findElement(locatorMyAccount).isDisplayed();
    }
    public void clickLogout(){
        driver.findElement(locatorLogout).click();
    }

}
