package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomenTestPage extends Utility {

    By womenMenu = By.cssSelector("#ui-id-4");
    By topsMenu = By.cssSelector("#ui-id-9");
    By jackets = By.cssSelector("#ui-id-11");
    By dropDownList = By.xpath("//select[@id='sorter']");
    By productNameElements = By.xpath("//div[@class='product details product-item-details']//strong[@class='product name product-item-name']");
    By priceElements = By.xpath("//div[@class='product details product-item-details']//div[@class='price-box price-final_price']//span[@class='price']");

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(topsMenu);
    }

    public void clickOnJackets() {
        clickOnElement(jackets);
    }

    public void selectSortByFilter(int index) {
        selectFromDropDownByIndex(dropDownList, index);
    }

    public List<WebElement> returnListOfProductNamesElementsLocator() {
        List<WebElement> listOfElements = driver.findElements(productNameElements);
        return listOfElements;
    }

    public List<WebElement> returnListOfPriceElementsLocator(){
        List<WebElement> listOfElements = driver.findElements(priceElements);
        return listOfElements;
    }


}
