package ge.tbc.testautomation.steps.swoop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import ge.tbc.testautomation.pages.swoop.MainPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class MainSteps {
    private MainPage mainPage;
    public MainSteps() {
        mainPage = new MainPage();
    }
    public MainSteps ClickSportButton() {
        mainPage.SportButton.click();
        return  this;
    }
    public MainSteps closeSwoopAiPopUp() {
        mainPage.AIPopupCloseBtn.click();
        return this;
    }

    public MainSteps closeAuthPopup() {
        sleep(5000);
        switchTo().frame(mainPage.AuthIframe);
        mainPage.AuthCloseBtn.click();
        switchTo().defaultContent();
        return this;
    }
}
