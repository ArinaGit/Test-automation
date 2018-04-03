package lesson05.Homework;

import org.hamcrest.core.StringContains;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;
import org.hamcrest.core.StringContains;


public class SearchTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        setProperty ("webdriver.chrome.driver", "C:\\Users\\Arina\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void search(){
           driver.findElement(By.id("search_query_top")).click();
           driver.findElement(By.id("search_query_top")).sendKeys("Printed Summer Dress");
           driver.findElement(By.id("search_query_top")).submit();

           assertThat(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]")).getText(),
                   containsString("Printed Summer Dress"));
           assertThat(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div[2]/div[2]")).getText(),
                   containsString("Showing 1 - 3 of 3 items"));


    }

}
