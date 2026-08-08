package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.steps.swoop.MainSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.open;

public class SwoopBase {
    private MainSteps mainSteps;

    @BeforeSuite
    public void beforeSuite() {
        open("https://swoop.ge/");
        mainSteps = new MainSteps();
        mainSteps.closeAuthPopup()
                .closeSwoopAiPopUp()
                .ClickSportButton();
    }
}
