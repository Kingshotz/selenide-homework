package ge.tbc.testautomation.data;

public class Constants {
    public static final String BASE_URL = "https://www.telerik.com/support/demos",
            HOVER_IMG_SELECTOR = ".HoverImg.u-mb1",
            HOVER_IMG_COLOR ="rgba(40, 46, 137, 0.75)",
            SINGLE_TYPE_CARDS_SELECTOR = "//h2[@id='%s']/following-sibling::div[@class='row u-mb8'][1]/div",
            HEADER_SELECTOR = ".TK-container.TK-Bar-container",
            NAV_BACKGROUND_COLOR= "rgba(246, 247, 250, 1)",
            SCROLL_TO_START = "{block: 'start'}",
            DEVCRAFT_PRODUCTS_PAGE = "https://www.telerik.com/purchase.aspx?filter=web",
    // Selectors
      PURCHASE_CELL_SELECTOR = ".Purchase-cell",
      SECTION_HEADERS_SELECTOR = ".u-mb0.h3",
      APP_STORE_LINKS_SELECTOR = "a.u-dib",

    // XPaths
      KENDO_UI_LINKS_XPATH =
            "//h3[text()='Kendo UI']/preceding-sibling::*[contains(@class, 'HoverImg')]//*[contains(@class, 'LinkContainer')]//a",
      PRODUCTS_IN_ORDER_XPATH = "//tbody//tr",
    REMOVE_PRODUCT_BUTTON_XPATH = "//a[text()= 'Remove Product']",
      DEVCRAFT_ULTIMATE_CELL_XPATH = ".//h5[text()='DevCraft Ultimate']",
      BUY_NOW_BUTTON_XPATH = ".//a[text()='Buy Now']",
      MICROSOFT_LINK_XPATH = ".//a[contains(@href, 'microsoft')]",
      XAMARIN_CARD_HEADER_XPATH = ".//h3[text()='Telerik UI for Xamarin']",

    // Attributes
      NAV_SPY_ATTRIBUTE = "data-tlrk-plugin",
      NAV_SPY_ATTRIBUTE_VALUE = "navspy",

    // Href patterns
      MICROSOFT_HREF_PATTERN = ".*microsoft.*",
      GOOGLE_PLAY_HREF_PATTERN = ".*play\\.google.*",
      ITUNES_HREF_PATTERN = ".*itunes\\.apple.*",

    // Text values
      UI_FOR_VUE_DEMOS_TEXT = "UI for Vue demos",
      TYPE_DESKTOP = "desktop",
      TYPE_MOBILE = "mobile",

    // JS scripts
      GET_COMPUTED_POSITION_SCRIPT = "return window.getComputedStyle(arguments[0]).position;",
     SCROLL_BY_SCRIPT = "window.scrollBy(%d,%d);";

                    ;
}
