package ru.practikum.tests;

import ru.practikum.scooter.MainPageElements;
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

public class AccordionPanelTests {

    private static final String ACCORDION_PANEL_TEXT1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private static final String ACCORDION_PANEL_TEXT2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private static final String ACCORDION_PANEL_TEXT3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private static final String ACCORDION_PANEL_TEXT4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private static final String ACCORDION_PANEL_TEXT5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private static final String ACCORDION_PANEL_TEXT6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private static final String ACCORDION_PANEL_TEXT7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private static final String ACCORDION_PANEL_TEXT8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    private WebDriver driver;

    @Before
    public void openMainPage() {
        //запуск тестов в Chrome
/*      driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);
        open(MainPageElements.URL);*/
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
    public void shouldSeeCorrectTextOnPanelOne () {
        MainPageElements mainPageElemsOne = page(MainPageElements.class);
        mainPageElemsOne.scrollAndClickAccordionPanelButton(0);
        String panelOneText = mainPageElemsOne.getAccordionPanelText(0);
        MatcherAssert.assertThat("Текст должен соответствовать кнопке 1", panelOneText, equalTo(ACCORDION_PANEL_TEXT1));

    }
    @Test
    public void shouldSeeCorrectTextOnPanelTwo () {
        MainPageElements mainPageElemsTwo = page(MainPageElements.class);
        mainPageElemsTwo.scrollAndClickAccordionPanelButton(1);
        String panelTwoText = mainPageElemsTwo.getAccordionPanelText(1);
        MatcherAssert.assertThat("Текст должен соответствовать кнопке 2", panelTwoText, equalTo(ACCORDION_PANEL_TEXT2));
    }
    @Test
    public void shouldSeeCorrectTextOnPanelThree () {
        MainPageElements mainPageElemsThree = page(MainPageElements.class);
        mainPageElemsThree.scrollAndClickAccordionPanelButton(2);
        String panelThreeText = mainPageElemsThree.getAccordionPanelText(2);
        MatcherAssert.assertThat("Текст должен соответствовать кнопке 3", panelThreeText, equalTo(ACCORDION_PANEL_TEXT3));
    }
    @Test
    public void shouldSeeCorrectTextOnPanelFour () {
        MainPageElements mainPageElemsFour = page(MainPageElements.class);
        mainPageElemsFour.scrollAndClickAccordionPanelButton(3);
        String panelFourText = mainPageElemsFour.getAccordionPanelText(3);
        //System.out.println(panelFourText);
        MatcherAssert.assertThat("Текст должен соответствовать кнопке 4", panelFourText, equalTo(ACCORDION_PANEL_TEXT4));
    }
    @Test
    public void shouldSeeCorrectTextOnPanelFive () {
        MainPageElements mainPageElemsFive = page(MainPageElements.class);
        mainPageElemsFive.scrollAndClickAccordionPanelButton(4);
        String panelFiveText = mainPageElemsFive.getAccordionPanelText(4);
        MatcherAssert.assertThat("Текст должен соответствовать кнопке 5", panelFiveText, equalTo(ACCORDION_PANEL_TEXT5));
    }
    @Test
    public void shouldSeeCorrectTextOnPanelSix () {
        MainPageElements mainPageElemsSix = page(MainPageElements.class);
        mainPageElemsSix.scrollAndClickAccordionPanelButton(5);
        String panelSixText = mainPageElemsSix.getAccordionPanelText(5);
        MatcherAssert.assertThat("Текст должен соответствовать кнопке 6", panelSixText, equalTo(ACCORDION_PANEL_TEXT6));
    }
    @Test
    public void shouldSeeCorrectTextOnPanelSeven () {
        MainPageElements mainPageElemsSeven = page(MainPageElements.class);
        mainPageElemsSeven.scrollAndClickAccordionPanelButton(6);
        String panelSevenText = mainPageElemsSeven.getAccordionPanelText(6);
       // System.out.println(panelSevenText);
        MatcherAssert.assertThat("Текст должен соответствовать кнопке 7", panelSevenText, equalTo(ACCORDION_PANEL_TEXT7));
    }
    @Test
    public void shouldSeeCorrectTextOnPanelEight () {
        MainPageElements mainPageElemsEight = page(MainPageElements.class);
        mainPageElemsEight.scrollAndClickAccordionPanelButton(7);
        String panelEightText = mainPageElemsEight.getAccordionPanelText(7);
        MatcherAssert.assertThat("Текст должен соответствовать кнопке 8", panelEightText, equalTo(ACCORDION_PANEL_TEXT8));
    }

    @After
    public void tearDown () {
        driver.quit();
        }

}
