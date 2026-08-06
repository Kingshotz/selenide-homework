package ge.tbc.testautomation.pages;

import com.codeborne.selenide.ElementsCollection;
import ge.tbc.testautomation.data.Constants;

import static com.codeborne.selenide.Selenide.$$;

public class DevCraftProductsPage {
    public ElementsCollection PurchaseCells = $$(Constants.PURCHASE_CELL_SELECTOR);
}