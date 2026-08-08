package ge.tbc.testautomation.tests;

import com.codeborne.selenide.Selenide;
import ge.tbc.testautomation.steps.swoop.CategorySteps;
import ge.tbc.testautomation.steps.swoop.MainSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class ParametrizedSwoopTests2 extends SwoopBase {
    private CategorySteps categorySteps;

    private String section;
    private String option;
    private double fromPrice;
    private double toPrice;

    public ParametrizedSwoopTests2(String option, String section, double fromPrice, double toPrice) {
        this.option = option;
        this.section = section;
        this.fromPrice = fromPrice;
        this.toPrice = toPrice;
    }

    @BeforeClass
    public void beforeClass() {
        categorySteps = new CategorySteps();
    }

    @Test(priority = 1)
    public void sortTest() {
        categorySteps.goToCategory(section)
                .sortBy(option);
    }

    @Test(priority = 2)
    public void rangeTest() {
        categorySteps
                .setRange(fromPrice/10,toPrice/10);// 1000ze ikofa da 100ze mravldeba
    }
}