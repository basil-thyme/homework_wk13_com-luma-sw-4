package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GearTestPage extends Utility {
    By gearMenu = By.cssSelector("#ui-id-6");
    By bags = By.cssSelector("#ui-id-25");
    By overNightDuffle = By.xpath("//img[@alt='Overnight Duffle']");
    By VerifyProductNameText = By.xpath("//span[@class='base']");
    By enterQuantity = By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//span[normalize-space()='Add to Cart']");
    By verifyTextAddToCartText = By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By VerifyOverNightDuffleText = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By actualQtyText = By.cssSelector(".input-text.qty");
    By productPriceText = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By qtyInShoppingCart = By.cssSelector(".input-text.qty");
    By updatedPriceElementText = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() {
        clickOnElement(bags);
    }

    public void clickOnProductName() {
        clickOnElement(overNightDuffle);
    }

    public String getTextFromProductName() {
        return driver.findElement(VerifyProductNameText).getText();
    }

    public void changeQuantity(String qty) {
        sendTextToElement(enterQuantity, qty);
    }

    public WebElement clearAnElement() {
        WebElement element = driver.findElement(enterQuantity);
        element.clear();
        return element;
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);

    }
    public String getTextFromAfterAddToCart(){
        return driver.findElement(verifyTextAddToCartText).getText();
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);

    }
    public String getTextFromOverNightDuffleBag() {
        return driver.findElement(VerifyOverNightDuffleText).getText();
    }

    public String getTextFromTheEnteredQuantity(){
        return driver.findElement(actualQtyText).getAttribute("value");
    }

    public String getTextFromProductPrice(){
        return driver.findElement(productPriceText).getText();
    }

    public void updateShoppingCart(){
        clickOnElement(updateShoppingCart);
    }

    public void updateTheQuantity(String qty) {
        sendTextToElement(qtyInShoppingCart, qty);
    }

    public WebElement clearAnElementFromUpdatedShoppingCart() {
        WebElement element = driver.findElement(qtyInShoppingCart);
        element.clear();
        return element;
    }
    public String getTextFromUpdatedProductPrice(){
        return driver.findElement(updatedPriceElementText).getText();
    }

}
