package framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class CommonFunctions {
    private WebDriver driver;

    public CommonFunctions(WebDriver driver) {
        this.driver = driver;
    }

    public void fluentWait(long timeoutSeconds, long pollingMillis, ExpectedCondition<?> condition) {
        new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutSeconds))
                .pollingEvery(Duration.ofMillis(pollingMillis))
                .ignoring(Exception.class)
                .until(condition);
    }
}
