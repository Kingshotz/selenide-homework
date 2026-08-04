package ge.tbc.testautomation.steps;

import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.data.Constants;
import ge.tbc.testautomation.pages.IndividualOffersPage;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;

public class IndividualOffersSteps {
    private IndividualOffersPage individualOffersPage;
    public IndividualOffersSteps() {
        this.individualOffersPage = new IndividualOffersPage();
    }
    public IndividualOffersSteps CheckUITexts() {
        individualOffersPage.individualOffers.shouldHave(size(Constants.PACKAGE_COUNT));
        int freeIndex=-1, basicIndex=-1, uiIndex=-1;

        for (int i = 0; i< Constants.PACKAGE_COUNT; i++){
            SelenideElement card = individualOffersPage.individualOffers.get(i);
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

        individualOffersPage.individualOffers.get(basicIndex).$(Constants.COMBOBOX_CONTROL_SELECTOR).shouldHave(text(Constants.PRIORITY_SUPPORT));
        individualOffersPage.individualOffers.get(uiIndex).$(Constants.COMBOBOX_CONTROL_SELECTOR).shouldHave(text(Constants.PRIORITY_SUPPORT));

        individualOffersPage.individualOffers.get(basicIndex).$(Constants.PURCHASE_PRICE_SELECTOR).shouldHave(text(Constants.PRICE_749));
        individualOffersPage.individualOffers.get(uiIndex).$(Constants.PURCHASE_PRICE_SELECTOR).shouldHave(text(Constants.PRICE_899));
        return this;
    }

}
