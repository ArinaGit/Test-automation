package lesson07;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;

@RunWith (JUnit4.class)
public class ElementHasText extends BaseTest {

    @Test
    public void listNthElementHasText(){

        String query = "Dress";
        int n =2;
        MainPage mainPage = new MainPage (driver);
        mainPage.open_url ();

        List<WebElement> $$(By locator){
            return assertThat(visibilityOfAllElementsLocatedBy(locator));

        try {
            mainPage.enterQuery (query);
            assertThat (textToBePresentInElementLocated (mainPage.DRESS_NUMBER, query1));
        }
        catch (IndexOutOfBoundsException e){

            System.out.println("Ошибка:" + e);;
        }

            ArrayList<String> myList1 = new ArrayList <String> (){
            myList1.add("fes");

            }


        }


//*[@id="center_column"]/ul/li[1]
    //*[@id="center_column"]/ul/li[2]
}

