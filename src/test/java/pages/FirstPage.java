package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

import com.codeborne.selenide.SelenideElement;

public class FirstPage {
    private final SelenideElement
            continueButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            checkFirstPage = $(id("org.wikipedia.alpha:id/addLanguageButton"));

    public FirstPage checkFirstPage() {
        checkFirstPage.shouldHave(text("Add or edit languages"));
        return this;
    }

    public FirstPage continueButtonClick() {
        continueButton.click();
        return this;
    }
}
