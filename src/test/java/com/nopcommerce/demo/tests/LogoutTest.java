package com.nopcommerce.demo.tests;

import com.nopcommerce.demo.pages.HeaderPage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.util.Utils;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{
    @Test
    @Parameters({"email","password"})
    public void VerifyLogout(String email, String password){

        headerPage.clickLogin();
        loginPage.doLogin(email, password);
        Utils.sleep(2000);

        loginPage.clickLogout();

        Assert.assertTrue(headerPage.isRegisterDisplayed());
        Utils.sleep(1000);

    }
}
