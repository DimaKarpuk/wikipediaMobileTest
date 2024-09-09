package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class ThirdPage {
    private final SelenideElement
            checkThirdPage = $(id("org.wikipedia.alpha:id/primaryTextView"));

    @Step("Проверяем что находимся на третьей странице онбординга")
    public ThirdPage checkThirdPage() {
        checkThirdPage.shouldHave(text("Reading lists with sync"));
        return this;
    }
}
