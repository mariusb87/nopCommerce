package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private static WebDriver driver;

    private final By locatorMale = By.xpath("//input[@type='radio'][@value='M']");
    private final By locatorFemale = By.xpath("//input[@type='radio'][@value='F']");
    private final By locatorFirstName = By.xpath("//input[@id='FirstName']");
    private final By locatorLastName = By.xpath("//input[@id='LastName']");
    private final By locatorDayOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    private final By locatorMonthOfBirth = By.xpath("//select[@name='DateOfBirthMonth']");
    private final By locatorYearOfBirth = By.xpath("//select[@name='DateOfBirthYear']");
    private final By locatorEmail = By.xpath("//input[@id='Email']");
    private final By locatorCompany = By.xpath("//input[@id='Company']");
    private final By locatorNewsletterCheckbox = By.xpath("//input[@id='Newsletter']");
    private final By locatorPassword = By.xpath("//input[@id='Password']");
    private final By locatorConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    private final By locatorRegisterButton = By.xpath("//button[@id='register-button']");
    private final By locatorActualResult = By.xpath("//div[@class='message-error validation-summary-errors']");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectGender(String gender){
        if (gender.toLowerCase().startsWith("m")){
                    driver.findElement(locatorMale).click();
        }else if (gender.toLowerCase().startsWith("f")){
                    driver.findElement(locatorFemale).click();
        }
    }

    public void setFirstName(String firstName){
        driver.findElement(locatorFirstName).sendKeys(firstName);
    }
    public void setLastName(String lastName){
        driver.findElement(locatorLastName).sendKeys(lastName);
    }

    public void selectDateOfBirth(String day, String month, String year){
        WebElement dropdownDay = driver.findElement(locatorDayOfBirth);
        Select dropdownElement1 = new Select(dropdownDay);
        dropdownElement1.selectByValue(day);

        WebElement dropdownMonth = driver.findElement(locatorMonthOfBirth);
        Select dropdownElement2 = new Select(dropdownMonth);
        dropdownElement2.selectByValue(month);

        WebElement dropdownYear= driver.findElement(locatorYearOfBirth);
        Select dropdownElement3 = new Select(dropdownYear);
        dropdownElement3.selectByValue(year);
    }

    public void setEmail(String email){
        driver.findElement(locatorEmail).sendKeys(email);
    }
    public void setCompany(String company){
        driver.findElement(locatorCompany).sendKeys(company);
    }
    public void checkNewsletter(){
        driver.findElement(locatorNewsletterCheckbox).click();
    }
    public void setPassword(String password){
        driver.findElement(locatorPassword).sendKeys(password);
    }
    public void setConfirmPassword(String confirmPassword){
        driver.findElement(locatorConfirmPassword).sendKeys(confirmPassword);
    }
    public void clickRegister(){
        driver.findElement(locatorRegisterButton).click();
    }
    public String getActualResult(){
        return driver.findElement(locatorActualResult).getText();
    }

}
