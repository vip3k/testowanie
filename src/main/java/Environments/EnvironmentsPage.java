package Environments;

import Main.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by tomas on 2017-11-25.
 */
public class EnvironmentsPage extends MainPage {
    WebDriver driver;

    public EnvironmentsPage (WebDriver driver){
        super(driver);
    }

    public void verifyEnvironmentsPage() {
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Environments')]")).isDisplayed());
    }
}
