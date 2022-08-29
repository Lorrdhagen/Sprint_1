package ru.practikum.scooter.data;

public class Customer {

    // --------- Первый набор тестовых данных
    // --------- первая форма
    private final String NAME1 = "Жорик";
    private final String SURNAME1 = "Вартанов";
    private final String ADDRES1 = "Москва";
    private final String METRO_STATION1 = "Лубянка";
    private final String PHONE_NUMBER1 = "89037775522";

    // --------- Вторая форма
    private final String DATE1 = "14.04.2022";
    private final String RENTAL_PERIOD1 = "пятеро суток";
    private final String SCOOTER_COLOR_ID1 = "black";
    private final String COMMENT_TO_COURIER1 = "Позвоните за час до доставки";

    // --------- Второй набор тестовых данных
    // --------- первая форма
    private final String NAME2 = "Бэтмэн";
    private final String SURNAME2 = "Супермэнов";
    private final String ADDRES2 = "Готэм";
    private final String METRO_STATION2 = "Охотный Ряд";
    private final String PHONE_NUMBER2 = "89059993311";

    // --------- Вторая форма
    private final String DATE2 = "18.04.2022";
    private final String RENTAL_PERIOD2 = "семеро суток";
    private final String SCOOTER_COLOR_ID2 = "grey";
    private final String COMMENT_TO_COURIER2 = "Позвоните за два часа до доставки";

    // --------- Модальное окно
    private final String ORDER_TEXT = "Заказ оформлен";

    // метод возвращает тестовые данные для заполнения полей первой и второй формы заказа

    public String getName1 () {
            return NAME1;
                   }
    public String getSurname1 () {
            return SURNAME1;
        }
    public String getAddres1 () {
            return ADDRES1;
        }
    public String getMetroStation1 () {
            return METRO_STATION1;
        }
    public String getPhoneNumber1 () {
            return PHONE_NUMBER1;
        }
    public String getDate1 () {
            return DATE1;
        }
    public String getRentalPeriod1 () {
            return RENTAL_PERIOD1;
        }
    public String getScooterColor1 () {
            return SCOOTER_COLOR_ID1;
        }
    public String getComment1 () {
            return COMMENT_TO_COURIER1;
        }


    public String getName2 () {
        return NAME2;
    }
    public String getSurname2 () {
        return SURNAME2;
    }
    public String getAddres2 () {
        return ADDRES2;
    }
    public String getMetroStation2 () {
        return METRO_STATION2;
    }
    public String getPhoneNumber2 () {
        return PHONE_NUMBER2;
    }
    public String getDate2 () {
        return DATE2;
    }
    public String getRentalPeriod2 () {
        return RENTAL_PERIOD2;
    }
    public String getScooterColor2 () {
        return SCOOTER_COLOR_ID2;
    }
    public String getComment2 () {
        return COMMENT_TO_COURIER2;
    }

    public String getOrderText () {
        return ORDER_TEXT;
    }

}
