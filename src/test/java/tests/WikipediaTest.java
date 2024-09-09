package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

public class WikipediaTest extends TestBase {
    FirstPage firstPage = new FirstPage();
    SecondPage secondPage = new SecondPage();
    ThirdPage thirdPage = new ThirdPage();
    FourthPage fourthPage = new FourthPage();

    @DisplayName("Тест вводного экрана")
    @Test
    void switchToAnotherScreenTest() {
            firstPage.checkFirstPage();
            firstPage.continueButtonClick();
            secondPage.checkSecondPage();
            firstPage.continueButtonClick();
            thirdPage.checkThirdPage();
            firstPage.continueButtonClick();
            fourthPage.checkFourthPage();
    }
}
