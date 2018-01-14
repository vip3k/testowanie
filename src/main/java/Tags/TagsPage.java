package Tags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by tomas on 2017-11-25.
 */
public class TagsPage {
    WebDriver driver;

    public TagsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyTagsPage() {
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Tags')]")).isDisplayed());
    }
}
