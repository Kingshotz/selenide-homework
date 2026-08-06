package ge.tbc.testautomation.tests;

import com.codeborne.selenide.*;
import ge.tbc.testautomation.data.Constants;
import ge.tbc.testautomation.steps.DevCraftSteps;
import ge.tbc.testautomation.steps.IndividualOffersSteps;
import ge.tbc.testautomation.steps.MainPageSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class TelerikTest {
    DevCraftSteps devCraftSteps;
    IndividualOffersSteps individualOffersSteps;
    MainPageSteps mainPageSteps;
    @BeforeClass
    public void beforeClass() {
        Configuration.browser = Constants.BROWSER;
        Configuration.browserSize = Constants.BROWSER_SIZE;
//        Configuration.holdBrowserOpen = true;
        open(Constants.URL);
        mainPageSteps = new MainPageSteps();
        devCraftSteps = new DevCraftSteps();
        individualOffersSteps = new IndividualOffersSteps();
    }

    @Test(priority = 1)
    public void validateBundleOffers() {
        mainPageSteps.ClickPricing();
        devCraftSteps
                .CheckUITexts().
                StickyHeaderCheck()
                .GoToIndividualProducts();

    }
    @Test(priority = 2)
    public void validateIndividualOffers() {
        individualOffersSteps.CheckUITexts();
    }
}
