package TestBase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormTestPage extends TestBasee {
    WebDriver driver;


    @FindBy(id = "name")
    WebElement name;
    @FindBy(id = "surname")
    WebElement surname;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "phone")
    WebElement phone;
    @FindBy(id = "comment")
    WebElement comment;
    @FindBy(id = "age")
    WebElement age;
    @FindBy(id = "login")
    WebElement loginButton;


    public FormTestPage(WebDriver driver) {
        this.driver = driver;
    }

    public FormTestPage setName(String name) {
        this.name.sendKeys(name);
        return this;
    }

    public FormTestPage setSurname(String surname) {
        this.surname.sendKeys(surname);
        return this;
    }

    public FormTestPage setEmail(String email) {
        this.email.sendKeys(email);
        return this;
    }

    public FormTestPage setComment(String comment) {
        this.comment.sendKeys(comment);
        return this;
    }

    public FormTestPage setPhone(String phone) {
        this.phone.sendKeys(phone);
        return this;
    }

    public FormTestPage setAge(String age) {
        this.age.sendKeys(age);
        return this;

    }

    public FormTestPage openFormTestPage() {
        driver.get("http://testpage.pl/form ");

    }

    public FormTestPage submit() {
        loginButton.click();
        return new FormTestPage(driver);
    }
}

class TestBasee {

    WebDriver driver;
    FormTestPage formTestPage;


    @Before
    public void openTestPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\c…\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        formTestPage = PageFactory.initElements(driver, FormTestPage.class);
        formTestPage.openFormTestPage();


    }


    @After
    public void logout() {
        driver.close();
    }


}

public class FormTest extends TestBasee {

    @Test
    public void goToFormTest() {
        super.formTestPage
                .setName("TestName")
                .setSurname("TestSurname")
                .setEmail("testemail @o.pl")
                .setAge("10")
                .setPhone("+7838378333")
                .submit();


    }
}