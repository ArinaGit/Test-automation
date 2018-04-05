package lesson07.proxy_elements_and_page_factory;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class FirstTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 //       driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 //       driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void firstResultContainExpectedText(){
        String query1 = "Dress";
        String query2 = "T-shirt";

        MainPage mainPage = new MainPage(driver);
        mainPage.enterQuery(query1);

        (new WebDriverWait(driver, 10))
                .until(textToBePresentInElement(mainPage.ADVICE_LOCATOR, query1));

        mainPage.enterQuery(query2);

        (new WebDriverWait(driver, 10))
                .until(textToBePresentInElement(mainPage.ADVICE_LOCATOR, query2));
    }

    class MainPage{
        By ADVICE_LOCATOR = By.xpath("//*[@id=\"index\"]/div[2]/ul/li[1]");
        By FIELD_QUERY_LOCATOR = By.id("search_query_top");

        private WebDriver driver;

        MainPage(WebDriver driver){
            this.driver = driver;
        }

        void  enterQuery (String query){
            driver.findElement(FIELD_QUERY_LOCATOR).click();
            driver.findElement(FIELD_QUERY_LOCATOR).clear();
            driver.findElement(FIELD_QUERY_LOCATOR).sendKeys(query);
        }

        WebElement $ (By locator){
            return driver.findElement(locator);
        }
    }

}
