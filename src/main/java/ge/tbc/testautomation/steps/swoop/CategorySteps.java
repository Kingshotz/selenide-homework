package ge.tbc.testautomation.steps.swoop;

import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.pages.swoop.CategoryPage;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.actions;

public class CategorySteps {
    private CategoryPage categoryPage;
    public CategorySteps() {
        categoryPage = new CategoryPage();
    }
    public CategorySteps vlidateDiscount(String id) {
        categoryPage.offers.first().shouldBe(visible);
        SelenideElement card = categoryPage.GetOffer(id);
        int discountPercent = Integer.parseInt(
                categoryPage.discountBadge(card)
                        .getText().replaceAll("\\D+", "")
        );
        int beforePrice = Integer.parseInt(
                categoryPage.beforePrice(card)
                        .getText().replaceAll("\\D+", "")
        );

        int afterPrice = Integer.parseInt(
                categoryPage.afterPrice(card)
                        .getText().replaceAll("\\D+", "")
        );

        int expectedAfterPrice =
                Math.round(beforePrice - (beforePrice * (discountPercent / 100.0f)));
        Assert.assertEquals(afterPrice, expectedAfterPrice);
        return this;
    }
    public CategorySteps goToCategory(String linkText){
        categoryPage.getLink(linkText).click();
        return this;
    }
    public CategorySteps sortBy(String option) {
        categoryPage.offers.first().shouldBe(visible);
        categoryPage.sortBtn.click();
        categoryPage.SortBy(option).click();

        categoryPage.offers.first().shouldBe(visible);
        List<Integer> actualPrices = categoryPage.offers.stream()
                .map(card -> Integer.parseInt(
                        categoryPage.afterPrice(card)
                                .getText()
                                .replaceAll("\\D+", "")
                ))
                .toList();
        List<Integer> expectedPrices = new ArrayList<>(actualPrices);

        if (option.equals("ფასი-კლებით")) {
            expectedPrices.sort(Comparator.reverseOrder());
        } else if (option.equals("ფასი-ზრდით")) {
            expectedPrices.sort(Comparator.naturalOrder());
        } else {
            throw new IllegalArgumentException("Unsupported sort option: " + option);
        }
        Assert.assertEquals(actualPrices, expectedPrices,
                "Page items are not sorted correctly for option: " + option);
        return this;
    }
    public CategorySteps setRange(double fromPercent, double toPercent){
        categoryPage.priceBtn.click();

        dragThumbToPercent(categoryPage.minPriceThumb(), fromPercent);
        dragThumbToPercent(categoryPage.maxPriceThumb(), toPercent);
        categoryPage.continueBtnForPrice.click();

        boolean everyOfferIsInRange = categoryPage.offers.stream().allMatch(card -> {
            int price = Integer.parseInt(
                categoryPage.afterPrice(card)
                        .getText()
                        .replaceAll("\\D+", ""));
            return price >= fromPercent*1000 && price <= toPercent*1000;
        });
        return this;
    }


    private void dragThumbToPercent(SelenideElement thumb, double targetPercent) {
        int trackWidth = categoryPage.priceSliderTrack.getSize().getWidth();
        int trackHeight = categoryPage.priceSliderTrack.getSize().getHeight();
        int targetX = (int) (trackWidth * targetPercent / 100);

        actions()
                .clickAndHold(thumb)
                .moveToElement(categoryPage.priceSliderTrack, targetX, trackHeight / 2)
                .release()
                .perform();
    }

}
