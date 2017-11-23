import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by zp300424 on 27.05.2017.
 */
public class MainPage {

    WebDriver driver;
    @FindBy(xpath = "http://demo.testarena.pl/JB/project_view")
    WebElement clickProject;

    @FindBy(id = "head-top")
    WebElement headTop;



    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertUserIsLoggedIn() {
        assertTrue(driver.findElement(By.id("head-top")).isDisplayed());
    }

    public void clickProject() {
        clickProject.click();
    }

}
