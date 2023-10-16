package pages;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

import static constants.SeturConstants.*;
import static constants.BaseConstants.*;

public class SeturPage extends BasePage {
    private static String requiredString;

    public SeturPage(WebDriver driver) {
        super(driver);
    }

    //0
    public static void closePopUp(){


        waitClicableClick(insPopUpClose_btn);
    }
    public static void acceptCookies(){
        waitClicableClick(cookiesAccept_btn);
    }


    //2
    public static void checkUrl() {
        Assert.assertTrue(currentUrl().equals(URL_SETUR));
    }

    //3
    public static void checkDefaultTab(String text) {
        Assert.assertTrue(getText(defaulNav_btn).equals(text));

    }

    //4
    public static void nereyeGideceksinizCsvAntalya(String text) { //parametre=Antalya olmasın mı
        sendKeys(citySearchBox_input, text);
        click(citySearchBox_input);
        waitClicableClick(searchBoxArea_div);
    }

    //5-nisan 2024
    public static void catchCalendarApril(String mm, String yy) {
        click(dateCalendar_div);
//        String textScale = getText(parcalanacakCalendarTextScale_div);
//        String[] parts = textScale.split(" ");//
//        String gelenMonth = parts[0];
//        String gelenYear = parts[1];
        String checkInMonth = mm.concat(" " + yy);

        while (true) {
            String month = getText(checkMonth_div);
            if (month.equals(checkInMonth)) {
                break;
            } else {
                click(calendarIleriButonu_btn);
            }

        }//while

        click(calendarFirt_span);
        click(calendarSeventh_span);

    }

    //6
    public static void increaseAdultCounter() {
        click(searchGuest_div);
        //pencere açıldı, aşağıdan + butonuna basmadan önce değeri alıyorum
        String before_yetiskinOnBesPlus = getText(adultCounter_span);
        click(adultIncreaseButton_btn);
        Assert.assertNotEquals(before_yetiskinOnBesPlus, getText(adultCounter_span));

    }

    //7
    public static void isSearchButtonVisible() {
        waitVisibilityClick(searchButton);
    }

    /*8 -Theread.sleep methodunu kullanmak istemezdim ama
    başka türlü yapamadım test sürekli fail verdi */
    public static void doesNewUrlContains(String text,int timeoutCounter) throws InterruptedException {
        Thread.sleep(4000);
        String new_url = currentUrl();
        if (new_url.contains(text)){
            Assert.assertTrue(new_url.contains(text));
        }else {
            if ((timeoutCounter-1)<=0)return;
            doesNewUrlContains(text,timeoutCounter-1);
        }
//        System.out.println(timeoutCounter);
    }



    //9-Listeden gelen element'e random tıklama
    public static void randomDivClicker() {

        List<WebElement> elements = findElements(digerBolgelerSehirler_div);
        Random rand = new Random();
        int randomIndex = rand.nextInt(elements.size());
        WebElement randomElement = elements.get(randomIndex);
        String s = randomElement.getText();
        requiredString = s.substring(s.indexOf("(") + 1, s.indexOf(")"));
//        System.out.println("Diğer Bölgeleri Göster :"+requiredString);
        click(By.cssSelector("span[title='"+randomElement.getText()+"']"));


//        randomElement.click();
    }

    //10
    public static void scrollDownUntilDiv() {
        WebElement elementToScroll = findElement(hotelsAndBestPrice_div);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'end', inline: 'nearest'});", elementToScroll);
        //Assert.assertTrue(Assert.assertEquals(lastDivCount,requiredString))
    }

//    public static void checkLastDivCount(){
//
//        String lastDivCount = getText(antalyaOtelleriSayisi_div);
//        System.out.println("En aşağı "+lastDivCount);
//    }


}
