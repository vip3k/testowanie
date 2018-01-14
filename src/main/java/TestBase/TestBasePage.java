package TestBase;

import Main.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by tomas on 2017-11-25.
 */
public class TestBasePage extends MainPage {
    WebDriver driver;

    public TestBasePage(WebDriver driver) {
        super(driver);
    }

    public void verifyTestBasePage() {
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Test base')]")).isDisplayed());
    }


}
