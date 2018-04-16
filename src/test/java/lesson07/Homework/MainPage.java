package lesson07.Homework;

import org.openqa.selenium.WebDriver;

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
