package ge.tbc.testautomation.steps;

import com.codeborne.selenide.*;
import ge.tbc.testautomation.data.Constants;
import ge.tbc.testautomation.pages.SupportDemosPage;
import org.openqa.selenium.Point;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SupportDemosSteps {
    private SupportDemosPage supportDemosPage;

    public SupportDemosSteps() {
        supportDemosPage = new SupportDemosPage();
    }

    public SupportDemosSteps OpenPage(){
        Selenide.open(Constants.BASE_URL);
        return this;
    }
    public SupportDemosSteps openPage(){
        Selenide.open(Constants.BASE_URL);
        return this;
    }

    public SupportDemosSteps HoverCardCheck(){
        supportDemosPage.HoverCards.shouldHave(sizeGreaterThan(0));
        for (SelenideElement card : supportDemosPage.HoverCards) {
            card.hover();
            card.shouldHave(cssValue("background-color", Constants.HOVER_IMG_COLOR));
        }
        return this;
    }
    public SupportDemosSteps KendoUICardCheck(){
        supportDemosPage.kendoUILinks.shouldHave(CollectionCondition.itemWithText(Constants.UI_FOR_VUE_DEMOS_TEXT));
        return this;
    }
    public SupportDemosSteps DesktopCardsCheck(){
        List<SelenideElement> msCards = supportDemosPage.DesktopCards.stream()
                .filter(card -> card.$x(Constants.MICROSOFT_LINK_XPATH).exists())
                .toList();

        $$(msCards).shouldHave(sizeGreaterThan(0));
        return this;
    }
    public SupportDemosSteps MobileCardsXamarinCheck(){
        ElementsCollection links = supportDemosPage.MobileCards.stream()
                .filter(card -> card.$x(Constants.XAMARIN_CARD_HEADER_XPATH).exists())
                .findFirst().orElse(null).$$(Constants.APP_STORE_LINKS_SELECTOR);

        links.findBy(attributeMatching("href", Constants.MICROSOFT_HREF_PATTERN)).should(exist);
        links.findBy(attributeMatching("href", Constants.GOOGLE_PLAY_HREF_PATTERN)).should(exist);
        links.findBy(attributeMatching("href", Constants.ITUNES_HREF_PATTERN)).should(exist);
        return this;
    }
    public SupportDemosSteps HeaderCheck(){
        supportDemosPage.Header.should(exist);
        String positionBefore = executeJavaScript(Constants.GET_COMPUTED_POSITION_SCRIPT, supportDemosPage.Header);

        Point locationBefore = supportDemosPage.Header.getLocation();
        int ByX = 0;
        int ByY = 800;

        executeJavaScript(String.format(Constants.SCROLL_BY_SCRIPT, ByX, ByY));
        supportDemosPage.Header.shouldBe(visible);
        Point locationAfter = supportDemosPage.Header.getLocation();
        assert Math.abs(locationBefore.getY() - locationAfter.getY()) == ByY;
        assert Math.abs(locationBefore.getX() - locationAfter.getX()) == ByX;

        return this;
    }
    public SupportDemosSteps HeaderAnchorsGetActive(){
        supportDemosPage.HeaderAnchors.shouldHave(size(supportDemosPage.SectionsHeaders.size()));
        for (int i = 0; i < supportDemosPage.SectionsHeaders.size(); i++) {
            supportDemosPage.SectionsHeaders.get(i).scrollIntoView(Constants.SCROLL_TO_START);
            supportDemosPage.HeaderAnchors.get(i).shouldHave(cssValue("background-color", Constants.NAV_BACKGROUND_COLOR));
        }
        return this;
    }
    public SupportDemosSteps HeaderGivesRightUrl(){
        int count = supportDemosPage.HeaderAnchors.size();

        for (int i = 0; i < count; i++) {
            SelenideElement anchor = supportDemosPage.HeaderAnchors.get(i);
            SelenideElement targetSectionHeader = supportDemosPage.SectionsHeaders.get(i);

            anchor.click();
            targetSectionHeader.shouldBe(visible);
        }
        return this;
    }
}