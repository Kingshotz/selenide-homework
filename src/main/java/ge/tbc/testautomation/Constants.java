package ge.tbc.testautomation;

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

    XPATH_CONTAINS_SPAN = "//span[contains(., '%s')]",

    KENDOREACT_FREE = "KendoReact Free",
            KENDOREACT = "KendoReact",
            KENDO_UI = "Kendo UI",

    PRIORITY_SUPPORT = "Priority Support",
            PRICE_749 = "749",
            PRICE_899 = "899",

    BASE_URL = "http://automationexercise.com",
            USER_NAME = "Test User",


     HOME_PAGE_MARKER = "",
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
            LOGGED_IN_SELECTOR = "//a[contains(normalize-space(.), 'Logged in as')]";

    public static final int PACKAGE_COUNT = 3;
}
