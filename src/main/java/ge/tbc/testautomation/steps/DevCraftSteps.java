package ge.tbc.testautomation.steps;

import ge.tbc.testautomation.data.Constants;
import ge.tbc.testautomation.pages.DevCraftPage;
import ge.tbc.testautomation.util.Helper;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class DevCraftSteps {
    private DevCraftPage devCraftPage;
    public DevCraftSteps() {
        this.devCraftPage = new DevCraftPage();
    }
    public DevCraftSteps CheckUITexts() {
        int uiIndex = -1, ultimateIndex = -1, completeIndex = -1;

        for (int i = 0; i < Constants.PACKAGE_COUNT; i++) {
            switch (devCraftPage.devCraftOffers.get(i).$(Constants.PACKAGE_NAME_SELECTOR).getText().trim()) {
                case Constants.DEVCRAFT_UI:
                    uiIndex = i;
                    break;
                case Constants.DEVCRAFT_COMPLETE:
                    completeIndex = i;
                    break;
                case Constants.DEVCRAFT_ULTIMATE:
                    ultimateIndex = i;
                    break;
                default:
                    throw new RuntimeException(Constants.ERROR_SEARCHING_PACKAGES);
            }
        }
        devCraftPage.devCraftOffers.get(uiIndex).shouldNotHave(text(Constants.MOCKING_SOLUTION));
        devCraftPage.devCraftOffers.get(ultimateIndex).shouldHave(text(Constants.REPORT_MANAGEMENT));


        devCraftPage.showDetailedBtn.scrollIntoView(Constants.SCROLL_INTO_CENTER).click();

        Helper.shouldSupport(Constants.ISSUE_ESCALATION, Constants.BULLET, ultimateIndex);
        // Helper.shouldSupport("Telerik Test Studio Dev Edition", Constants.BULLET, ultimateIndex);
        Helper.shouldSupport(Constants.KENDO_UI_JQUERY, Constants.BULLET, uiIndex, completeIndex, ultimateIndex);
        Helper.shouldSupport(Constants.REPORT_SERVER, Constants.REPORT_SERVER_USERS, ultimateIndex);
        Helper.shouldSupport(Constants.REPORTING, Constants.BULLET, completeIndex, ultimateIndex);
        Helper.shouldSupport(Constants.ON_DEMAND_VIDEOS, Constants.BULLET, uiIndex, completeIndex, ultimateIndex);
        return this;
    }
    public DevCraftSteps StickyHeaderCheck() {
        int firsScrollIntoY = $x(String.format(Constants.IN_TABLE_FINDER_XPATH,Constants.REPORTING, Constants.REPORTING))
                .scrollIntoView(Constants.SCROLL_INTO_CENTER).getLocation().getY();
        int stickyHeaderStartY = devCraftPage.stickyHeader.getLocation().getY();

        int secondScrollIntoY = $x(String.format(Constants.IN_TABLE_FINDER_XPATH,Constants.ISSUE_ESCALATION, Constants.ISSUE_ESCALATION))
                .scrollIntoView(Constants.SCROLL_INTO_CENTER).getLocation().getY();
        int stickyHeaderEndY = devCraftPage.stickyHeader.getLocation().getY();
        Assert.assertTrue(Math.abs((secondScrollIntoY-firsScrollIntoY)-(stickyHeaderEndY-stickyHeaderStartY))<10);
        return this;
    }
    public DevCraftSteps GoToIndividualProducts() {
        devCraftPage.individualProductsBtn.scrollIntoView(Constants.SCROLL_INTO_CENTER).click();
        return this;
    }
}
