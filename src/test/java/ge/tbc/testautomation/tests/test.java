package ge.tbc.testautomation.tests;

import com.codeborne.selenide.*;
import com.codeborne.selenide.selector.ByTagAndText;
import ge.tbc.testautomation.Constants;
import ge.tbc.testautomation.Helper;
import org.checkerframework.checker.guieffect.qual.UI;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.ElementsCollection;

import java.io.File;
import java.util.Random;

public class test {
    @BeforeClass
    public void beforeClass() {
        Configuration.browser = Constants.BROWSER;
        Configuration.browserSize = Constants.BROWSER_SIZE;
//        Configuration.holdBrowserOpen = true;
        open(Constants.URL);
    }

    @Test(priority = 1)
    public void validateBundleOffers() {
        SelenideElement pricingBtn = $(byTagAndText("a", Constants.PRICING));
        pricingBtn.click();

        ElementsCollection devCraftOffers = $(Constants.DEVCRAFT_OFFERS_SELECTOR)
                .$$(Constants.PURCHASE_CELL_SELECTOR);

        int uiIndex = -1, ultimateIndex = -1, completeIndex = -1;

        for (int i = 0; i < Constants.PACKAGE_COUNT; i++) {
            switch (devCraftOffers.get(i).$(Constants.PACKAGE_NAME_SELECTOR).getText().trim()) {
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

        devCraftOffers.get(uiIndex).shouldNotHave(text(Constants.MOCKING_SOLUTION));
        devCraftOffers.get(ultimateIndex).shouldHave(text(Constants.REPORT_MANAGEMENT));

        SelenideElement showDetailedBtn = $(withText(Constants.DETAILED_COMPARISON))
                .scrollIntoView(Constants.SCROLL_INTO_CENTER);
        showDetailedBtn.click();

        Helper.shouldSupport(Constants.ISSUE_ESCALATION, Constants.BULLET, ultimateIndex);
        // Helper.shouldSupport("Telerik Test Studio Dev Edition", Constants.BULLET, ultimateIndex);
        Helper.shouldSupport(Constants.KENDO_UI_JQUERY, Constants.BULLET, uiIndex, completeIndex, ultimateIndex);
        Helper.shouldSupport(Constants.REPORT_SERVER, Constants.REPORT_SERVER_USERS, ultimateIndex);
        Helper.shouldSupport(Constants.REPORTING, Constants.BULLET, completeIndex, ultimateIndex);
        Helper.shouldSupport(Constants.ON_DEMAND_VIDEOS, Constants.BULLET, uiIndex, completeIndex, ultimateIndex);

        SelenideElement stickyHeader = $(Constants.STICKY_HEADER_SELECTOR);

        int firsScrollIntoY = $x(String.format(Constants.IN_TABLE_FINDER_XPATH,Constants.REPORTING, Constants.REPORTING))
                .scrollIntoView(Constants.SCROLL_INTO_CENTER).getLocation().getY();
        int stickyHeaderStartY = stickyHeader.getLocation().getY();

        int secondScrollIntoY = $x(String.format(Constants.IN_TABLE_FINDER_XPATH,Constants.ISSUE_ESCALATION, Constants.ISSUE_ESCALATION))
                .scrollIntoView(Constants.SCROLL_INTO_CENTER).getLocation().getY();
        int stickyHeaderEndY = stickyHeader.getLocation().getY();
        Assert.assertTrue(Math.abs((secondScrollIntoY-firsScrollIntoY)-(stickyHeaderEndY-stickyHeaderStartY))<10);
    }
    @Test(priority = 2)
    public void validateIndividualOffers() {
        SelenideElement individualProductsBtn =
                $(byTagAndText("button", Constants.INDIVIDUAL_PRODUCTS));
        individualProductsBtn.scrollIntoView(Constants.SCROLL_INTO_CENTER).click();

        ElementsCollection individualOffers = $$(Constants.PURCHASE_CARD_SELECTOR)
                .shouldHave(size(Constants.PACKAGE_COUNT));
        int freeIndex=-1, basicIndex=-1, uiIndex=-1;

        for (int i=0;i<Constants.PACKAGE_COUNT;i++){
            SelenideElement card = individualOffers.get(i);
            switch (card.$(Constants.PRODUCT_NAME_SELECTOR).getText().trim()) {
                case Constants.KENDOREACT_FREE:
                    freeIndex = i;
                    break;
                case Constants.KENDOREACT:
                    basicIndex = i;
                    break;
                case Constants.KENDO_UI:
                    uiIndex = i;
                    break;
                default:
                    throw new RuntimeException(Constants.ERROR_SEARCHING_PACKAGES);
            }
        }

        individualOffers.get(basicIndex).$(Constants.COMBOBOX_CONTROL_SELECTOR).shouldHave(text(Constants.PRIORITY_SUPPORT));
        individualOffers.get(uiIndex).$(Constants.COMBOBOX_CONTROL_SELECTOR).shouldHave(text(Constants.PRIORITY_SUPPORT));

        individualOffers.get(basicIndex).$(Constants.PURCHASE_PRICE_SELECTOR).shouldHave(text(Constants.PRICE_749));
        individualOffers.get(uiIndex).$(Constants.PURCHASE_PRICE_SELECTOR).shouldHave(text(Constants.PRICE_899));
        String conflict= " i am fix";
    }
}
