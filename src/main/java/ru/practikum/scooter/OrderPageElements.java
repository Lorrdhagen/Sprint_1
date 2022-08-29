package ru.practikum.scooter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPageElements {

    // -------------------------------- первая форма заказа самоката ---------------------------------
    // текст Для кого самокат
    @FindBy(how = How.XPATH, using = "//div[@class='Order_Header__BZXOb']")
    private SelenideElement firstFormHeader;

    // поле Имя
    @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN'][@placeholder='* Имя']")
    private SelenideElement nameInput;

   // поле Фамилия
   @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN'][@placeholder='* Фамилия']")
   private SelenideElement surnameInput;

   // поле Адрес
   @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN'][@placeholder='* Адрес: куда привезти заказ']")
   private SelenideElement addresInput;

    //  поле Станция метро с выпадающим списком
    @FindBy(how = How.XPATH, using = "//input[@class='select-search__input']")
    private SelenideElement metroStationInput;

    // поле Телефон
    @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN'][@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement phoneNumberInput;

    // коллекция элементов выпадающего списка поля Станция метро
    @FindBy(how = How.XPATH, using = "li[@class='select-search__row']/button[@class='Order_SelectOption__82bhS select-search__option']")
    private ElementsCollection metroStationsCollection;

    // первый элемент выпадающего списка поля Станция метро
    @FindBy(how = How.XPATH, using = "//button[@class='Order_SelectOption__82bhS select-search__option']/div[@class='Order_Text__2broi']")
    private SelenideElement metroStationElement;

    // текст ошибки поля Имя
    @FindBy(how = How.XPATH, using = "//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6'][text()='Введите корректное имя']")
    private SelenideElement nameErrorText;

    // текст ошибки поля Фамилия
    @FindBy(how = How.XPATH, using = "//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6'][text()='Введите корректную фамилию']")
    private SelenideElement surnameErrorText;

    // текст ошибки поля Адрес
    @FindBy(how = How.XPATH, using = "//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6'][text()='Введите корректный адрес']")
    private SelenideElement addresErrorText;

    // текст ошибки поля Станция метро
    @FindBy(how = How.CLASS_NAME, using = "Order_MetroError__1BtZb")
    private SelenideElement metroStationErrorText;

    // текст ошибки поля Телефон
    @FindBy(how = How.XPATH, using = "//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6'][text()='Введите корректный номер']")
    private SelenideElement phoneNumberErrorText;

    // кнопка Далее
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement nextButton;

    // ---- вторая форма заказа самоката, появляется после заполнения полей первой формы и нажатии кнопки Далее -----

    // текст заголовка Про аренду
    @FindBy(how = How.XPATH, using = "//div[@class='Order_Header__BZXOb']")
    private SelenideElement secondFormHeader;

    // поле Когда привезти самокат
    @FindBy(how = How.XPATH, using = "//div[@class='react-datepicker__input-container']/input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']")
    private SelenideElement dateInput;

    // поле Срок аренды
    @FindBy(how = How.XPATH, using = "//span[@class='Dropdown-arrow']")
    private SelenideElement rentalPeriodField;

    //  коллекция элементов выпадающего списка поля Срок аренды
    @FindBy(how = How.XPATH, using = "//div[@class='Dropdown-option']")
    private ElementsCollection rentalPeriodCollection;

    // чекбокс черный жемчуг в поле Цвет самоката
    @FindBy(how = How.XPATH, using = "//input[@id='black']")
    private SelenideElement blackColorCheckbox;

    // чекбокс серая безысходность в поле Цвет самоката
    @FindBy(how = How.XPATH, using = "//input[@id='grey']")
    private SelenideElement greyColorCheckbox;

    // коллекция чекбоксов
    @FindBy(how = How.XPATH, using = "//input[@class='Checkbox_Input__14A2w']")
    private ElementsCollection checkboxesCollection;

    //  поле Комментарий для курьера
    @FindBy(how = How.XPATH, using = "//div[@class='Input_InputContainer__3NykH']/input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']")
    private SelenideElement commentToCourierInput;

    //  кнопка Назад
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']")
    private SelenideElement backButton;

    //  кнопка Заказать
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement orderButton;

    // ---------------------------- модальное окно Хотите оформить заказ? -------------------------

    // заголовок модального окна
    @FindBy(how = How.XPATH, using = "//div[@class='Order_ModalHeader__3FDaJ']")
    private SelenideElement doYouWantHeader;

    // кнопка Нет
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i'][text()='Нет']")
    private SelenideElement noButton;

    // кнопка Да
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM'][text()='Да']")
    private SelenideElement yesButton;

    // ------------------------ модальное окно после нажатия на кнопку Да ------------------------------------

    //  "Заказ оформлен"
    @FindBy(how = How.XPATH, using = "//div[@class='Order_ModalHeader__3FDaJ']")
    private SelenideElement modalHeader;

    // текст с номером заказа
    @FindBy(how = How.XPATH, using = "//div[@class='Order_Text__2broi']")
    private SelenideElement modalText;

    //  кнопка Посмотреть статус
    @FindBy(how = How.XPATH, using = "//div[@class='Order_NextButton__1_rCA']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement modalViewStatusButton;

    // ----------------- Методы для заполнения полей первой формы заказа самоката --------------------------

    // Метод заполняет поле Имя
    public void fillInputName(String name) {
        nameInput.setValue(name);
    }

    // Метод заполняет поле Фамилия
    public void fillInputSurname(String surname) {
        surnameInput.setValue(surname);
    }

    // Метод заполняет поле Адрес
    public void fillInputAddres(String addres) {
        addresInput.setValue(addres);
    }

    // метод заполняет поле Станция метро
    public void fillInputMetroStation(String metroStationTitle) {
        metroStationInput.setValue(metroStationTitle);
        metroStationElement.click();
    }

    // метод заполняет поле Телефон
    public void fillInputPhoneNumber(String phoneNumber) {
        phoneNumberInput.setValue(phoneNumber);
    }
    // метод кликает по кнопке Далее
    public void nextButtonClick () {
        nextButton.click();
    }

    // метод заполняет все поля первой формы заказа самоката и нажимает кнопку Далее
    public void fillInputsFirstOrderForm(String name, String surname, String addres, String metroStationTitle, String phoneNumber) {
        fillInputName(name);
        fillInputSurname(surname);
        fillInputAddres(addres);
        fillInputMetroStation(metroStationTitle);
        fillInputPhoneNumber(phoneNumber);
        nextButtonClick();
    }
    // ----------------- Методы для заполнения полей второй формы заказа самоката ----------------------------
    // метод заполняет поле Когда привезти самокат
    public void fillDateInput(String date) {
        dateInput.setValue(date);
    }
    // метод заполняет поле Срок аренды
    public void fillRentalPeriod (String rentalPeriod) {
        rentalPeriodField.click();
        rentalPeriodCollection.findBy(Condition.exactText(rentalPeriod)).click();
    }
    // метод кликает по нужному чекбоксу
    public void checkboxClick (String checkboxId) {
        //  checkboxesCollection.findBy(Condition.exactText(checkboxText)).click();
        checkboxesCollection.findBy(Condition.id(checkboxId)).click();
    }
    // метод заполняет поле Комментарий для курьера
    public void fillInputCommentToCourier (String commentToCourier) {
        commentToCourierInput.setValue(commentToCourier);
    }
    // метод кликает по кнопке Заказать
    public void orderButtonClick () {
        orderButton.click();
    }
    // метод кликает по кнопке Да
    public void yesButtonClick () {
        yesButton.click();
    }

    // Метод заполняет все поля второй формы заказа самоката
    public void fillInputsSecondOrderForm (String date, String rentalPeriod, String checkboxId, String commentToCourier) {
           fillDateInput(date);
           fillRentalPeriod(rentalPeriod);
           checkboxClick(checkboxId);
           fillInputCommentToCourier(commentToCourier);
           orderButtonClick();
           yesButtonClick();
    }
    // метод получает текст заголовка модального окна
    public String getModalHeaderText () {
        return modalHeader.getText();
    }

    // ---------------------- Методы для проверки ошибкок всех полей формы заказа ------------------------------

    // метод получает текст ошибки поля Имя
    public String getNameErrorText () {
        return nameErrorText.getText();
    }
    // метод получает текст ошибки поля Фамилия
    public String getSurnameErrorText () {
        return surnameErrorText.getText();
    }
    // метод получает текст ошибки поля Адрес
    public String getAddresErrorText () {
        return addresErrorText.getText();
    }
    // метод получает текст ошибки поля Станция метро
    public String getMetroStationErrorText () {
        return metroStationErrorText.getText();
    }
    // метод получает текст ошибки поля телефон
    public String getPhoneNumberErrorText () {
        return phoneNumberErrorText.text();
    }
}
