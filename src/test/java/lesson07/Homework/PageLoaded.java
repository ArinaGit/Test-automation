package lesson07.Homework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

@RunWith (JUnit4.class)
public class PageLoaded extends BaseTest {

    static WebDriver driver;

    @Test
    public void pageIsLoaded(){

        String query2 = "Dress";
        MainPage mainPage = new MainPage (driver);
        mainPage.open_url ();

        mainPage.enterQuery(query2);

        assertThat(new ExpectedCondition<Boolean> () {
            @Override
            public Boolean apply(WebDriver driver) {
                return driver.getTitle().equals(query2);
            }
        });
     assertThat (textToBePresentInElementLocated (mainPage.PAGE_NAME, query2));

     String url = driver.getCurrentUrl ();
     String url_check =  "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=Dress&submit_search=";

     assertEquals (url, url_check);
    }

}