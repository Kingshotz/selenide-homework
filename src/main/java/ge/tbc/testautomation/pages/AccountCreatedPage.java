package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.data.Constants;

import static com.codeborne.selenide.Selenide.$;

public class AccountCreatedPage {
    public SelenideElement accountCreatedHeader = $(Constants.ACCOUNT_CREATED_HEADER);
    public SelenideElement continueBtn = $(Constants.CONTINUE_BTN);
}
