package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenTestPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {
    WomenTestPage womenTestPage = new WomenTestPage();

    @Test
    public void verifyTheSortByProductNameFilter() {
        //Mouse Hover on Women Menu
        womenTestPage.mouseHoverOnWomenMenu();

        //Mouse Hover on Tops
        womenTestPage.mouseHoverOnTops();

        //Click on Jackets
        womenTestPage.clickOnJackets();

        //Select Sort By filter “Product Name”
        womenTestPage.selectSortByFilter(1);

        //Verify the products name display in alphabetical order
        ArrayList<String> actualList = getArrayListOfStringsFromWebElements(womenTestPage.returnListOfProductNamesElementsLocator());
        ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(womenTestPage.returnListOfProductNamesElementsLocator());

        Collections.sort(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in alphabetical order");
    }

    @Test
    public void verifyTheSortByPriceFilter() {

        //Mouse Hover on Women Menu
        womenTestPage.mouseHoverOnWomenMenu();

        //Mouse Hover on Tops
        womenTestPage.mouseHoverOnTops();

        //Click on Jackets
        womenTestPage.clickOnJackets();

        //Select Sort By filter “Price”
        womenTestPage.selectSortByFilter(2);

        //Verify the products price display in Low to High
        List<WebElement> listOfWebElementActual = womenTestPage.returnListOfPriceElementsLocator();
        ArrayList<String> actualList = new ArrayList<>();
        for (WebElement element : listOfWebElementActual) {
            String s = element.getText();
            s = s.replaceAll("\\$", "");
            actualList.add(s);
        }

        List<WebElement> listOfWebElementExpected = womenTestPage.returnListOfPriceElementsLocator();
        ArrayList<String> expectedList= new ArrayList<>();
        for (WebElement element : listOfWebElementExpected) {
            String s = element.getText();
            s = s.replaceAll("\\$", "");
            expectedList.add(s);
        }

        Collections.sort(expectedList);

        Assert.assertEquals(actualList, expectedList, "Error message:products price is not display in Low to High");
    }
}


