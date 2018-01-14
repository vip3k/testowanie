package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by tosa on 2017-11-27.
 */
public class MenageProjectPage {

    WebDriver driver;

    public MenageProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyMenagePage() {
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Project properties')]")).isDisplayed());
    }

}
