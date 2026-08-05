package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.data.Constants;
import ge.tbc.testautomation.pages.DevCraftProductsPage;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;

public class DevCraftProductsSteps {
    DevCraftProductsPage devCraftProductsPage;

    public DevCraftProductsSteps() {
        devCraftProductsPage = new DevCraftProductsPage();
    }

    public DevCraftProductsSteps OpenPage(){
        Selenide.open(Constants.DEVCRAFT_PRODUCTS_PAGE);
        return this;
    }

    public DevCraftProductsSteps PurchaseUltimate(){
        devCraftProductsPage.PurchaseCells.shouldHave(size(3));
        SelenideElement ultimateCell = devCraftProductsPage.PurchaseCells
                .stream().filter(card -> card.$x(Constants.DEVCRAFT_ULTIMATE_CELL_XPATH).exists()).findFirst().orElse(null);
        ultimateCell.should(exist);
        SelenideElement buyNowButton = ultimateCell.$x(Constants.BUY_NOW_BUTTON_XPATH);
        buyNowButton.should(exist);
        buyNowButton.click();
        return this;
    }
}