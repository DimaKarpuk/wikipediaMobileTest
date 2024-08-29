package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

import com.codeborne.selenide.SelenideElement;

public class FourthPage {
    private final SelenideElement
            getStartedButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button"));

    public FourthPage checkFourthPage() {
        getStartedButton.shouldBe(visible);
        return this;
    }
}
