package lesson07;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

class MainPage extends BaseTest implements Locators{
    private WebDriver driver;
    MainPage(WebDriver driver) {
        this.driver = driver;
    }


    void enterQuery(String query) {
        $(FIELD_QUERY_LOCATOR).click ( );
        $(FIELD_QUERY_LOCATOR).clear();
        $(FIELD_QUERY_LOCATOR).sendKeys(query);
        $(FIELD_QUERY_LOCATOR).submit ( );
    }

    void open_url(){open ("http://automationpractice.com/index.php"); }


}
