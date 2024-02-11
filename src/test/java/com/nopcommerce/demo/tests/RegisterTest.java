package com.nopcommerce.demo.tests;

import com.nopcommerce.demo.pages.HeaderPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.util.Constants;
import com.nopcommerce.demo.util.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{
    @Test
    @Parameters({"gender", "firstName","lastName", "day", "month", "year", "email", "company", "password", "confirmPassword", "expectedResult"})
    public void verifyRegister(String gender, String firstName, String lastName, String day, String month,
                         String year, String email, String company, String password, String confirmPassword, String expectedResult){

        headerPage.clickRegister();

        registerPage.selectGender(gender);
        registerPage.setFirstName(firstName);
        registerPage.setLastName(lastName);
        registerPage.selectDateOfBirth(day,month,year);
        registerPage.setEmail(email);
        registerPage.setCompany(company);
        registerPage.checkNewsletter();
        registerPage.setPassword(password);
        registerPage.setConfirmPassword(confirmPassword);
        registerPage.clickRegister();

        Assert.assertEquals(registerPage.getActualResult(), expectedResult);

        Utils.sleep(3000);

    }

}
