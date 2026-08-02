package ge.tbc.testautomation.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import ge.tbc.testautomation.data.Constants;
import ge.tbc.testautomation.steps.SupportDemosSteps;
import ge.tbc.testautomation.util.ExtensionUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Map;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    private static final String ADBLOCKER_CRX = "LGBLNFIDAHCDCJDDIEPKCKCFDHPKNNJH_2_1_61_0.crx";

    WebDriver driver;

    @BeforeClass
    public void setUp(){
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
        Configuration.browserSize = "1920x1080";
        driver.manage().window().maximize();
//        Configuration.holdBrowserOpen = true;
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
