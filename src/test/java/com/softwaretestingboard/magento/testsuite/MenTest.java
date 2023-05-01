package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenTestPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    MenTestPage menTestPage = new MenTestPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {

        //Mouse Hover on Men Menu
        menTestPage.mouseHoverOnMenMenu();

        //Mouse Hover on Bottoms
        menTestPage.mouseHoverOnBottomMenu();

        //Click on Pants
        menTestPage.clickOnPants();

        //Mouse Hover on product name Cronus Yoga Pant’ and click on size 32.
        menTestPage.mouseHoverAndClickOnProductSize();

        //Mouse Hover on product name @Cronus Yoga Pant’ and click on colour Black.
        menTestPage.mouseHoverAndClickOnProductColour();

        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
        menTestPage.clickOnAddToCartButton();

        //Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedMessage = "You added Cronus Yoga Pant to your shopping cart.";

        String actualMessage = menTestPage.getTextForVerification();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message:texts are not matching");

        //Click on ‘shopping cart’ Link into message
        menTestPage.clickOnShoppingCart();

        //Verify the text ‘Shopping Cart.’
        String expectedMessageShoppingCart = "Shopping Cart";
        String actualMessageShoppingCart = menTestPage.getTextFromShoppingCart();
        Assert.assertEquals(actualMessageShoppingCart, expectedMessageShoppingCart, "Error message: ShoppingCart text is not matching");

        // Verify the product name ‘Cronus Yoga Pant’
        String expectedMessageProductName = "Cronus Yoga Pant";
        String actualMessageProductName = menTestPage.getTextFromProductName();
        Assert.assertEquals(actualMessageProductName, expectedMessageProductName, "Error message: productName text is not matching");

        // Verify the product size ‘32’
        String expectedSize = "32";
        String actualSize = menTestPage.getTextFromProductSize();
        Assert.assertEquals(actualSize, expectedSize, "Error message: productSize text is not matching");

        //Verify the product colour ‘Black’
        String expectedColour = "Black";
        String actualColour = menTestPage.getTextFromProductColour();
        Assert.assertEquals(actualColour, expectedColour, "Error message: productColour text is not matching");

    }


}
