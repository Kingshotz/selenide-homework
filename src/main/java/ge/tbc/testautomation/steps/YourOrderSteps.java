package ge.tbc.testautomation.steps;

import ge.tbc.testautomation.pages.YourOrderPage;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.exist;

public class YourOrderSteps {
    YourOrderPage yourOrderPage;

    public YourOrderSteps() {
        yourOrderPage = new YourOrderPage();
    }

    public YourOrderSteps removeProduct(){
        int sizeBefore = yourOrderPage.productsInOrder.size();
        yourOrderPage.removeButton.should(exist);
        yourOrderPage.removeButton.click();
        yourOrderPage.productsInOrder.shouldHave(size(sizeBefore - 1));
        return this;
    }
}