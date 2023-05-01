package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearTestPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    GearTestPage gearTestPage = new GearTestPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        //Mouse Hover on Gear Menu
        gearTestPage.mouseHoverOnGearMenu();

        //Click on Bags
        gearTestPage.clickOnBags();

        //Click on Product Name ‘Overnight Duffle’
        gearTestPage.clickOnProductName();

        //Verify the text ‘Overnight Duffle’
        String expectedProductName = "Overnight Duffle";
        String actualProductName = gearTestPage.getTextFromProductName();
        Assert.assertEquals(actualProductName, expectedProductName, "Error message: Product name is not matching");

        //Change Qty 3
        gearTestPage.clearAnElement();
        gearTestPage.changeQuantity("3");

        //Click on ‘Add to Cart’ Button.
        gearTestPage.clickOnAddToCart();

        //Verify the text‘You added Overnight Duffle to your shopping cart.’
        String expectedText = "You added Overnight Duffle to your shopping cart.";
        String actualText = gearTestPage.getTextFromAfterAddToCart();
        Assert.assertEquals(actualText, expectedText, "Error message: message is not matching");

        //Click on ‘shopping cart’ Link into message
        gearTestPage.clickOnShoppingCart();

        //Verify the product name ‘	Overnight Duffle’
        String expectedMessage = "Overnight Duffle";
        String actualMessage = gearTestPage.getTextFromOverNightDuffleBag();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message: message is not matching");

        //Verify the Qty is ‘3’
        String expectedQuantity = "3";
        String actualQuantity = gearTestPage.getTextFromTheEnteredQuantity();
        Assert.assertEquals(actualQuantity, expectedQuantity, "Error message: Quantity is not matching");

        //Verify the product price ‘$135.00’
        String expectedPrice = "$135.00";
        String actualPrice = gearTestPage.getTextFromProductPrice();
        Assert.assertEquals(actualPrice, expectedPrice, "Error message: Price is not matching");

        //Change Qty to ‘5’
        gearTestPage.clearAnElementFromUpdatedShoppingCart();
        gearTestPage.updateTheQuantity("5");

        //Click on ‘Update Shopping Cart’ button
        gearTestPage.updateShoppingCart();

        //Verify the product price ‘$225.00’
        String expectedUpdatedPrice = "$225.00";
        String actualUpdatedPrice = gearTestPage.getTextFromUpdatedProductPrice();
        Assert.assertEquals(actualUpdatedPrice, expectedUpdatedPrice, "Error message: Price is not matching");

    }

}
