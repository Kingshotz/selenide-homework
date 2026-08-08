package ge.tbc.testautomation.tests;

import com.codeborne.selenide.*;
import ge.tbc.testautomation.data.Constants;
import ge.tbc.testautomation.steps.AccountCreatedSteps;
import ge.tbc.testautomation.steps.AccountInfoSteps;
import ge.tbc.testautomation.steps.AutomationExerciseMainSteps;
import ge.tbc.testautomation.steps.SignupSteps;
import ge.tbc.testautomation.util.ExtensionUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Map;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static ge.tbc.testautomation.data.Constants.ADBLOCKER_CRX;

public class AutomationExerciseTest {
    WebDriver driver;

    private AutomationExerciseMainSteps automationExerciseMainSteps;
    private SignupSteps signupSteps;
    private AccountInfoSteps accountInfoSteps;
    private AccountCreatedSteps accountCreatedSteps;

    @BeforeClass
    public void beforeClass() {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", Map.of(
                "credentials_enable_service", false,
                "profile.password_manager_enabled", false,
                "profile.password_manager_leak_detection", false
        ));
        options.addArguments("--disable-features=PasswordLeakDetection,AutofillServerCommunication");
        options.addExtensions(ExtensionUtil.extractExtension(ADBLOCKER_CRX));
        driver = new ChromeDriver(options);
        WebDriverRunner.setWebDriver(driver);
        Configuration.browser = Constants.BROWSER;
        Configuration.browserSize = Constants.BROWSER_SIZE;
        Configuration.headless = false;

        automationExerciseMainSteps = new AutomationExerciseMainSteps();
        signupSteps = new SignupSteps();
        accountInfoSteps = new AccountInfoSteps();
        accountCreatedSteps = new AccountCreatedSteps();
        open(Constants.AUTOMATION_EXERCISE_URL);
    }
    @Test
    public void registerUserTest() {
        automationExerciseMainSteps.ClickSignupLogin();
        signupSteps.SignUp();

        accountInfoSteps.fillMainInfo()
                .FillAddressInfo()
                .CreateAccount();
        accountCreatedSteps.VerifyAccountCreated()
                .ClickContinue();
        automationExerciseMainSteps.VerifyLoggedIn();
    }

}
