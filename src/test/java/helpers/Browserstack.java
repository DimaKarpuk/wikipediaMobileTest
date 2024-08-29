package helpers;

import static io.restassured.RestAssured.given;

import org.aeonbits.owner.ConfigFactory;

import config.browserstack.BrowserstackLoginConfig;

public class Browserstack {
        private static final BrowserstackLoginConfig dataConfig =
                ConfigFactory.create(
                        BrowserstackLoginConfig.class,
                        System.getProperties()
                );

        public static String videoUrl(String sessionId) {
            String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

            return given()
                    .auth().basic(dataConfig.userName(), dataConfig.accessKey())
                    .get(url)
                    .then()
                    .log().status()
                    .log().body()
                    .statusCode(200)
                    .extract().path("automation_session.video_url");
        }
}
