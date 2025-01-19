package framework.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
    private WebDriver driver;

    @Getter(lazy = true)
    private final WebElement searchInput = driver.findElement(By.xpath("//input[@name='q']"));

    @Getter(lazy = true)
    private final WebElement searchButton = driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));

    @Getter(lazy = true)
    private final WebElement firstResult = driver.findElement(By.xpath("(//h3)[1]"));

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String query) {
        getSearchInput().sendKeys(query);
        getSearchButton().click();
    }

    public String getFirstResultText() {
        return getFirstResult().getText();
    }
}
