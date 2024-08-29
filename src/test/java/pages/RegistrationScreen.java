package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class RegistrationScreen {
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

    public RegistrationScreen loginButtonClick() {
        loginButton.click();
        return this;
    }

    public RegistrationScreen userNameButtonClick() {
        userNameButton.click();
        return this;
    }

    public RegistrationScreen setUserName(String username) {
        userNameInput.sendKeys(username);
        return this;
    }

    public RegistrationScreen passwordButtonClick() {
        passwordButton.click();
        return this;
    }

    public RegistrationScreen setPassword(String passw) {
        passwordInput.sendKeys(passw);
        return this;
    }

    public RegistrationScreen repeatPasswordButtonClick() {
        repeatPasswordButton.click();
        return this;
    }

    public RegistrationScreen setRepeatPassword(String passw) {
        repeatPasswordInput.sendKeys(passw);
        return this;
    }

    public RegistrationScreen emailButtonClick() {
        emailButton.click();
        return this;
    }

    public RegistrationScreen setEmail(String em) {
        emailInput.sendKeys(em);
        return this;
    }

    public RegistrationScreen createAccountButtonClick() {
        crateAccountButton.click();
        return this;
    }

    public RegistrationScreen checkCreateAccountScreen() {
        createAnAccount.shouldBe(visible);
        return this;
    }
    public RegistrationScreen checkCaptchaImage(){
        captchaImage.shouldBe(visible);
        return this;
    }
}
