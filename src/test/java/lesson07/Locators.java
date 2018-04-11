package lesson07;

import org.openqa.selenium.By;

public interface Locators {

    By FIELD_QUERY_LOCATOR = By.id("search_query_top");
    By PAGE_NAME = By.xpath ("//*[@id=\"center_column\"]/h1/span[1]");
    By ELEMENT_DISAPPEARS = By.xpath ("//*[@id=\"center_column\"]/ul/li[1]/div");
}
