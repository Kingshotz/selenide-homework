package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.data.Constants;

import static com.codeborne.selenide.Selenide.$;

public class AccountInfoPage {
    public SelenideElement GenderRadio = $(Constants.TITLE_MR_RADIO);
    public SelenideElement passwordInput = $(Constants.PASSWORD_INPUT);
    public SelenideElement daysSelect = $(Constants.DAYS_SELECT);
    public SelenideElement monthsSelect = $(Constants.MONTHS_SELECT);
    public SelenideElement yearsSelect = $(Constants.YEARS_SELECT);

    public SelenideElement firstNameInput = $(Constants.FIRST_NAME_INPUT);
    public SelenideElement lastNameInput = $(Constants.LAST_NAME_INPUT);
    public SelenideElement companyInput = $(Constants.COMPANY_INPUT);
    public SelenideElement addressOneInput = $(Constants.ADDRESS1_INPUT);
    public SelenideElement addressTwoInput = $(Constants.ADDRESS2_INPUT);
    public SelenideElement CountrySelect = $(Constants.COUNTRY_SELECT);
    public SelenideElement StateInout = $(Constants.STATE_INPUT);
    public SelenideElement cityInput = $(Constants.CITY_INPUT);
    public SelenideElement ZipCodeInput = $(Constants.ZIPCODE_INPUT);
    public SelenideElement mobileInput = $(Constants.MOBILE_INPUT);

    public SelenideElement createAccountBtn = $(Constants.CREATE_ACCOUNT_BTN);

}
