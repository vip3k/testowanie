import Login.LoginPage;
import Main.MainPage;
import Project.ProjectPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by tomas on 2017-11-23.
 */
public class TestBase {

    WebDriver driver;
    WebDriverWait wait;
    LoginPage loginPage;


    private static String login = "administrator@testarena.pl";
    private static String pass = "sumXQQ72$L";


    @Before
    public void openTestArena() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.openLoginPage();


    }


    @After
    public void logout() {
        driver.close();
    }


    public MainPage getLoginPage() {
        return loginPage.login(login, pass);
    }


}

