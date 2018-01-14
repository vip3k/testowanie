package Defects;

import Main.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by tomas on 2017-11-25.
 */
public class DefectsPage extends MainPage {
    WebDriver driver;

    public DefectsPage(WebDriver driver) {
        super(driver);
    }

    public void verifyDefectsPage() {
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Defects')]")).isDisplayed());
    }
}
