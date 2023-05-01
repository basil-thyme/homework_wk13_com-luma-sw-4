package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenTestPage extends Utility {
    By menMenu = By.cssSelector("#ui-id-5");
    By bottomMenu = By.cssSelector("#ui-id-18");
    By pants = By.cssSelector("#ui-id-23");
    By cronusYogaPant = By.cssSelector("img[alt='Cronus Yoga Pant ']");
    By size32 = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By colourBlack = By.cssSelector("#option-label-color-93-item-49");
    By addToCart = By.xpath("//div[@class='actions-primary']//span[text()='Add to Cart'][1]");
    By verifyText = By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By shoppingCartText = By.xpath("//span[@class='base' and text()='Shopping Cart']");
    By productNameText = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By productSizeText = By.xpath("//dd[contains(text(),'32')]");
    By productColorText = By.xpath("//dd[contains(text(),'Black')]");

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottomMenu() {
        mouseHoverToElement(bottomMenu);
    }

    public void clickOnPants() {
        clickOnElement(pants);
    }

    public void mouseHoverOnProductName() {
        mouseHoverToElement(cronusYogaPant);
    }

    public void mouseHoverAndClickOnProductSize() {
        mouseHoverToElementAndClick(size32);
    }

    public void mouseHoverAndClickOnProductColour() {
        mouseHoverToElementAndClick(colourBlack);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCartLink);
    }

    public String getTextForVerification() {
        return driver.findElement(verifyText).getText();
    }

    public String getTextFromShoppingCart() {
        return driver.findElement(shoppingCartText).getText();
    }

    public String getTextFromProductName() {
        return driver.findElement(productNameText).getText();
    }

    public String getTextFromProductSize() {
        return driver.findElement(productSizeText).getText();
    }

    public String getTextFromProductColour() {
        return driver.findElement(productColorText).getText();
    }
}





