package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class MainMenuPage {
    private final SelenideElement
            savedButton = $(accessibilityId("Saved")),
            searchButton = $(accessibilityId("Search")),
            editsButton = $(accessibilityId("Edits")),
            moreButton = $(accessibilityId("More")),
            exploreButton = $(accessibilityId("Explore")),
            checkScreenMessage = $(id("org.wikipedia.alpha:id/messageTitleView")),
            checkSearchScreen = $(id("org.wikipedia.alpha:id/history_title")),
            checkMoreScreen = $(id("org.wikipedia.alpha:id/main_nav_tab_layout")),
            customizeButton = $(id("org.wikipedia.alpha:id/view_announcement_action_positive"));

    @Step("Нажимаем кнопку saved")
    public MainMenuPage savedButtonClick() {
        savedButton.click();
        return this;
    }

    @Step("Нажимаем кнопку search")
    public MainMenuPage searchButtonClick() {
        searchButton.click();
        return this;
    }

    @Step("Нажимаем кнопку edits")
    public MainMenuPage editsButtonClick() {
        editsButton.click();
        return this;
    }

    @Step("Нажимаем кнопку more")
    public MainMenuPage moreButtonClick() {
        moreButton.click();
        return this;
    }

    @Step("Нажимаем кнопку explore")
    public MainMenuPage exploreButtonClick() {
        exploreButton.click();
        return this;
    }

    @Step("Проверяем что перешли на страницу")
    public MainMenuPage checkScreen(String message) {
        checkScreenMessage.shouldHave(text(message));
        return this;
    }

    @Step("Проверяем что находимся на странице search")
    public MainMenuPage checkSearchScreen() {
        checkSearchScreen.shouldHave(text("History"));
        return this;
    }

    @Step("Проверяем что находимся на странице explore")
    public MainMenuPage checkExploreScreen() {
        customizeButton.shouldBe(visible);
        return this;
    }

    @Step("Проверяем что находимся на странице more")
    public MainMenuPage checkMoreScreen() {
        checkMoreScreen.shouldNotBe(visible);
        return this;
    }
}
