package lesson05.Homework;

import org.hamcrest.core.StringContains;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.System.*;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;


public class LoginTest {

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
    public void login(){
        driver.findElement (By.xpath ("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement (By.id ("email")).sendKeys ("arina.shvydka@gmail.com");
        driver.findElement (By.id ("passwd")).sendKeys ("yourlogo1");
        driver.findElement (By.id ("SubmitLogin")).click();

    }

    public void orgerHistory(){
        driver.findElement (By.xpath ("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")).click();
        assertThat(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1")).getText(),
                containsString("Order history"));
    }

    public void myCredit(){
        driver.findElement (By.xpath ("//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a/span")).click();
        assertThat(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1")).getText(),
                containsString("Credit slips"));
    }

    public void myAddresses(){
        driver.findElement (By.xpath ("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")).click();
        assertThat(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1")).getText(),
                containsString("My addresses"));
    }

    public void myPersonalInfo(){
        driver.findElement (By.xpath ("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span")).click();
        assertThat(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1")).getText(),
                containsString("Your personal information"));
    }

    public void myWishlist(){
        driver.findElement (By.xpath ("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")).click();
        assertThat(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div/h1")).getText(),
                containsString("My wishlists"));
    }

}
