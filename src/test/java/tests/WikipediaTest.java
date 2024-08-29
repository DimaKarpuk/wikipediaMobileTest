package tests;

import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

public class WikipediaTest extends TestBase {
    FirstPage firstPage = new FirstPage();
    SecondPage secondPage = new SecondPage();
    ThirdPage thirdPage = new ThirdPage();
    FourthPage fourthPage = new FourthPage();

    @DisplayName("Тест вводного экранна")
    @Test
    void switchToAnotherScreenTest() {
        step("Проверяем что находимся на первой странице", () -> {
            firstPage.checkFirstPage();
        });
        step("Переходим на вторую страницу", () -> {
            firstPage.continueButtonClick();
        });
        step("Проверяем что находимся на второй странице", () -> {
            secondPage.checkSecondPage();
        });
        step("Переходим на третью страницу", () -> {
            firstPage.continueButtonClick();
        });
        step("Проверяем что находимся на третьей странице", () -> {
            thirdPage.checkThirdPage();
        });
        step("Переходим на четвертую странице", () -> {
            firstPage.continueButtonClick();
        });
        step("Проверяем что находимся на четвертой странице", () -> {
            fourthPage.checkFourthPage();
        });
    }
}
