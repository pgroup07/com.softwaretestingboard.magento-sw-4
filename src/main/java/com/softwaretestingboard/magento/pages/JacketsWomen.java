package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JacketsWomen extends Utility {
    By shortingJacket = By.xpath("(//select[@id='sorter'])[1]");
    By shortingJacketByPrice = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    By verifyAlphabeticalOrderList = By.xpath("//strong[@class='product name product-item-name']//a");

    By sortJacketsByPrice = By.xpath("//span[@class='price-wrapper ']//span");
    By sortJacketsByPrice1 = By.xpath("(//select[@id='sorter'])[1]");

    public List<String> jacketsNameListAfter = new ArrayList<>();
    public  List<Double> jacketsPriceListAfter = new ArrayList<>();

    public void sortByFilter(String option) {
        selectByVisibleTextFromDropDown(shortingJacket, option);
    }

    /**
     * This method use for Verify Sort By filter “Product Name”
     *
     * @param option
     */
    public List<String> sortingJacketsNamesInList(String option) throws InterruptedException {
        List<WebElement> jacketsElementsList = driver.findElements(verifyAlphabeticalOrderList);
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        selectByVisibleTextFromDropDown(shortingJacket, option);
        Thread.sleep(1000);
        // After Sorting value
        jacketsElementsList = driver.findElements(verifyAlphabeticalOrderList);
        // List<String> jacketsNameListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());
        }
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);

        return jacketsNameListBefore;

        // Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);
    }

    public List<Double> sortingJacketsByPrice(String option) throws InterruptedException {
        List<WebElement> jacketsPriceElementList = driver.findElements(sortJacketsByPrice);
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Select Sort By filter “Price”
        selectByVisibleTextFromDropDown(sortJacketsByPrice1, option);
        Thread.sleep(1000);
        // After Sorting Products by Price
        jacketsPriceElementList = driver.findElements(sortJacketsByPrice);
     //   List<Double> jacketsPriceListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);
        return jacketsPriceListBefore;

    }
}


