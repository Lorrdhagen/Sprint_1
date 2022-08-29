package ru.practikum.tests;

import ru.practikum.scooter.MainPageElements;
import ru.practikum.scooter.OrderPageElements;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class OrderFormFieldErrorsTests {

    private WebDriver driver;

    private static final String INCORRECT_ADDRES = "Моск";
    private static final String NAME_ERROR_TEXT = "Введите корректное имя";
    private static final String SURNAME_ERROR_TEXT = "Введите корректную фамилию";
    private static final String ADDRES_ERROR_TEXT = "Введите корректный адрес";
    private static final String METRO_STATION_ERROR_TEXT = "Выберите станцию";
    private static final String PHONE_NUMBER_ERROR_TEXT = "Введите корректный номер";

    @Before
    public void openMainPage() {

        // open(MainPageElements.URL);
        // Запуск тестов в Yandex
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.yandexdriver", "D:\\Games\\Newpapka\\Autotests\\webdrivers\\bin\\yandexdriver.exe");
        options.setBinary("C:\\Users\\LordHagen\\AppData\\Local\\Yandex\\YandexBrowser\\Application\\browser.exe");
        options.addArguments("test-type=browser");
        options.addArguments("chromeoptions.args", "--no-sandbox");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        WebDriverRunner.setWebDriver(driver);
        Selenide.open(MainPageElements.URL);
    }

    @Test
    public void shouldSeeFieldsErrorMessages () {
        MainPageElements mainPageElements = page(MainPageElements.class);
        mainPageElements.topSmallOrderButtonClick();
        OrderPageElements orderPageElements = page(OrderPageElements.class);
        orderPageElements.fillInputAddres(INCORRECT_ADDRES);
        orderPageElements.nextButtonClick();
        String NameErrTxt = orderPageElements.getNameErrorText();
        String SurnameErrTxt = orderPageElements.getSurnameErrorText();
        String AddresErrTxt = orderPageElements.getAddresErrorText();
        String MetroErrTxt = orderPageElements.getMetroStationErrorText();
        String PhoneErrTxt = orderPageElements.getPhoneNumberErrorText();
        MatcherAssert.assertThat("должны увидеть текст ошибки", NameErrTxt, equalTo(NAME_ERROR_TEXT));
        MatcherAssert.assertThat("должны увидеть текст ошибки", SurnameErrTxt, equalTo(SURNAME_ERROR_TEXT));
        MatcherAssert.assertThat("должны увидеть текст ошибки", AddresErrTxt, equalTo(ADDRES_ERROR_TEXT));
        MatcherAssert.assertThat("должны увидеть текст ошибки", MetroErrTxt, equalTo(METRO_STATION_ERROR_TEXT));
        MatcherAssert.assertThat("должны увидеть текст ошибки", PhoneErrTxt, equalTo(PHONE_NUMBER_ERROR_TEXT));
    }
    @After
    public void tearDown () {
        driver.quit();
    }

}
