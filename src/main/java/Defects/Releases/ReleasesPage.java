package Defects.Releases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by tomas on 2017-11-25.
 */
public class ReleasesPage{

    WebDriver driver;

    public ReleasesPage(WebDriver driver) {this.driver = driver;
    }

    public void verifyReleasesPage() {
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Releases')]")).isDisplayed());
    }

}
