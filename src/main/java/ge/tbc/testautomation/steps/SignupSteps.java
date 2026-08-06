package ge.tbc.testautomation.steps;

import ge.tbc.testautomation.data.Constants;
import ge.tbc.testautomation.pages.SignupPage;

import static com.codeborne.selenide.Condition.visible;

public class SignupSteps {
    private SignupPage signupPage;
    public SignupSteps() {
        this.signupPage = new SignupPage();
    }
    public SignupSteps SignUp() {
        signupPage.signupHeader.shouldBe(visible);
        signupPage.nameInput.setValue(Constants.USER_NAME);
        String dynamicEmail = String.format("test_user_%d@example.com", System.currentTimeMillis());
        signupPage.emailInput.setValue(dynamicEmail);
        signupPage.signupBtn.click();
        return this;
    }
}
