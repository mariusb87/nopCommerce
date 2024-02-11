package com.nopcommerce.demo.tests;

import com.nopcommerce.demo.pages.HeaderPage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.util.Constants;
import com.nopcommerce.demo.util.Utils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    @Parameters({"email","password", "testType","expectedResult"})
    public void verifyLogin(String email, String password, String testType, String expectedResult){

        headerPage.clickLogin();
        loginPage.doLogin(email, password);

        Utils.sleep(2000);

        switch (testType){
            case "correctCorrect":
                Assert.assertTrue(loginPage.isMyAccountDisplayed());
                Utils.sleep(1000);
                break;
            case "wrongCorrect":
                Assert.assertTrue(loginPage.getFailedLoginMessage().contains(expectedResult));
                Utils.sleep(1000);
                break;
            case "correctWrong":
                Assert.assertTrue(loginPage.getFailedLoginMessage().contains(expectedResult));
                Utils.sleep(1000);
                break;
        }
    }

}
