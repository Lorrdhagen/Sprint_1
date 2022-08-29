﻿# Sprint_1 Написать автотесты для учебного сервиса «Яндекс.Самокат».
###     Ссылка на сервис: http://qa-scooter.praktikum-services.ru/

## 1 Описать все элементы главной страницы с помощью Page Object.
## 2 Написать тесты.
Изучи тестовые сценарии.
Определи, какие локаторы нужны, чтобы автоматизировать тестовые сценарии.
Опиши необходимые локаторы с помощью Page Object.
Для каждой страницы нужно создать отдельный класс с PO. Напиши тесты в Selenide.
### Тестовые сценарии.
1) Выпадающий список в разделе «Вопросы о важном». Тебе нужно проверить: когда нажимаешь на стрелочку, открывается соответствующий текст. Важно написать отдельный тест на каждый вопрос.
2) Заказ самоката. Весь флоу позитивного сценария. Обрати внимание, что есть две точки входа в сценарий: кнопка «Заказать» вверху страницы и внизу.
   Из чего состоит позитивный сценарий:
   Нажать кнопку «Заказать». На странице две кнопки заказа;
   Заполнить форму заказа;
   Проверить, что появилось всплывающее окно с сообщением об успешном создании заказа.
   Нужно написать тесты с разными данными: минимум два набора.

Обратить внимание: в приложении есть баг, который не даёт оформить заказ. Он воспроизводится только в Chrome.
### Дополнительный тестовый сценарий.
Проверить ошибки для всех полей формы заказа.
