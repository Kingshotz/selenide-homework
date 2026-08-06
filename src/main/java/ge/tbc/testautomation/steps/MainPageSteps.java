package ge.tbc.testautomation.steps;

import ge.tbc.testautomation.pages.DevCraftPage;
import ge.tbc.testautomation.pages.MainPage;

public class MainPageSteps {
    private MainPage mainPage;

    public MainPageSteps() {
        this.mainPage = new MainPage();
    }

    public MainPageSteps ClickPricing() {
        mainPage.pricingBtn.click();
        return this;
    }
}
