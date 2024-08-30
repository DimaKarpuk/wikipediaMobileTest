package config.browserstack;

import org.aeonbits.owner.Config;

public interface BrowserstackConfig extends Config {

    @Key("device")
    @DefaultValue("Google Pixel 3a")
    String device();

    @Key("version")
    @DefaultValue("9.0")
    String version();

    @Key("browserstackApp")
    @DefaultValue("bs://a07a168a96deb78c2ec368985efec5ff4061e279")
    String app();
}
