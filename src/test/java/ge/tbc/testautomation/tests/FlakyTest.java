package ge.tbc.testautomation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class FlakyTest {
    private final Random random = new Random();
    @Test(invocationCount = 5, successPercentage = 60)
    public void testFlakyDiscountCode() {
        boolean discountApplied =  random.nextInt(10) < 8;
        Assert.assertTrue(discountApplied, "Discount code was not applied successfully");
    }
}
