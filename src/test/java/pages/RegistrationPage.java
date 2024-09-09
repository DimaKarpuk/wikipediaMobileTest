package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class RegistrationPage {
    private final SelenideElement
            createAnAccount = $x("//android.widget.TextView[@text= 'Create an account']"),
            loginButton = $(id("org.wikipedia.alpha:id/main_drawer_account_container")),
            userNameButton = $(id("org.wikipedia.alpha:id/create_account_username")),
            passwordButton = $(id("org.wikipedia.alpha:id/create_account_password_input")),
            repeatPasswordButton = $(id("org.wikipedia.alpha:id/create_account_password_repeat")),
            emailButton = $(id("org.wikipedia.alpha:id/create_account_email")),
            userNameInput = $x("//android.widget.EditText[@text='Username']"),
            passwordInput = $x("//android.widget.EditText[@text= 'Password']"),
            repeatPasswordInput = $x("//android.widget.EditText[@text='Repeat password']"),
            emailInput = $x("//android.widget.EditText[@text='Email (Optional)']"),
            crateAccountButton = $(id("org.wikipedia.alpha:id/create_account_submit_button")),
            captchaImage = $(accessibilityId("Captcha image"));

    @Step("Нажимаем кнопку регистрация")
    public RegistrationPage loginButtonClick() {
        loginButton.click();
        return this;
    }

    @Step("Нажимаем на поле ввода userName")
    public RegistrationPage userNameButtonClick() {
        userNameButton.click();
        return this;
    }

    @Step("Вводим userName")
    public RegistrationPage setUserName(String username) {
        userNameInput.sendKeys(username);
        return this;
    }

    @Step("Нажимаем на поле ввода password")
    public RegistrationPage passwordButtonClick() {
        passwordButton.click();
        return this;
    }

    @Step("Вводим password")
    public RegistrationPage setPassword(String passw) {
        passwordInput.sendKeys(passw);
        return this;
    }

    @Step("Нажимаем на поле ввода повторить password")
    public RegistrationPage repeatPasswordButtonClick() {
        repeatPasswordButton.click();
        return this;
    }

    @Step("Повторно вводим password")
    public RegistrationPage setRepeatPassword(String passw) {
        repeatPasswordInput.sendKeys(passw);
        return this;
    }

    @Step("Нажимаем на поле ввода email")
    public RegistrationPage emailButtonClick() {
        emailButton.click();
        return this;
    }

    @Step("Вводим email")
    public RegistrationPage setEmail(String em) {
        emailInput.sendKeys(em);
        return this;
    }

    @Step("Нажимаем кнопку submit")
    public RegistrationPage createAccountButtonClick() {
        crateAccountButton.click();
        return this;
    }

    @Step("Проверяем что находимся на странице регистрация")
    public RegistrationPage checkCreateAccountScreen() {
        createAnAccount.shouldBe(visible);
        return this;
    }

    @Step("Проверяем что для продолжения регистрации необходимо пройти каптчу")
    public RegistrationPage checkCaptchaImage() {
        captchaImage.shouldBe(visible);
        return this;
    }
}
