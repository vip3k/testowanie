package Versions;

import Main.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by tomas on 2017-11-25.
 */
public class VersionsPage extends MainPage {

    WebDriver driver;

    public VersionsPage(WebDriver driver) {
        super(driver);
    }

    public void verifyVersionsPage() {
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Versions')]")).isDisplayed());
    }
}
