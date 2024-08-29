package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class MainMenuScreen {
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


    public MainMenuScreen savedButtonClick() {
        savedButton.click();
        return this;
    }

    public MainMenuScreen searchButtonClick() {
        searchButton.click();
        return this;
    }

    public MainMenuScreen editsButtonClick() {
        editsButton.click();
        return this;
    }

    public MainMenuScreen moreButtonClick() {
        moreButton.click();
        return this;
    }

    public MainMenuScreen exploreButtonClick() {
        exploreButton.click();
        return this;
    }

    public MainMenuScreen checkScreen(String message) {
        checkScreenMessage.shouldHave(text(message));
        return this;
    }

    public MainMenuScreen checkSearchScreen() {
        checkSearchScreen.shouldHave(text("History"));
        return this;
    }

    public MainMenuScreen checkExploreScreen() {
        customizeButton.shouldBe(visible);
        return this;
    }

    public MainMenuScreen checkMoreScreen() {
        checkMoreScreen.shouldNotBe(visible);
        return this;
    }

}
