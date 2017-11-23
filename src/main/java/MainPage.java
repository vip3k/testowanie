import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by zp300424 on 27.05.2017.
 */
public class MainPage {

    WebDriver driver;
    @FindBy(xpath = "//a[@href=\"http://demo.testarena.pl/JB/tasks\"]")
    WebElement clickZadania;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertUserIsLoggedIn() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/pulls']")).isDisplayed());
    }

    public void clickZadania() {
        clickZadania.click();
    }

}
