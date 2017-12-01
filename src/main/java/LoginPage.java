import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    WebDriver driver;

    @FindBy(id = "email")
    WebElement loginField;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "login")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage setUser(String login_field) {
        loginField.sendKeys(login_field);
        return this;
    }


    public LoginPage setpPasswordInput(String password) {
        passwordInput.sendKeys(password);
        return this;
    }


    public MainPage loginButton() {
        loginButton.click();
        return new MainPage(driver);
    }

    public LoginPage openLoginPage() {
        //Doesn't work
        driver.get("http://demo.testarena.pl/zaloguj");
        return this;
    }

    public MainPage login(String login, String password){
        setUser("administrator@testarena.pl");
        setpPasswordInput("sumXQQ72$L");
        loginButton();
        return PageFactory.initElements(driver, MainPage.class);
    }

}
