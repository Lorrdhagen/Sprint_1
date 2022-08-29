package ru.practikum.tests;

import ru.practikum.scooter.MainPageElements;
import ru.practikum.scooter.OrderPageElements;
import ru.practikum.scooter.data.Customer;
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
import static org.hamcrest.CoreMatchers.startsWith;

public class OrderCreationTests {

    private WebDriver driver;

    @Before
    public void openMainPage() {
        //запуск тестов в Chrome, баг найден, тест падает при нажатии на кнопку "Да" в модальном окне Хотите оформить заказ.
        // При нажатии на кнопку Да ни чего не происходит, заказ не оформляется
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
       /*Первый тест создание заказа и проверка появления сообщения об успешном создании заказа
            точка входа кнопка заказать в верхнем правом углу*/
    @Test
    public void shouldSeeSuccessfulCreationOrderMessage () {
        MainPageElements mainPageElements = page(MainPageElements.class);
        mainPageElements.topSmallOrderButtonClick();
        OrderPageElements orderPageElements = page(OrderPageElements.class);
        Customer customer1 = new Customer();
        orderPageElements.fillInputsFirstOrderForm(customer1.getName1(), customer1.getSurname1(), customer1.getAddres1(), customer1.getMetroStation1(), customer1.getPhoneNumber1());
        orderPageElements.fillInputsSecondOrderForm(customer1.getDate1(), customer1.getRentalPeriod1(), customer1.getScooterColor1(), customer1.getComment1());
        String orderTextFromModal = orderPageElements.getModalHeaderText();
        MatcherAssert.assertThat("Должны увидеть текст успешного заказа", orderTextFromModal, startsWith(customer1.getOrderText()));
    }
    /*Второй тест создание заказа и проверка появления сообщения об успешном создании заказа
            точка входа нижняя большая кнопка Заказать*/
    @Test
    public void shouldSeeSuccessfulCreationOrderMessageTwo () {
        MainPageElements mainPageElems = page(MainPageElements.class);
        mainPageElems.bottomBigOrderButtonScrollAndClick();
        OrderPageElements orderPageElems = page(OrderPageElements.class);
        Customer customer2 = new Customer();
        orderPageElems.fillInputsFirstOrderForm(customer2.getName2(), customer2.getSurname2(), customer2.getAddres2(), customer2.getMetroStation2(), customer2.getPhoneNumber2());
        orderPageElems.fillInputsSecondOrderForm(customer2.getDate2(), customer2.getRentalPeriod2(), customer2.getScooterColor2(), customer2.getComment2());
        String orderTxtFromModal = orderPageElems.getModalHeaderText();
        MatcherAssert.assertThat("Должны увидеть текст успешного заказа", orderTxtFromModal, startsWith(customer2.getOrderText()));
    }
    @After
    public void tearDown () {
        driver.quit();
    }
}
