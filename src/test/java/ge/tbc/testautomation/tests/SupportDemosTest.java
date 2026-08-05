package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.steps.SupportDemosSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SupportDemosTest extends BaseTest{
    SupportDemosSteps supportDemosSteps;
    @BeforeClass
    public void beforeClass() {
        supportDemosSteps = new SupportDemosSteps();
        supportDemosSteps.openPage();
    }

    @Test(priority = 1)
    public void CardsTest() {
        supportDemosSteps.HoverCardCheck()
                .KendoUICardCheck()
                .DesktopCardsCheck()
                .MobileCardsXamarinCheck();
    }

    @Test(priority = 2)
    public void HeaderTest() {
        supportDemosSteps.HeaderCheck()
                .HeaderAnchorsGetActive();
    }

}
