package ge.tbc.testautomation.tests;

import com.codeborne.selenide.*;
import ge.tbc.testautomation.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v126.network.Network;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.Optional;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationExerciseTest {
    @BeforeClass
    public void beforeClass() {
        Configuration.browser = Constants.BROWSER;
        Configuration.browserSize = Constants.BROWSER_SIZE;
        Configuration.headless = false; // extensions do NOT load in headless Chrome

        File adblockExtension = new File(System.getProperty("user.dir") + "/src/main/resources/adblock.crx");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-features=DisableLoadExtensionCommandLineSwitch");
        options.addArguments("--load-extension=" + adblockExtension.getAbsolutePath());
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-features=DisableLoadExtensionCommandLineSwitch");
        Configuration.headless = false;
        Configuration.browserCapabilities = options;

        open(Constants.BASE_URL);

        // give the extension a moment to initialize before assertions/interactions begin
        Selenide.sleep(1500);
    }
    @Test
    public void registerUserTest() {
        // დინამიური ელ.ფოსტის გენერაცია თაიმსტემპით
        String dynamicEmail = String.format("test_user_%d@example.com", System.currentTimeMillis());

        // 1 & 2. Launch browser and Navigate to URL
        open(Constants.BASE_URL);

        // 4. Click on 'Signup / Login' button
        $x(Constants.SIGNUP_LOGIN_BTN).click();

        // 5. Verify 'New User Signup!' is visible
        $x(Constants.NEW_USER_SIGNUP_HEADER).shouldBe(visible);

        // 6. Enter name and email address
        $(Constants.SIGNUP_NAME_INPUT).setValue(Constants.USER_NAME);
        $(Constants.SIGNUP_EMAIL_INPUT).setValue(dynamicEmail);

        // 7. Click 'Signup' button
        $(Constants.SIGNUP_BTN).click();


        // 9. Fill details: Title, Password, Date of birth
        $(Constants.TITLE_MR_RADIO).click();
        $(Constants.PASSWORD_INPUT).setValue("P@ssword123!");
        $(Constants.DAYS_SELECT).selectOption("10");
        $(Constants.MONTHS_SELECT).selectOption("May");
        $(Constants.YEARS_SELECT).selectOption("1995");

        // 12. Fill details: Address info
        $(Constants.FIRST_NAME_INPUT).setValue("John");
        $(Constants.LAST_NAME_INPUT).setValue("Doe");
        $(Constants.COMPANY_INPUT).setValue("QA Lab");
        $(Constants.ADDRESS1_INPUT).setValue("123 Automation St");
        $(Constants.ADDRESS2_INPUT).setValue("Suite 100");
        $(Constants.COUNTRY_SELECT).selectOption("United States");
        $(Constants.STATE_INPUT).setValue("New York");
        $(Constants.CITY_INPUT).setValue("New York");
        $(Constants.ZIPCODE_INPUT).setValue("10001");
        $(Constants.MOBILE_INPUT).setValue("+15550192834");

        // 13. Click 'Create Account button'
        $(Constants.CREATE_ACCOUNT_BTN).click();

        // 14. Verify that 'ACCOUNT CREATED!' is visible
        $(Constants.ACCOUNT_CREATED_HEADER).shouldBe(visible);
        // 15. Click 'Continue' button
        $(Constants.CONTINUE_BTN).click();

        // 16. Verify that 'Logged in is visible
        $(Constants.LOGGED_IN_SELECTOR).shouldBe(visible);
    }


}
