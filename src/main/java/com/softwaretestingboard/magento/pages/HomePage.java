package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By mouseHoverWomen = By.xpath("//span[normalize-space()='Women']");
    By mouseHoverTops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");

    By clickJackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");


    By clickMenMenu = By.xpath("//span[normalize-space()='Men']");
    By clickOnBottomsMenu = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By clickPants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By clickOnBags = By.xpath("//span[normalize-space()='Bags']");


    public void clickOnWomenMenu() {
        mouseHoverToElement(mouseHoverWomen);
    }

    public void clickOnTopsMenu() {
        mouseHoverToElement(mouseHoverTops);
    }

    public void clickOnJackets() {
        mouseHoverToElementAndClick(clickJackets);
    }

    /**
     * This method use for   Mouse Hover on element
     */
    public void clickOnMenMenu() {
        mouseHoverToElement(clickMenMenu);
    }

    /**
     * This method use for  Mouse Hover and click on element
     */
    public void clickOnBottoms() {
        mouseHoverToElement(clickOnBottomsMenu);
    }

    /**
     * This method use for click on Pant
     */
    public void clickOnPants() {
        clickOnElement(clickPants);
    }

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() {

        clickOnElement(clickOnBags);
    }


}
