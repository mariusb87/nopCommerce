package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComputersPage {
    private static WebDriver driver;

    private final By locatorNotebooks = By.xpath("//a[@title='Show products in category Notebooks'][normalize-space()='Notebooks']");

    public ComputersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNotebooks(){
        driver.findElement(locatorNotebooks).click();
    }
}
