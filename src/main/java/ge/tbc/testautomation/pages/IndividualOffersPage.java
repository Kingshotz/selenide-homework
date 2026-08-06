package ge.tbc.testautomation.pages;

import com.codeborne.selenide.ElementsCollection;
import ge.tbc.testautomation.data.Constants;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;

public class IndividualOffersPage {
    public ElementsCollection individualOffers = $$(Constants.PURCHASE_CARD_SELECTOR);
}
