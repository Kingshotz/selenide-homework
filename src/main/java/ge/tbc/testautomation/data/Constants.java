package ge.tbc.testautomation.data;

public class Constants {
    public static final String
            SCROLL_INTO_CENTER = "{block: 'center'}",
            BROWSER = "chrome",
            BROWSER_SIZE = "2560x1600",
            URL = "https://www.telerik.com/support/demos",

    PRICING = "Pricing",
            DETAILED_COMPARISON = "detailed comparison",
            INDIVIDUAL_PRODUCTS = "Individual Products",

    DEVCRAFT_OFFERS_SELECTOR = "#ContentPlaceholder1_C1062_Col00",
            PURCHASE_CELL_SELECTOR = ".Purchase-cell",
            PURCHASE_CARD_SELECTOR = "#ContentPlaceholder1_C984_Col00>.Purchase-card",
            STICKY_HEADER_SELECTOR = "#ContentPlaceholder1_C1062_Col00",

    PACKAGE_NAME_SELECTOR = "h5.u-mb0h",
            PRODUCT_NAME_SELECTOR = "h5.u-mb0",
            COMBOBOX_CONTROL_SELECTOR = ".ComboBox-control",
            PURCHASE_PRICE_SELECTOR = ".Purchase-price-inner",

    DEVCRAFT_UI = "DevCraft UI",
            DEVCRAFT_COMPLETE = "DevCraft Complete",
            DEVCRAFT_ULTIMATE = "DevCraft Ultimate",

    ERROR_SEARCHING_PACKAGES = "Error happened while searching packages of KendoReact",

    MOCKING_SOLUTION = "Mocking solution for rapid unit testing",
            REPORT_MANAGEMENT = "End-to-end report management solution",
    IN_TABLE_FINDER_XPATH = "//dt[" +
            "(.//button and .//button[normalize-space(.)='%s']) " +
            "or (not(.//button) and normalize-space(.)='%s')" +
            "]",

    ISSUE_ESCALATION = "Issue escalation",
            KENDO_UI_JQUERY = "Kendo UI for jQuery",
            REPORT_SERVER = "Telerik Report Server",
            REPORTING = "Telerik Reporting",
            ON_DEMAND_VIDEOS = "Access to on-demand videos",

    BULLET = "●",
            REPORT_SERVER_USERS = "1 instance with 15 users",


    KENDOREACT_FREE = "KendoReact Free",
            KENDOREACT = "KendoReact",
            KENDO_UI = "Kendo UI",

    PRIORITY_SUPPORT = "Priority Support",
            PRICE_749 = "749",
            PRICE_899 = "899",

    AUTOMATION_EXERCISE_URL = "http://automationexercise.com",
            USER_NAME = "Test User",

     SIGNUP_LOGIN_BTN = "//a[contains(text(), 'Signup / Login')]",

     NEW_USER_SIGNUP_HEADER = "//h2[text() = 'New User Signup!']",
            SIGNUP_NAME_INPUT = "[data-qa='signup-name']",
            SIGNUP_EMAIL_INPUT = "[data-qa='signup-email']",
            SIGNUP_BTN = "[data-qa='signup-button']",

    // 3. Account Information Step 2
            TITLE_MR_RADIO = "#id_gender1",
            PASSWORD_INPUT = "[data-qa='password']",
            DAYS_SELECT = "[data-qa='days']",
            MONTHS_SELECT = "[data-qa='months']",
            YEARS_SELECT = "[data-qa='years']",

    // Address Details
     FIRST_NAME_INPUT = "[data-qa='first_name']",
            LAST_NAME_INPUT = "[data-qa='last_name']",
            COMPANY_INPUT = "[data-qa='company']",
            ADDRESS1_INPUT = "[data-qa='address']",
            ADDRESS2_INPUT = "[data-qa='address2']",
            COUNTRY_SELECT = "[data-qa='country']",
            STATE_INPUT = "[data-qa='state']",
            CITY_INPUT = "[data-qa='city']",
            ZIPCODE_INPUT = "[data-qa='zipcode']",
            MOBILE_INPUT = "[data-qa='mobile_number']",
            CREATE_ACCOUNT_BTN = "[data-qa='create-account']",

    // 4. Verifications & Clean-up
     ACCOUNT_CREATED_HEADER = "[data-qa='account-created']",
            CONTINUE_BTN = "[data-qa='continue-button']",
            LOGGED_IN_SELECTOR = "//a[contains(normalize-space(.), 'Logged in as')]",
    //adblocker
    ADBLOCKER_CRX = "LGBLNFIDAHCDCJDDIEPKCKCFDHPKNNJH_2_1_61_0.crx";

    public static final int PACKAGE_COUNT = 3;
    public static final String BASE_URL = "https://www.telerik.com/support/demos",
            HOVER_IMG_SELECTOR = ".HoverImg.u-mb1",
            HOVER_IMG_COLOR ="rgba(40, 46, 137, 0.75)",
            SINGLE_TYPE_CARDS_SELECTOR = "//h2[@id='%s']/following-sibling::div[@class='row u-mb8'][1]/div",
            HEADER_SELECTOR = ".TK-container.TK-Bar-container",
            NAV_BACKGROUND_COLOR= "rgba(246, 247, 250, 1)",
            SCROLL_TO_START = "{block: 'start'}",
            DEVCRAFT_PRODUCTS_PAGE = "https://www.telerik.com/purchase.aspx?filter=web",
    // Selectors
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

}
