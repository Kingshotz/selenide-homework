package ge.tbc.testautomation.tests;

import org.testng.annotations.*;

public class LifecycleTest {

    // Runs once, before ANY test in the whole suite
    @BeforeSuite
    public void initDatabaseConnection() {
        System.out.println("[BeforeSuite] Dummy DB connection opened");
    }

    // Runs once, after ALL tests in the suite are done
    @AfterSuite
    public void closeDatabaseConnection() {
        System.out.println("[AfterSuite] Dummy DB connection closed");
    }

    // Runs once per <test> tag in testng.xml, before its classes run
    @BeforeTest
    public void launchBrowser() {
        System.out.println("[BeforeTest] Browser launched");
    }

    // Runs once per <test> tag, after its classes are done
    @AfterTest
    public void closeBrowser() {
        System.out.println("[AfterTest] Browser closed");
    }

    // Runs once per test class, before its @Test methods
    @BeforeClass
    public void login() {
        System.out.println("[BeforeClass] Logged into e-commerce app");
    }

    // Runs once per test class, after its @Test methods
    @AfterClass
    public void logout() {
        System.out.println("[AfterClass] Logged out of e-commerce app");
    }

    // Runs before EVERY @Test method in this class
    @BeforeMethod
    public void goToHomePage() {
        System.out.println("[BeforeMethod] Navigated to home page");
    }

    // Runs after EVERY @Test method in this class
    @AfterMethod
    public void returnToHomePage() {
        System.out.println("[AfterMethod] Returned to home page");
    }

    @Test
    public void sampleTestOne() {
        System.out.println("Running sampleTestOne");
    }

    @Test
    public void sampleTestTwo() {
        System.out.println("Running sampleTestTwo");
    }
}
