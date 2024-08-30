package config.browserstack;

import org.aeonbits.owner.Config;

public interface BrowserstackLoginConfig extends Config {

    @Key("userName")
    @DefaultValue("dmitry_6jgG4R")
    String userName();

    @Key("accessKey")
    @DefaultValue("qsybaun9iujs1WUWxuoe")
    String accessKey();

    @Key("url")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String url();
}
