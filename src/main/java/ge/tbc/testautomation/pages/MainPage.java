package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.data.Constants;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public SelenideElement pricingBtn = $(byTagAndText("a", Constants.PRICING));
}
