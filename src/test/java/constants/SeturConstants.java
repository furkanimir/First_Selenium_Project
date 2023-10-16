package constants;

import org.openqa.selenium.By;

public class SeturConstants {


    public static final By insPopUpClose_btn = By.cssSelector(".ins-close-button");
    public static final By cookiesAccept_btn = By.cssSelector("#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    public static final By defaulNav_btn = By.xpath("//button[@class='Tab__StyledTab-sc-1gyyeis-1 eDgwud']/span[2]");
    public static final By citySearchBox_input = By.cssSelector("input[placeholder='Otel Adı Veya Konum']");
    public static final By searchBoxArea_div = By.xpath("(//div[@class='styled__ItemText-sc-9a6dl1-4 lewVeQ'][1])");
    public static final By dateCalendar_div = By.cssSelector("div[class='HotelBookerDatePicker__BookerSearchBarDateRangeInputWrapper-sc-1larvt5-0 huYdrz'] div div[class='SearchBarInputStyle__SearchBarInputWrapper-sc-h1ifqh-1 kPyELV']");
    public static final By parcalanacakCalendarTextScale_div = By.xpath("//*[@id=\"__next\"]/div[3]/div[3]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/strong");
    public static final By checkMonth_div = By.xpath("//div[@class='DayPicker_transitionContainer DayPicker_transitionContainer_1 DayPicker_transitionContainer__horizontal DayPicker_transitionContainer__horizontal_2']//div[3]//div[1]//div[1]//strong");
    public static final By calendarIleriButonu_btn = By.xpath("//button[@class='styled__StyledButton-sc-1i7jkmi-0 jBiEGt DatePickerStyle__NavNextButton-sc-1yq2271-2 ihrCIi']");
    public static final By calendarFirt_span = By.xpath("(//span[@class='helpers__CalenderDay-sc-1l68pts-0 eUSbRE'][normalize-space()='1'])[3]");
    public static final By calendarSeventh_span = By.xpath("(//span[@class='helpers__CalenderDay-sc-1l68pts-0 eUSbRE'][normalize-space()='7'])[3]");
    public static final By searchGuest_div = By.xpath("//div[@class='SearchGuestStyle__SearchGuestItem-sc-txpuig-16 erGKAN']");
    //    public static final By adultCounter_span = By.xpath("//span[@class='CounterStyle__CounterButtonLabel-sc-1oucm61-2 kjWoiD'][normalize-space()='2']");
    public static final By adultCounter_span = By.xpath("(//span[@data-testid='count-label'])[1]");

    public static final By adultIncreaseButton_btn = By.xpath("//body[1]/div[2]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]");

    public static final By searchButton = By.xpath("//button[@class='styled__StyledButton-sc-1i7jkmi-0 iRHtqU']");


    public static final By digerBolgeleriGoster_div = By.xpath("//div[@class='styled__FilterRegionShowMoreBox-sc-xe39ep-6 etrKVy']");

    public static final By digerBolgelerSehirler_div = By.xpath("(//div[@class='styled__DesktopItem-sc-xe39ep-3 bABLRC'])");

    public static final By hotelsAndBestPrice_div = By.xpath("(//span[@class='styled__SearchTitle-sc-g6lxf7-2 eKVWXL'])[1]");

    public static final By antalyaOtelleriSayisi_div = By.xpath("//div[@class='styled__TextContainer-sc-g6lxf7-1 ihOdzT']//span[2]");


}
