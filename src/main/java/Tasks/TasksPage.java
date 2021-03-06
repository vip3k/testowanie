package Tasks;

import Main.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by tomas on 2017-11-25.
 */
public class TasksPage extends MainPage {
    WebDriver driver;

    public TasksPage(WebDriver driver) {
        super(driver);

    }

    public void verifyTasksPage() {
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Tasks')]")).isDisplayed());
    }
}
