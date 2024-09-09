package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class FirstPage {
    private final SelenideElement
            continueButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            checkFirstPage = $(id("org.wikipedia.alpha:id/addLanguageButton"));

    @Step("Проверяем что находимся на первой странице онбординга")
    public FirstPage checkFirstPage() {
        checkFirstPage.shouldHave(text("Add or edit languages"));
        return this;
    }

    @Step("Нажимаем кнопку продолжить")
    public FirstPage continueButtonClick() {
        continueButton.click();
        return this;
    }
}
