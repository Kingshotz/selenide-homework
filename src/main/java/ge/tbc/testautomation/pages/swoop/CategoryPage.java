package ge.tbc.testautomation.pages.swoop;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CategoryPage {
    public ElementsCollection offers = $$x("//a[contains(@href, '/offers/')]");
    public SelenideElement sortBtn = $$x("//p[text()='სორტირება']").findBy(visible),
            priceBtn = $x("//p[text() = 'ფასი']"),
            priceSlider =$(".absolute.h-full.bg-hotpink-100.rounded-full"),
            continueBtnForPrice = $x("//p[text() = 'გააგრძელე']");
    public final ElementsCollection priceThumbs = $$x("//div[contains(@class,'cursor-grab')]");


    public SelenideElement minPriceThumb() {
        return priceThumbs.get(0);
    }

    public SelenideElement maxPriceThumb() {
        return priceThumbs.get(1);
    }

    public final SelenideElement priceSliderTrack = $(".absolute.h-full.bg-hotpink-100.rounded-full");



    public SelenideElement GetOffer(String id){
        return $x(String.format("//a[contains(@href, '/offers/%s')]",id));
    }
    public SelenideElement discountBadge(SelenideElement card) {
        return card.$(".bg-danger_red-100-value p");
    }

    public SelenideElement afterPrice(SelenideElement card) {
        return card.$("div.gap-2.items-center > p.font-tbcx-bold");
    }

    public SelenideElement beforePrice(SelenideElement card) {
        return card.$("div.gap-2.items-center > p.line-through");
    }
    public SelenideElement getLink(String linkText){
        return $x(String.format("//img[@alt='%s']", linkText));
    }
    public SelenideElement SortBy(String option) {
        return $x(String.format("//p[text() = '%s']", option));
    }

}
