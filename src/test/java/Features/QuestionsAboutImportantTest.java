package Features;
import ru.yandex.practicum.MainPage;
import org.junit.Assert;
import org.junit.Test;

public class QuestionsAboutImportantTest extends BaseTest{

    @Test
    public void isReplyPaymentTextCorrect() {
        // Создание объекта класса главной страницы
        MainPage objMainPage = new MainPage(driver);

        objMainPage.openMainPage();

        objMainPage.scrollToTheLastQuestion();

        String expectedReplyPayment = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

        String actualReplyPayment = objMainPage.getTextReplyPayment();

        Assert.assertEquals("Текст ответа на вопрос про оплату отличается:", expectedReplyPayment, actualReplyPayment);
    }

    @Test
    public void isReplyScootersAmountTextCorrect() {
        // Создание объекта класса главной страницы
        MainPage objMainPage = new MainPage(driver);

        objMainPage.openMainPage();

        objMainPage.scrollToTheLastQuestion();

        String expectedReplyScootersAmount = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

        String actualReplyScootersAmount = objMainPage.getTextReplyScootersAmount();

        Assert.assertEquals("Текст ответа на вопрос про количество самокатов отличается:", expectedReplyScootersAmount, actualReplyScootersAmount);
    }

    @Test
    public void isReplyRentTimeTextCorrect() {
        // Создание объекта класса главной страницы
        MainPage objMainPage = new MainPage(driver);

        objMainPage.openMainPage();

        objMainPage.scrollToTheLastQuestion();

        String expectedReplyRentTime = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

        String actualReplyRentTime = objMainPage.getTextReplyRentTime();

        Assert.assertEquals("Текст ответа на вопрос про время аренды отличается:", expectedReplyRentTime, actualReplyRentTime);
    }

    @Test
    public void isReplyTodayOrderTextCorrect() {
        // Создание объекта класса главной страницы
        MainPage objMainPage = new MainPage(driver);

        objMainPage.openMainPage();

        objMainPage.scrollToTheLastQuestion();

        String expectedReplyTodayOrder = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

        String actualReplyTodayOrder = objMainPage.getTextReplyTodayOrder();

        Assert.assertEquals("Текст ответа на вопрос про заказ сегодня отличается:", expectedReplyTodayOrder, actualReplyTodayOrder);
    }

    @Test
    public void isReplyOrderExtensionTextCorrect() {
        // Создание объекта класса главной страницы
        MainPage objMainPage = new MainPage(driver);

        objMainPage.openMainPage();

        objMainPage.scrollToTheLastQuestion();

        String expectedReplyOrderExtension = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

        String actualReplyOrderExtension = objMainPage.getTextReplyOrderExtension();

        Assert.assertEquals("Текст ответа на вопрос про продление заказа отличается:", expectedReplyOrderExtension, actualReplyOrderExtension);
    }

    @Test
    public void isReplyChargerTextCorrect() {
        // Создание объекта класса главной страницы
        MainPage objMainPage = new MainPage(driver);

        objMainPage.openMainPage();

        objMainPage.scrollToTheLastQuestion();

        String expectedReplyCharger = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

        String actualReplyCharger = objMainPage.getTextReplyCharger();

        Assert.assertEquals("Текст ответа на вопрос про зарядку самоката отличается:", expectedReplyCharger, actualReplyCharger);
    }

    @Test
    public void isReplyOrderCancellationTextCorrect() {
        // Создание объекта класса главной страницы
        MainPage objMainPage = new MainPage(driver);

        objMainPage.openMainPage();

        objMainPage.scrollToTheLastQuestion();

        String expectedReplyOrderCancellation = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

        String actualReplyOrderCancellation = objMainPage.getTextReplyOrderCancellation();

        Assert.assertEquals("Текст ответа на вопрос про отмену заказа отличается:", expectedReplyOrderCancellation, actualReplyOrderCancellation);
    }

    @Test
    public void isReplyDeliveryOutsideMoscowTextCorrect() {
        // Создание объекта класса главной страницы
        MainPage objMainPage = new MainPage(driver);

        objMainPage.openMainPage();

        objMainPage.scrollToTheLastQuestion();

        String expectedReplyDeliveryOutsideMoscow = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

        String actualReplyDeliveryOutsideMoscow = objMainPage.getTextReplyDeliveryOutsideMoscow();

        Assert.assertEquals("Текст ответа на вопрос про доставку за МКАД отличается:", expectedReplyDeliveryOutsideMoscow, actualReplyDeliveryOutsideMoscow);
    }
}
