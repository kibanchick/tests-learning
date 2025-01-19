package tests;


import framework.pages.GooglePage;
import framework.utils.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GoogleTest extends BaseTest {

    @Test
    public void testPiSearch() {
        GooglePage googlePage = new GooglePage(driver);

        // Поиск числа пи
        googlePage.search("число пи");

        // Проверка, что результат содержит 3.1415926
        String firstResult = googlePage.getFirstResultText();
        assertTrue("Результат не содержит 3.1415926", firstResult.contains("3.1415926"));
    }
}
