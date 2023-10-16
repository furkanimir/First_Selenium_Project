package base;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    public static WebDriver driver = null;
    public static WebDriverWait wait = null;
    //    public static Logger logger = LogManager.getLogger(BasePage.class);
    public static Logger logger = null;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(7), Duration.ofSeconds(7));
//        this.logger = LogManager.getLogger(BasePage.class);
    }

    public static String currentUrl() {
        return getDriver().getCurrentUrl();
    }

    public static WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public static List<WebElement> findElements(By by) {
        List<WebElement> elements = driver.findElements(by);
        return elements;
    }

    public static void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public static void click(By by) {
//        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }


    public static String getText(By by) {
        return findElement(by).getText();
    }


    public static void waitVisibilityClick(By by) {
        WebElement element = null;
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            element.click();

        } catch (Exception e) {
            System.out.println("Visibilty element bulunamadi");
        }
    }

    public static void waitClicableClick(By by) {


        try {
            wait.until(ExpectedConditions.elementToBeClickable(by));
            findElement(by).click();
        } catch (Exception e) {
            System.out.println("clickable element bulunamadi");
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
