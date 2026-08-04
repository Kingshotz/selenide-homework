package ge.tbc.testautomation.steps;

import ge.tbc.testautomation.pages.AccountCreatedPage;

import static com.codeborne.selenide.Condition.visible;

public class AccountCreatedSteps {
    private AccountCreatedPage accountCreatedPage;
    public AccountCreatedSteps() {
        this.accountCreatedPage = new AccountCreatedPage();
    }
    public AccountCreatedSteps VerifyAccountCreated() {
        accountCreatedPage.accountCreatedHeader.shouldBe(visible);
        return this;
    }
    public AccountCreatedSteps ClickContinue() {
        accountCreatedPage.continueBtn.click();
        return this;
    }
}
