package lesson06;

import org.hamcrest.core.StringContains;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class Implicit {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
     //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
     //   driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void firstResultContainExpectedText(){
        String query = "Dress";
        driver.findElement(By.id("Search_query_top")).click();
        driver.findElement(By.id("search_query_top")).sendKeys(query);

       assertThat(driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/ul/li[1]")).getText(),
                containsString(query));
    }

}
