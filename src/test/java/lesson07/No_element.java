package lesson07;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

@RunWith(JUnit4.class)
public class No_element extends BaseTest {

    static WebDriver driver;

    @Test
    public void pageIsLoaded() {

        String query3 = "Shorts";
        MainPage mainPage = new MainPage (driver);
        mainPage.open_url ( );

        mainPage.enterQuery (query3);

        assertThat (new ExpectedCondition<Boolean> ( ) {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return driver.findElement (mainPage.ELEMENT_DISAPPEARS).isDisplayed ( );
                } catch (Exception e1) {
                    return true;
                }
            }
        });

    }
}
