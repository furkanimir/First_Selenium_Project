package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
//    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
    WebDriver driver;

    @Before
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-popup-blocking");
        options.addArguments("start-maximized");
        setDriver(new ChromeDriver(options));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

//    @After
    public void tearDown(){
        getDriver().quit();
    }


    public WebDriver getDriver(){
        return driver;
    }

    public void setDriver(WebDriver driver){
        this.driver=driver;
    }

}
