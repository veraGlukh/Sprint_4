package Features;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        // driver = new FirefoxDriver();
    }

    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }
}
