package ge.tbc.testautomation.steps;

import ge.tbc.testautomation.pages.AutomationExerciseMainPage;

import static com.codeborne.selenide.Condition.visible;

public class AutomationExerciseMainSteps {
    private AutomationExerciseMainPage automationExerciseMainPage;
    public AutomationExerciseMainSteps() {
        this.automationExerciseMainPage = new AutomationExerciseMainPage();
    }
    public AutomationExerciseMainSteps ClickSignupLogin() {
        automationExerciseMainPage.signupBtn.click();
        return this;
    }
    public  AutomationExerciseMainSteps VerifyLoggedIn() {
        automationExerciseMainPage.loggedInHeader.shouldBe(visible);
        return this;
    }
}
