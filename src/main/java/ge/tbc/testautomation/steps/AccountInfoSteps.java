package ge.tbc.testautomation.steps;

import ge.tbc.testautomation.data.Constants;
import ge.tbc.testautomation.pages.AccountInfoPage;

public class AccountInfoSteps {
    private AccountInfoPage accountInfoPage;
    public AccountInfoSteps() {
        this.accountInfoPage = new AccountInfoPage();
    }

    public AccountInfoSteps fillMainInfo() {
        accountInfoPage.GenderRadio.click();
        accountInfoPage.passwordInput.setValue("P@ssword123!");
        accountInfoPage.daysSelect.selectOption("10");
        accountInfoPage.monthsSelect.selectOption("May");
        accountInfoPage.yearsSelect.selectOption("1995");
        return this;
    }

    public AccountInfoSteps FillAddressInfo() {
        //am gverdzec asea dakofili
        accountInfoPage.firstNameInput.setValue("John");
        accountInfoPage.lastNameInput.setValue("Doe");
        accountInfoPage.companyInput.setValue("QA Lab");
        accountInfoPage.addressOneInput.setValue("123 Automation St");
        accountInfoPage.addressTwoInput.setValue("Suite 100");
        accountInfoPage.CountrySelect.selectOption("United States");
        accountInfoPage.StateInout.setValue("New York");
        accountInfoPage.cityInput.setValue("New York");
        accountInfoPage.ZipCodeInput.setValue("10001");
        accountInfoPage.mobileInput.setValue("+15550192834");
        return this;
    }
    public AccountInfoSteps CreateAccount() {
        accountInfoPage.createAccountBtn.click();
        return this;
    }
}
