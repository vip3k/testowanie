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

    @FindBy(id = "head-top")
    WebElement headTop;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertUserIsLoggedIn() {
        Assert.assertTrue(headTop.isDisplayed());
    }

    public void clickZadania() {
        clickZadania.click();
    }

}
