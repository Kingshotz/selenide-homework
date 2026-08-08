package ge.tbc.testautomation.pages.swoop;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public SelenideElement SportButton = $x("//p[text() = 'სპორტი ']");
    public SelenideElement AIPopupCloseBtn = $x("//img[@alt = 'close']");
    public  SelenideElement AuthIframe = $x("//iframe[starts-with(@src, 'blob:https://swoop.ge/')]");
    public  SelenideElement AuthCloseBtn = $x("//button[@aria-label='Close']");

    public SelenideElement getLink(String linkText){
        return $x(String.format("//img[@alt='%s']", linkText));
    }
}
