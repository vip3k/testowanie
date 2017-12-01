import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

/**
 * Created by tomas on 2017-11-23.
 */
public class TestBase {

    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void openTestArena() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.openLoginPage();



    }


    @After
    public void logout() {
        driver.close();
    }

}
