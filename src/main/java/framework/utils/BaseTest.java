package framework.utils;

//import java.util.concurrent.TimeUnit;

import framework.config.PropertiesConfig;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;






public class BaseTest {
    protected WebDriver driver;

    @Before
    public void setUp() {
        // Настройка WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);

        // Установка времени ожидания
//        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Переход на URL из конфигурации
        driver.get(PropertiesConfig.getUrl());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
