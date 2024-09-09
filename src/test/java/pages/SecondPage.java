package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class SecondPage {
    private final SelenideElement
            checkSecondPage = $(id("org.wikipedia.alpha:id/primaryTextView"));
    @Step("Проверяем что находимся на второй странице онбординга")
    public SecondPage checkSecondPage() {
        checkSecondPage.shouldHave(text("New ways to explore"));
        return this;
    }
}
