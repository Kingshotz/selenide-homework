package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.steps.DevCraftProductsSteps;
import jdk.jfr.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Description("MSP-T32")
public class RemovingFromOrderTest extends BaseTest{
    private DevCraftProductsSteps devCraftProductsSteps;

    @BeforeClass
    public void beforeClass() {
        devCraftProductsSteps = new DevCraftProductsSteps();
    }

    @Test(priority = 1)
    public void DevCraftBuyUltimate() {
        devCraftProductsSteps.OpenPage()
                .PurchaseUltimate();
    }
}