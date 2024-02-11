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
        loginPage.doLogin(email, password);
        headerPage.clickComputers();
        computersPage.clickNotebooks();
        notebooksPage.clickLenovoThinkpad();
        Utils.sleep(2000);
        productPage.setQuantity(Constants.NUMBER_OF_PRODUCTS);
        productPage.clickAddToCartButton();
        Utils.sleep(2000);

        String actualConfirmation = productPage.getConfirmationMessage();
        Assert.assertEquals(actualConfirmation, expectedConfirmation);

    }
    @Test(priority = 2)
    @Parameters({"email","password","expectedTitle","expectedProductName"})
    public void verifyShoppingCartContent(String email, String password, String expectedTitle, String expectedProductName){

        productPage.clickCloseConfirmationButton();
        Utils.sleep(2000);
        headerPage.clickShoppingCart();

        String actualTitle =cartPage.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        String actualProductName = cartPage.getProductName();
        Assert.assertTrue(actualProductName.contains(expectedProductName));

    }
    @Test(priority = 3)
    @Parameters({"email","password", "expectedCheckout"})
    public void verifyCheckout(String email, String password, String expectedCheckout){

        cartPage.checkAgreeTerms();
        cartPage.clickCheckoutButton();
        String actualResult = checkoutPage.getTitle();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains(expectedCheckout));

    }

}
