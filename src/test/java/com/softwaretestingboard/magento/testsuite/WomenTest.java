package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsWomen;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends BaseTest {
    HomePage homePage = new HomePage();
    JacketsWomen jacketsWomen = new JacketsWomen();


    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        homePage.clickOnWomenMenu();
        homePage.clickOnTopsMenu();
        homePage.clickOnJackets();
        Thread.sleep(1000);
        jacketsWomen.sortByFilter("Product Name ");
        // Verify is not done
        //  jacketsWomen.sortingJacketsNamesInList();
        List<String> jacketsNameListBefore = jacketsWomen.sortingJacketsNamesInList("Product Name");
        Assert.assertEquals(jacketsNameListBefore, jacketsWomen.jacketsNameListAfter);

    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        homePage.clickOnWomenMenu();
        homePage.clickOnTopsMenu();
        homePage.clickOnJackets();
        Thread.sleep(1000);
        jacketsWomen.sortByFilter("Price ");
        List<Double> jacketsNameListBefore = jacketsWomen.sortingJacketsByPrice("Price ");
        Assert.assertEquals(jacketsNameListBefore, jacketsWomen.jacketsPriceListAfter);

    }



}
