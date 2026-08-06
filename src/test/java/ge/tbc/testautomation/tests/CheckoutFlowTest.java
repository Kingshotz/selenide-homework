package ge.tbc.testautomation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CheckoutFlowTest {
    private final Random random = new Random();

    @Test
    public void addToCartTest() {
        boolean itemAdded = random.nextBoolean();
        Assert.assertTrue(itemAdded, "Item was not added to cart");
    }

    // Runs only if addToCartTest passes; skipped (not failed) if it doesn't.
    @Test(dependsOnMethods = "addToCartTest")
    public void proceedToCheckoutTest() {
        boolean checkout = random.nextBoolean();
        Assert.assertTrue(checkout, "Checkout was not successful");
    }

    // Runs only if proceedToCheckoutTest passes.
    @Test(dependsOnMethods = "proceedToCheckoutTest")
    public void makePaymentTest() {
        boolean paymentMade = random.nextBoolean();
        Assert.assertTrue(paymentMade, "Payment was not successful");
    }
}
