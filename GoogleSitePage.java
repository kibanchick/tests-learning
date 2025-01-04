
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class GoogleSitePage extends GoogleTest {

    @FindBy(id = "APjFqb")
    private WebElement textArea;

    public void setTextArea(String str){
        this.textArea.sendKeys(str + Keys.ENTER);
    }

    public String getTextArea() {
        return this.textArea.getText();
    }
@Before

@After

    public void someTest(){
        //logics
    }
}
