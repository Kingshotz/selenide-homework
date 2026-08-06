package ge.tbc.testautomation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.data.Constants;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class DevCraftPage {
    public ElementsCollection devCraftOffers = $(Constants.DEVCRAFT_OFFERS_SELECTOR)
            .$$(Constants.PURCHASE_CELL_SELECTOR);
    public SelenideElement showDetailedBtn = $(withText(Constants.DETAILED_COMPARISON));
    public  SelenideElement stickyHeader = $(Constants.STICKY_HEADER_SELECTOR);
   public SelenideElement individualProductsBtn =
            $(byTagAndText("button", Constants.INDIVIDUAL_PRODUCTS));
}
