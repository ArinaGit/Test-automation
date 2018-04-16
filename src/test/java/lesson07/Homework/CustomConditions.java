package lesson07.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;

public class CustomConditions {

        public static ExpectedCondition<Boolean> listNthElementHasText (By locator, int NthElement, String text){
            return driver -> {
                List<WebElement> list = driver.findElements (locator);
                return list.get(NthElement).getText().equals (text);
            };
        }

}
