package com.nopcommerce.demo.tests;

import com.nopcommerce.demo.util.Constants;
import com.nopcommerce.demo.util.Utils;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CurrencyTest extends BaseTest{
    @Test
    @Parameters({"expectedCurrency"})
    public void verifyChangeCurrency(String expectedCurrency){

        headerPage.clickComputers();
        Utils.sleep(2000);
        computersPage.clickNotebooks();
        Utils.sleep(2000);
        headerPage.selectCurrency(Constants.CURRENCY_EURO);
        Utils.sleep(2000);
        notebooksPage.scrollToLenovoThinkpad();
        Utils.sleep(2000);

        for (int i=0; i<notebooksPage.getNumberOfProducts(); i++ ){
            String actualPrice = notebooksPage.getPrice(i);
            System.out.println(actualPrice);
            Assert.assertTrue(actualPrice.contains(expectedCurrency));
        }
        Utils.sleep(2000);
    }
}
