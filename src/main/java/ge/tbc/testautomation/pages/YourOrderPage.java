package ge.tbc.testautomation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.data.Constants;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class YourOrderPage {
    public ElementsCollection productsInOrder = $$x(Constants.PRODUCTS_IN_ORDER_XPATH);
    public SelenideElement removeButton = $(Constants.REMOVE_PRODUCT_BUTTON_XPATH);
}