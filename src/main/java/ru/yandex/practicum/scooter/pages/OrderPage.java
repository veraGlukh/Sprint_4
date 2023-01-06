package ru.yandex.practicum.scooter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public class OrderPage {
    private WebDriver driver;

    // Форма 1 - Для кого самокат
    // Поле ввода Имя
    private By nameInput = By.xpath(".//input[@placeholder='* Имя']");
    // Поле ввода Фамилия
    private By surnameInput = By.xpath(".//input[@placeholder='* Фамилия']");
    // Поле ввода Адрес
    private By addressInput = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // Список Станция метро
    private By metroStationInput = By.className("select-search__input");
    // Элементы списка Станция метро
    private By metroStationList = By.xpath(".//li[@class='select-search__row']/button");
    // Поле ввода Телефон
    private By phoneInput = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка Далее
    private By nextButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");

    // Форма 2 - Про аренду
    // Поле ввода Когда привезти самокат
    private By deliveryDateInput = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    // Кнопка раскрытия списка Срок аренды
    private By rentTimeInput = By.className("Dropdown-arrow");
    // Элементы списка Срок аренды
    private By rentTimeList = By.className("Dropdown-option");
    // Чек-боксы выбора цвета самоката
    private By colorCheckBoxes = By.className("Checkbox_Label__3wxSf");
    // Поле ввода Комментарий для курьера
    private By commentInput = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    // Кнопка Заказать
    private By orderButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    // Кнопка Да во всплывающем окне подтверждения заказа
    private By yesButton = By.xpath(".//button[text()='Да']");
    // Надпись Заказ оформлен во всплывающем окне оформленного заказа
    private By titleOrderCreated = By.xpath(".//div[text()='Заказ оформлен']");

    // Конструктор класса
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    // Метод заполнения поля Имя
    public void setName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }

    // Метод заполнения поля Фамилия
    public void setSurname(String surname) {
        driver.findElement(surnameInput).sendKeys(surname);
    }

    // Метод заполнения поля Адрес
    public void setAddress(String address) {
        driver.findElement(addressInput).sendKeys(address);
    }

    // Метод клика и получения элементов списка Станция метро
    public WebElement getMetroStationElements(int index) {
        driver.findElement(metroStationInput).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание загрузки списка
        List<WebElement> metroStationElements = driver.findElements(metroStationList);
        return metroStationElements.get(index);
    }

    // Метод заполнения поля Телефон
    public void setPhone(String phone) {
        driver.findElement(phoneInput).sendKeys(phone);
    }

    // Метод клика по кнопке Далее
    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    // Метод заполнения поля Когда привезти самокат
    public void setDeliveryDate(int dayAfter) {
        LocalDate currentDate = LocalDate.now();
        String deliveryDate = currentDate.plusDays(dayAfter).toString();
        driver.findElement(deliveryDateInput).sendKeys(deliveryDate);
    }

    // Метод клика и получения элементов списка Срок аренды
    public WebElement getRentTimeElements(int index) {
        driver.findElement(rentTimeInput).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание загрузки списка
        List<WebElement> rentTimeElements = driver.findElements(rentTimeList);
        return rentTimeElements.get(index);
    }

    // Метод получения элемента выбора цвета самоката
    public WebElement getColorElements(int index) {
        List<WebElement> colorElements = driver.findElements(colorCheckBoxes);
        return colorElements.get(index);
    }

    // Метод заполнения поля Комментарий
    public void setComment(String comment) {
        driver.findElement(commentInput).sendKeys(comment);
    }

    // Метод клика по кнопке Заказать
    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    // Метод клика по кнопке Да во всплывающем окне подтверждения заказа
    public void clickYesButton() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание загрузки кнопки
        driver.findElement(yesButton).click();
    }

    // Метод проверки отображения надписи Заказ оформлен
    public boolean isTitleOrderCreatedDisplayed() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание загрузки написи
        return driver.findElement(titleOrderCreated).isDisplayed();
    }
}
