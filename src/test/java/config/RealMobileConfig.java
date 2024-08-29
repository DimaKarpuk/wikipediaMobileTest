package config;

import org.aeonbits.owner.Config;

public interface RealMobileConfig extends Config {

    @Key("deviceName")
    @DefaultValue("09731372AE006195")
    String deviceName();

    @Key("mobileUrl")
    @DefaultValue("http://localhost:4723/wd/hub")
    String mobileUrl();

    @Key("appPackage")
    @DefaultValue("org.wikipedia.alpha")
    String appPackage();

    @Key("appActivity")
    @DefaultValue("org.wikipedia.main.MainActivity")
    String appActivity();
}