package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.data.OfferDataProvider;
import ge.tbc.testautomation.steps.swoop.MainSteps;
import ge.tbc.testautomation.steps.swoop.CategorySteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class ParametrizedSwoopTests extends  SwoopBase{
    private CategorySteps categorySteps;
    @BeforeClass
    public void beforeClass() {
        categorySteps = new CategorySteps();
    }

    @Test(priority = 1, dataProvider = "OfferDataProvider", dataProviderClass = OfferDataProvider.class)
    public void OffersTest(String id) {
        categorySteps.vlidateDiscount(id);
    }
}
