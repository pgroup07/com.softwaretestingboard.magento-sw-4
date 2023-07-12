package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BottomsMenPants;
import com.softwaretestingboard.magento.pages.CronusYogaPant;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    BottomsMenPants bottomsMenPants = new BottomsMenPants();
    CronusYogaPant cronusYogaPant=new CronusYogaPant();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homePage.clickOnMenMenu();
        homePage.clickOnBottoms();
        homePage.clickOnPants();
        bottomsMenPants.pantSize();
        bottomsMenPants.pantColour();
        bottomsMenPants.addToCart();
        Assert.assertEquals(bottomsMenPants.verifyAddedItemToTheShoppingCart(),"You added Cronus Yoga Pant to your shopping cart.");
        bottomsMenPants.clickOnShoppingCartInMessage();

    }
}
