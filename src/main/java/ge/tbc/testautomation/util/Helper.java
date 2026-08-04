package ge.tbc.testautomation.util;

import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.data.Constants;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Helper {
    public static void shouldSupport(String featureName, String acceptanceValue, int... supportedIndexes) {
        String dtXpath =String.format(Constants.IN_TABLE_FINDER_XPATH, featureName,featureName);

        SelenideElement dt = $x(dtXpath).scrollIntoView(Constants.SCROLL_INTO_CENTER);

        Set<Integer> supported = Arrays.stream(supportedIndexes).boxed().collect(Collectors.toSet());

        for (int i = 0; i < 3; i++) {
            SelenideElement dd = dt.$x("./following-sibling::dd[" + (i + 1) + "]");
            if (supported.contains(i)) {
                dd.shouldHave(text(acceptanceValue));
            } else {
                dd.shouldNotHave(text(acceptanceValue));
            }
        }
    }
}
