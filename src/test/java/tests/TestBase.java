package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;

import drivers.BrowserstackDriver;
import drivers.EmulationDriver;
import drivers.RealMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {
    private static final String defaultDeviceHost = "browserstack";
    public static String deviceHost = System.getProperty("deviceHost");
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = null;
        Configuration.timeout = 30000;
        if (System.getProperty("deviceHost", defaultDeviceHost).equals("real")) {
            Configuration.browser = RealMobileDriver.class.getName();
        } else if (System.getProperty("deviceHost", defaultDeviceHost).equals("emulation")) {
            Configuration.browser = EmulationDriver.class.getName();
        } else if (System.getProperty("deviceHost", defaultDeviceHost).equals("browserstack")) {
            Configuration.browser = BrowserstackDriver.class.getName();
        }
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void addAttachments() {
        if (deviceHost.equals("remote")) {
            Attach.pageSource();

            String sessionId = Selenide.sessionId().toString();
            closeWebDriver();

            Attach.addVideo(sessionId);
        }else {
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();

            closeWebDriver();
        }
    }
}