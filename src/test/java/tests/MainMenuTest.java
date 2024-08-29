package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainMenuScreen;

import static com.codeborne.selenide.Selenide.back;
import static io.qameta.allure.Allure.step;

public class MainMenuTest extends TestBase {
    MainMenuScreen mainMenuScreen = new MainMenuScreen();
    @Test
    @DisplayName("Тест главного меню")
    void mainMenuTest() {
        back();
        step("Нажимаем кнопку Saved", () -> {
            mainMenuScreen.savedButtonClick();
        });
        step("Проверяем результат перехода на экран Saved", () -> {
            mainMenuScreen.checkScreen("Sync reading lists");
        });
        step("Нажимаем кнопку Search", () -> {
            mainMenuScreen.searchButtonClick();
        });
        step("Проверяем результат перехода на экран Search", () -> {
            mainMenuScreen.checkSearchScreen();
        });
        step("Нажимаем кнопку Explore", () -> {
            mainMenuScreen.exploreButtonClick();
        });
        step("Проверяем результат перехода на экран Explore", () -> {
            mainMenuScreen.checkExploreScreen();
        });
        step("Нажимаем кнопку Edits", () -> {
            mainMenuScreen.editsButtonClick();
        });
        step("Проверяем результат перехода на экран Edits", () -> {
            mainMenuScreen.checkScreen("Did you know that everyone can edit Wikipedia?");
        });
        step("Нажимаем кнопку More", () -> {
            mainMenuScreen.moreButtonClick();
        });
        step("Проверяем результат перехода на экран More", () -> {
            mainMenuScreen.checkMoreScreen();
        });
    }
}
