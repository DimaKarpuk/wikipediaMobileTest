package config.browserstack;

import org.aeonbits.owner.Config;

public interface BrowserstackLoginConfig extends Config {

    @Key("userName")
    @DefaultValue("karpdima_Jf26FY")
    String userName();

    @Key("accessKey")
    @DefaultValue("mPKiyHubEAZ4vx2qjgTu")
    String accessKey();

    @Key("url")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String url();
}
