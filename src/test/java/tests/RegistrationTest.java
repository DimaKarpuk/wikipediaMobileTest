package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainMenuPage;
import pages.RegistrationPage;
import utils.RandomUtils;

import static com.codeborne.selenide.Selenide.back;

public class RegistrationTest extends TestBase {
    MainMenuPage mainMenuPage = new MainMenuPage();
    RegistrationPage registrationPage = new RegistrationPage();
    RandomUtils randomUtils = new RandomUtils();
    @DisplayName("Тест на регистрацию")
    @Test
    void registrationTest(){
        back();
            mainMenuPage.moreButtonClick();
            registrationPage.loginButtonClick();
            registrationPage.checkCreateAccountScreen();
            registrationPage.userNameButtonClick();
            registrationPage.setUserName(randomUtils.randomUserName);
            registrationPage.passwordButtonClick();
            registrationPage.setPassword(randomUtils.randomPassword);
            registrationPage.repeatPasswordButtonClick();
            registrationPage.setRepeatPassword(randomUtils.randomPassword);
            registrationPage.emailButtonClick();
            registrationPage.setEmail(randomUtils.randomEmail);
            registrationPage.createAccountButtonClick();
            registrationPage.checkCaptchaImage();
    }
}
