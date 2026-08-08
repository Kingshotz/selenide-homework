package ge.tbc.testautomation.data;

import org.testng.annotations.DataProvider;

public class OfferDataProvider {
    @DataProvider(name = "OfferDataProvider")
    public  static Object[][] OfferDataProvider(){
        return new Object[][]{
                {"514545"},
                {"507270"},
                {"533987"},
                {"523005"},
                {"542234"},
                {"578374"},
                {"578362"},
                {"578337"},
                {"578330"},
                {"577291"}
        };
    }
}
