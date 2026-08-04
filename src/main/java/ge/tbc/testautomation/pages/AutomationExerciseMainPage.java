package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.data.Constants;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AutomationExerciseMainPage {
    public SelenideElement signupBtn = $x(Constants.SIGNUP_LOGIN_BTN);
    public SelenideElement loggedInHeader = $(Constants.LOGGED_IN_SELECTOR);
}
