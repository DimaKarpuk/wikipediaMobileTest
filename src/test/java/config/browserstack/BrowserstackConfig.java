package config.browserstack;

import org.aeonbits.owner.Config;

public interface BrowserstackConfig extends Config {

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String device();

    @Key("version")
    @DefaultValue("9.0")
    String version();

    @Key("browserstackApp")
    @DefaultValue("bs://a826e5e072abe58e3045a2c8709d772e14442e60")
    String app();
}
