package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainMenuScreen;
import pages.RegistrationScreen;
import utils.RandomUtils;

import static com.codeborne.selenide.Selenide.back;
import static io.qameta.allure.Allure.step;

public class RegistrationTest extends TestBase {
    MainMenuScreen mainMenuScreen = new MainMenuScreen();
    RegistrationScreen registrationScreen = new RegistrationScreen();
    RandomUtils randomUtils = new RandomUtils();
    @DisplayName("Тест на регистрацию")
    @Test
    void registrationTest(){
        back();
        step("Переходим на экран регистрация", () -> {
            mainMenuScreen.moreButtonClick();
            registrationScreen.loginButtonClick();
        });
        step("Проверяем что открылся экран Create an account", () -> {
            registrationScreen.checkCreateAccountScreen();
        });
        step("Вводим username", () -> {
            registrationScreen.userNameButtonClick();
            registrationScreen.setUserName(randomUtils.randomUserName);
        });
        step("Вводим password", () -> {
            registrationScreen.passwordButtonClick();
            registrationScreen.setPassword(randomUtils.randomPassword);
            registrationScreen.repeatPasswordButtonClick();
            registrationScreen.setRepeatPassword(randomUtils.randomPassword);
        });
        step("Вводим email", () -> {
            registrationScreen.emailButtonClick();
            registrationScreen.setEmail(randomUtils.randomEmail);
        });
        step("Нажимаем кнопку Next", () -> {
            registrationScreen.createAccountButtonClick();
        });
        step("проверяем что открылся экран с captcha", () -> {
            registrationScreen.checkCaptchaImage();
        });
    }
}
