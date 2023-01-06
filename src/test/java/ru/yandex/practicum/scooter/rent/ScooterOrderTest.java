package ru.yandex.practicum.scooter.rent;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.practicum.scooter.pages.MainPage;
import ru.yandex.practicum.scooter.pages.OrderPage;

@RunWith(Parameterized.class)
public class ScooterOrderTest extends BaseTest {
    final ScooterOrderTestData testData;

    public ScooterOrderTest(ScooterOrderTestData testData) {
        this.testData = testData;
    }

    @Parameterized.Parameters (name = "Тестовые данные: имя {0}, фамилия {1}, адрес {2}, " +
            "телефон {3}, комментарий {4}, список индексов {5}: станция метро [0], дата (сегодня + [1]), срок от 1 до 7 суток [2], цвет [3]") //добавлен аргумент name
    public static Object[][] data() {
        return new Object[][]{
                {new ScooterOrderTestData("Тест", "Тестов", "Смоленская", "89261231234", "Спасибо", new int[]{0, 1, 0, 0})},
                {new ScooterOrderTestData("Иван", "Иванов", "Тверская", "89261231256", "Не звоните, пишите в телеграмм", new int[]{1, 6, 6, 1})}
        };
    }

    @Test
    public void checkIsOrderCreatedByTopOrderButton() {
        // Создание объекта класса главной страницы
        MainPage objMainPage = new MainPage(driver);
        // Создание объекта класса страницы заказа
        OrderPage objOrderPage = new OrderPage(driver);
        objMainPage.openMainPage();
        objMainPage.clickTopOrderButton(); // клик по верхней кнопке Заказать
        objOrderPage.setName(testData.name);
        objOrderPage.setSurname(testData.surname);
        objOrderPage.setAddress(testData.address);
        objOrderPage.getMetroStationElements(testData.indexes[0]).click();
        objOrderPage.setPhone(testData.phone);
        objOrderPage.clickNextButton();
        objOrderPage.setDeliveryDate(testData.indexes[1]);
        objOrderPage.getRentTimeElements(testData.indexes[2]).click();
        objOrderPage.getColorElements(testData.indexes[3]).click();
        objOrderPage.setComment(testData.comment);
        objOrderPage.clickOrderButton();
        objOrderPage.clickYesButton();
        boolean actual = objOrderPage.isTitleOrderCreatedDisplayed();
        Assert.assertTrue("Номер заказа не найден:", actual);
    }

    @Test
    public void checkIsOrderCreatedByBottomOrderButton() {
        // Создание объекта класса главной страницы
        MainPage objMainPage = new MainPage(driver);
        // Создание объекта класса страницы заказа
        OrderPage objOrderPage = new OrderPage(driver);
        objMainPage.openMainPage();
        objMainPage.clickBottomOrderButton(); // клик по нижней кнопке Заказать
        objOrderPage.setName(testData.name);
        objOrderPage.setSurname(testData.surname);
        objOrderPage.setAddress(testData.address);
        objOrderPage.getMetroStationElements(testData.indexes[0]).click();
        objOrderPage.setPhone(testData.phone);
        objOrderPage.clickNextButton();
        objOrderPage.setDeliveryDate(testData.indexes[1]);
        objOrderPage.getRentTimeElements(testData.indexes[2]).click();
        objOrderPage.getColorElements(testData.indexes[3]).click();
        objOrderPage.setComment(testData.comment);
        objOrderPage.clickOrderButton();
        objOrderPage.clickYesButton();
        boolean actual = objOrderPage.isTitleOrderCreatedDisplayed();
        Assert.assertTrue("Надпись Заказ оформлен не отображается:", actual);
    }
}

