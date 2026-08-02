package ge.tbc.testautomation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.data.Constants;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;

public class SupportDemosPage {
    public ElementsCollection HoverCards = $$(Constants.HOVER_IMG_SELECTOR);
    public ElementsCollection kendoUILinks = $$x(Constants.KENDO_UI_LINKS_XPATH);
    public ElementsCollection DesktopCards = $$x(String.format(Constants.SINGLE_TYPE_CARDS_SELECTOR, Constants.TYPE_DESKTOP));
    public ElementsCollection MobileCards = $$x(String.format(Constants.SINGLE_TYPE_CARDS_SELECTOR, Constants.TYPE_MOBILE));
    public SelenideElement Header = $(Constants.HEADER_SELECTOR);
    public ElementsCollection HeaderAnchors = $(byAttribute(Constants.NAV_SPY_ATTRIBUTE, Constants.NAV_SPY_ATTRIBUTE_VALUE)).$$("a");
    public ElementsCollection SectionsHeaders = $$(Constants.SECTION_HEADERS_SELECTOR);
}