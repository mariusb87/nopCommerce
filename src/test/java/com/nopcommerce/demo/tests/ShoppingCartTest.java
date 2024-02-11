package com.nopcommerce.demo.tests;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.util.Constants;
import com.nopcommerce.demo.util.Utils;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest{
    @Test(priority = 1)
    @Parameters({"email","password","expectedConfirmation"})
    public void verifyAddToCartMessage(String email, String password, String expectedConfirmation){
        headerPage.clickLogin();
        Utils.sleep(2000);
        loginPage.doLogin(email, password);
        Utils.sleep(2000);
        headerPage.clickComputers();
        Utils.sleep(2000);
        computersPage.clickNotebooks();
        Utils.sleep(2000);
        notebooksPage.scrollToLenovoThinkpad();
        Utils.sleep(2000);
        notebooksPage.clickLenovoThinkpad();
        Utils.sleep(2000);
        productPage.setQuantity(Constants.NUMBER_OF_PRODUCTS);
        Utils.sleep(2000);
        productPage.clickAddToCartButton();
        Utils.sleep(3000);

        String actualConfirmation = productPage.getConfirmationMessage();
        Assert.assertEquals(actualConfirmation, expectedConfirmation);
        Utils.sleep(2000);
    }
    @Test(priority = 2)
    @Parameters({"expectedCartTitle","expectedProductName"})
    public void verifyShoppingCartContent(String expectedCartTitle, String expectedProductName){

        headerPage.clickShoppingCart();

        String actualTitle =cartPage.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedCartTitle));

        String actualProductName = cartPage.getProductName();
        Assert.assertTrue(actualProductName.contains(expectedProductName));
        Utils.sleep(2000);
    }
    @Test(priority = 3)
    @Parameters({"expectedCheckoutTitle"})
    public void verifyCheckout(String expectedCheckoutTitle){

        cartPage.checkAgreeTerms();
        Utils.sleep(2000);
        cartPage.clickCheckoutButton();
        Utils.sleep(2000);

        String actualResult = checkoutPage.getTitle();
        System.out.println(actualResult);

        Assert.assertTrue(actualResult.contains(expectedCheckoutTitle));
        Utils.sleep(2000);
    }
}
