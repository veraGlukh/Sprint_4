package ru.yandex.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;

public class MainPage {
    private WebDriver driver;

    // Кнопка Заказать в правом верхнем углу
    private By topOrderButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']");

    // Кнопка Заказать после схемы
    private By bottomOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");

    // Вопрос о важном 1 - про оплату
    private By questionPayment = By.id("accordion__heading-0");

    // Ответ 1 - про оплату
    private By replyPayment = By.xpath(".//div[@id='accordion__panel-0']/p");

    // Вопрос о важном 2 - про количество самокатов
    private By questionScootersAmount = By.id("accordion__heading-1");

    //  Ответ 2 - про количество самокатов
    private By replyScootersAmount = By.xpath(".//div[@id='accordion__panel-1']/p");

    // Вопрос о важном 3 - про время аренды
    private By questionRentTime = By.id("accordion__heading-2");

    //  Ответ 3 - про время аренды
    private By replyRentTime = By.xpath(".//div[@id='accordion__panel-2']/p");

    // Вопрос о важном 4 - про заказ на сегодня
    private By questionTodayOrder = By.id("accordion__heading-3");

    //  Ответ 4 - про заказ на сегодня
    private By replyTodayOrder = By.xpath(".//div[@id='accordion__panel-3']/p");

    // Вопрос о важном 5 - про продление и ранний возврат
    private By questionOrderExtension = By.id("accordion__heading-4");

    //  Ответ 5 - про продление и ранний возврат
    private By replyOrderExtension = By.xpath(".//div[@id='accordion__panel-4']/p");

    // Вопрос о важном 6 - про зарядку самоката
    private By questionCharger = By.id("accordion__heading-5");

    //  Ответ 6 - про зарядку самоката
    private By replyCharger = By.xpath(".//div[@id='accordion__panel-5']/p");

    // Вопрос о важном 7 - про отмену заказа
    private By questionOrderCancellation = By.id("accordion__heading-6");

    //  Ответ 7 - про отмену заказа
    private By replyOrderCancellation = By.xpath(".//div[@id='accordion__panel-6']/p");

    // Вопрос о важном 8 - про доставку за МКАД
    private By questionDeliveryOutsideMoscow = By.id("accordion__heading-7");

    //  Ответ 8 - про доставку за МКАД
    private By replyDeliveryOutsideMoscow = By.xpath(".//div[@id='accordion__panel-7']/p");


    // Конструктор класса
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // Метод перехода на главную страницу тестового стенда
    public void openMainPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    // Метод клика по верхней кнопке Заказать:
    public void clickTopOrderButton() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание загрузки кнопки
        driver.findElement(topOrderButton).click();
    }

    // Метод клика по нижней кнопке Заказать:
    public void clickBottomOrderButton() {
        WebElement element = driver.findElement(bottomOrderButton); // скролл до кнопки
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(bottomOrderButton).click();
    }

    // Метод прокрутки до последнего вопроса в разделе Вопросы о важном:
    public void scrollToTheLastQuestion() {
        WebElement element = driver.findElement(questionDeliveryOutsideMoscow);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //Метод получения текста Ответа 1
    public String getTextReplyPayment() {
        driver.findElement(questionPayment).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание загрузки ответа
        driver.findElement(replyPayment);
        return driver.findElement(replyPayment).getText();
    }

    // Метод получения текста Ответа 2
    public String getTextReplyScootersAmount() {
        driver.findElement(questionScootersAmount).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание загрузки ответа
        driver.findElement(replyScootersAmount);
        return driver.findElement(replyScootersAmount).getText();
    }

    // Метод получения текста Ответа 3
    public String getTextReplyRentTime() {
        driver.findElement(questionRentTime).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание загрузки ответа
        driver.findElement(replyRentTime);
        return driver.findElement(replyRentTime).getText();
    }

    // Метод получения текста Ответа 4
    public String getTextReplyTodayOrder() {
        driver.findElement(questionTodayOrder).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание загрузки ответа
        driver.findElement(replyTodayOrder);
        return driver.findElement(replyTodayOrder).getText();
    }

    // Метод получения текста Ответа 5
    public String getTextReplyOrderExtension() {
        driver.findElement(questionOrderExtension).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание загрузки ответа
        driver.findElement(replyOrderExtension);
        return driver.findElement(replyOrderExtension).getText();
    }

    // Метод получения текста Ответа 6
    public String getTextReplyCharger() {
        driver.findElement(questionCharger).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание загрузки ответа
        driver.findElement(replyCharger);
        return driver.findElement(replyCharger).getText();
    }

    // Метод получения текста Ответа 7
    public String getTextReplyOrderCancellation() {
        driver.findElement(questionOrderCancellation).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание загрузки ответа
        driver.findElement(replyOrderCancellation);
        return driver.findElement(replyOrderCancellation).getText();
    }

    // Метод получения текста Ответа 8
    public String getTextReplyDeliveryOutsideMoscow() {
        driver.findElement(questionDeliveryOutsideMoscow).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание загрузки ответа
        driver.findElement(replyDeliveryOutsideMoscow);
        return driver.findElement(replyDeliveryOutsideMoscow).getText();
    }
}
