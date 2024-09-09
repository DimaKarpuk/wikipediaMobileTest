package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainMenuPage;

import static com.codeborne.selenide.Selenide.back;

public class MainMenuTest extends TestBase {
    MainMenuPage mainMenuPage = new MainMenuPage();
    @Test
    @DisplayName("Тест главного меню")
    void mainMenuTest() {
        back();
            mainMenuPage.savedButtonClick();
            mainMenuPage.checkScreen("Sync reading lists");
            mainMenuPage.searchButtonClick();
            mainMenuPage.checkSearchScreen();
            mainMenuPage.exploreButtonClick();
            mainMenuPage.checkExploreScreen();
            mainMenuPage.editsButtonClick();
            mainMenuPage.checkScreen("Did you know that everyone can edit Wikipedia?");
            mainMenuPage.moreButtonClick();
            mainMenuPage.checkMoreScreen();
    }
}
