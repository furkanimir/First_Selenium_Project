package tests;

import base.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.SeturPage;

import static constants.BaseConstants.URL_SETUR;

public class SeturTest extends BaseTest {

    static SeturPage seturPage;

    @Before
    public void beforeTest() {
        seturPage = new SeturPage(getDriver());
        getDriver().navigate().to(URL_SETUR);
    }

    @Test
    public void test_01() {
        SeturPage.closePopUp();
        SeturPage.acceptCookies();
        String antalya = "Antalya";
        SeturPage.checkUrl();
        SeturPage.checkDefaultTab("Otel");
        SeturPage.nereyeGideceksinizCsvAntalya(antalya);
        SeturPage.catchCalendarApril("Nisan", "2024");
        SeturPage.increaseAdultCounter();
        SeturPage.isSearchButtonVisible();
        try {
            SeturPage.doesNewUrlContains(antalya.toLowerCase(), 3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        SeturPage.randomDivClicker();
        SeturPage.scrollDownUntilDiv();

    }



    @After
    public void afterTest() {
        getDriver().quit();
    }


}
