package drivers;

import com.codeborne.selenide.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

import config.browserstack.BrowserstackConfig;
import config.browserstack.BrowserstackLoginConfig;

public class BrowserstackDriver implements WebDriverProvider{
    private static final BrowserstackLoginConfig dataConfig =
            ConfigFactory.create(
                    BrowserstackLoginConfig.class,
                    System.getProperties()
            );
    private static final BrowserstackConfig device =
            ConfigFactory.create(
                    BrowserstackConfig.class,
                    System.getProperties()
            );
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities caps = new MutableCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", dataConfig.userName());
        caps.setCapability("browserstack.key", dataConfig.accessKey());

        // Set URL of the application under test
        caps.setCapability("app", device.app());

        // Specify device and os_version for testing
        caps.setCapability("device", device.device());
        caps.setCapability("os_version", device.version());

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "first_test");

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        try {
            return new RemoteWebDriver(
                    new URL(dataConfig.url()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
