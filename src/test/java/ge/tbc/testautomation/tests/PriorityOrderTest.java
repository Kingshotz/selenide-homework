package ge.tbc.testautomation.tests;

import org.testng.annotations.Test;

public class PriorityOrderTest {
    @Test(priority = 2)
    public void validateImageSizes() {
        System.out.println("Test-2: image sizes validated!");
    }

    @Test(priority = 1)
    public void sortOffers() {
        System.out.println("test 1: offers sorted");
    }

    @Test(priority = 3)
    public void validateBurgerMenu() {
        System.out.println("test 3: burger menu validated");
    }
}
