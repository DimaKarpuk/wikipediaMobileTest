package config;

import org.aeonbits.owner.Config;

public interface EmulationsConfig extends Config {

    @Key("deviceName")
    @DefaultValue("Pixel4")
    String deviceName();

    @Key("platformVersion")
    @DefaultValue("14")
    String platformVersion();

    @Key("appPackage")
    @DefaultValue("org.wikipedia.alpha")
    String appPackage();

    @Key("appActivity")
    @DefaultValue("org.wikipedia.main.MainActivity")
    String appActivity();

    @Key("mobileUrl")
    @DefaultValue("http://localhost:4723/wd/hub")
    String mobileUrl();
}

