package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.data.Constants;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SignupPage {
    public SelenideElement signupHeader =$x(Constants.NEW_USER_SIGNUP_HEADER);
    public SelenideElement nameInput = $(Constants.SIGNUP_NAME_INPUT);
    public SelenideElement emailInput = $(Constants.SIGNUP_EMAIL_INPUT);
    public SelenideElement signupBtn = $(Constants.SIGNUP_BTN);
}
