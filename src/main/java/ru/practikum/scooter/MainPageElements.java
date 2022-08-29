package ru.practikum.scooter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPageElements {

    // Адрес главной страницы сервиса
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

     // логотип Yandex
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement yandexLogo;

    //  логотип Самокат
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    private SelenideElement scooterLogo;

    //  текст Учебный тренажер
    @FindBy(how = How.CLASS_NAME, using = "Header_Disclaimer__3VEni")
    private SelenideElement trainingSimulatorText;

    //  кнопка Заказать в верхнем правом углу
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g'][text()='Заказать']")
    private SelenideElement topSmallOrderButton;

    // нижняя большая кнопка Заказать
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM'][text()='Заказать']")
    private SelenideElement bottomBigOrderButton;

    // кнопка Статус заказа
    @FindBy(how = How.XPATH, using = "//button[@class='Header_Link__1TAG7'][text()='Статус заказа']")
    private SelenideElement orderStatusButton;

    //  поле ввода номера заказа
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Введите номер заказа']")
    private SelenideElement numberOfOrderInput;

    //  Кнопка Go
    @FindBy(how = How.XPATH, using = "//button[@text()='Go!']")
    private SelenideElement goButton;

    // Область с соглашением Cookie выделенная рамкой
    @FindBy(how = How.CLASS_NAME, using = "class='App_CookieConsent__1yUIN")
    private SelenideElement cookieConcent;

    // текст соглашения об использовании Cookie
    @FindBy(how = How.CLASS_NAME, using = "class='App_CookieText__1sbqp")
    private SelenideElement cookieText;

    // кнопка принятия соглашения Cookie
    @FindBy(how = How.CLASS_NAME, using = "App_CookieButton__3cvqF")
    private SelenideElement cookieButton;

    // чертеж самоката
    @FindBy(how = How.XPATH, using = "//div[@class='Home_BluePrint__TGX2n']/img[@alt='Scooter blueprint']")
    private SelenideElement scooterBlueprint;

    //  рисунок самоката
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Scooter__3YdJy']/img[@alt='Scooter blueprint']")
    private SelenideElement scooterPicture;

    // стрелочка вниз в нижнем левом углу
    @FindBy(how = How.XPATH, using = "//img[@alt='Scroll down']")
    private SelenideElement scrollDown;

    // текст Самокат на пару дней
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Header__iJKdX']")
    private SelenideElement scooterTwoDaysText;

    // текст Привезём его прямо к вашей двери, а когда накатаетесь — заберём
    @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E'][@style='opacity: 1; display: block;']")
    private SelenideElement scooterTwoDaysSubheaderText;

    // Текст "Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E'][@style='opacity: 1;']")
    private SelenideElement scooterTwoDaysSubheaderNextText;

    // --------------------- таблица с характеристиками самоката --------------------------------------------

    // текст  Модель Toxic PRO
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK'][text()='\u00A0Модель Toxic PRO']")
    private SelenideElement scooterModelText;

    // текст Максимальная скорость
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK'][text()='Максимальная скорость']")
    private SelenideElement scooterMaxSpeedText;

    // текст 40 км/ч
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK'][text()='40 км/ч']")
    private SelenideElement scooterSpeedKmText;

    // текст Проедет без поздарядки
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK'][text()='Проедет без поздарядки']")
    private SelenideElement scooterwithoutRechargingText;

    // текст Выдерживает вес
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK'][text()='Выдерживает вес']")
    private SelenideElement scooterWeightText;

    // текст 120 кг
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK'][text()='120 кг']")
    private SelenideElement scooterKgText;

    // коллекция из двух горизонтальных разделителей
    @FindBy(how = How.CSS, using = ".Home_Separator__3cWAk")
    private  ElementsCollection tableSeparatorsCollection;

    //-------------------------------------- Дорожная карта -------------------------------------------------

    // текст Как это работает
    @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E'][text()='Как это работает']")
    private SelenideElement roadmapHeaderText;

    // кружок 1
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp'][text()='1']")
    private SelenideElement roadmapCircleOne;

    // кружок 2
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp'][text()='2']")
    private SelenideElement roadmapCircleTwo;

    // кружок 3
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp'][text()='3']")
    private SelenideElement roadmapCircleThree;

    // кружок 4
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp Home_Lineless__2-Rxp'][text()='4']")
    private SelenideElement roadmapCircleFour;

    // текст статуса шага 1
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH'][text()='Заказываете самокат']")
    private SelenideElement roadmapStepOneText;

    // текст описания статуса шага 1
    @FindBy(how = How.XPATH, using = "//div[starts-with(text(),'Выбираете')]")
    private SelenideElement roadmapStepOneDiscText;

    // текст статуса шага 2
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH'][text()='Курьер привозит самокат']")
    private SelenideElement roadmapStepTwoText;

    // текст описания статуса шага 2
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH'][text()='А вы — оплачиваете аренду']")
    private SelenideElement roadmapStepTwoDiscText;

    // текст статуса шага 3
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH'][text()='Катаетесь']")
    private SelenideElement roadmapStepThreeText;

    // текст описания статуса шага 3
    @FindBy(how = How.XPATH, using = "//div[starts-with(text(),'Сколько часов аренды')]")
    private SelenideElement roadmapStepThreeDiscText;

    // текст шага 4
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH'][text()='Курьер забирает самокат']")
    private SelenideElement roadmapStepFourText;

    // текст описания статуса шага 4
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusDescription__3WGl5'][text()='Когда аренда заканчивается']")
    private SelenideElement roadmapStepFourDiscText;

    //  ------------------------------------ Вопросы о важном --------------------------------------

    //  текст Вопросы о важном
    @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E'][text()='Вопросы о важном']")
    private SelenideElement faqHeader;

    // вопрос 1
    @FindBy(how = How.ID, using = "accordion__heading-0")
    private SelenideElement faqQuestionOne;

    // текст ответа на вопрос 1
    @FindBy(how = How.ID, using = "accordion__panel-0")
    private SelenideElement faqAnswerOne;

    // вопрос 2
    @FindBy(how = How.ID, using = "accordion__heading-1")
    private SelenideElement faqQuestionTwo;

    // текст ответа на вопрос 2
    @FindBy(how = How.ID, using = "accordion__panel-1")
    private SelenideElement faqAnswerTwo;

    // вопрос 3
    @FindBy(how = How.ID, using = "accordion__heading-2")
    private SelenideElement faqQuestionThree;

    // текст ответа на вопрос 3
    @FindBy(how = How.ID, using = "accordion__panel-2")
    private SelenideElement faqAnswerThree;

    // вопрос 4
    @FindBy(how = How.ID, using = "accordion__heading-3")
    private SelenideElement faqQuestionFour;

    // текст ответа на вопрос 4
    @FindBy(how = How.ID, using = "accordion__panel-3")
    private SelenideElement faqAnswerFour;

    // вопрос 5
    @FindBy(how = How.ID, using = "accordion__heading-4")
    private SelenideElement faqQuestionFive;

    // текст ответа на вопрос 5
    @FindBy(how = How.ID, using = "accordion__panel-4")
    private SelenideElement faqAnswerFive;

    // вопрос 6
    @FindBy(how = How.ID, using = "accordion__heading-5")
    private SelenideElement faqQuestionSix;

    // текст ответа на вопрос 6
    @FindBy(how = How.ID, using = "accordion__panel-5")
    private SelenideElement faqAnswerSix;

    // вопрос 7
    @FindBy(how = How.ID, using = "accordion__heading-6")
    private SelenideElement faqQuestionSeven;

    // текст ответа на вопрос 7
    @FindBy(how = How.ID, using = "accordion__panel-6")
    private SelenideElement faqAnswerSeven;

    // вопрос 8
    @FindBy(how = How.ID, using = "accordion__heading-7")
    private SelenideElement faqQuestionEight;

    // текст ответа на вопрос 8
    @FindBy(how = How.ID, using = "accordion__panel-7")
    private SelenideElement faqAnswerEight;

    //  коллекция вопросов о важном FAQ
    @FindBy(how = How.XPATH, using = "//div[@class='accordion__button']")
    private  ElementsCollection accordionButtonsCollection;

    // коллекция ответов на вопросы о важном FAQ
    @FindBy(how = How.XPATH, using = "//div[@class='accordion__panel']")
    private  ElementsCollection accordionPanelsCollection;

    // ------------------- методы для тестирования блока Вопросы о важном -------------------------------------

    // метод скролит до кнопки нужного вопроса FAQ и нажимает на нее
    public void scrollAndClickAccordionPanelButton (int buttonNumber) {
        accordionButtonsCollection.get(buttonNumber).scrollIntoView(true).click();
    }

    // метод получает текст ответа нажатой кнопки FAQ
    public String getAccordionPanelText (int panelNumber) {
        return accordionPanelsCollection.get(panelNumber).shouldBe(Condition.visible).getText();
    }

    // метод нажимает на верхнюю маленькую кнопку Заказать
    public void topSmallOrderButtonClick () {
           topSmallOrderButton.click();
    }

    // метод скролит до нижней большой кнопки Заказать и нажимает ее
    public void bottomBigOrderButtonScrollAndClick () {
        bottomBigOrderButton.scrollIntoView(true).click();
        }
}
