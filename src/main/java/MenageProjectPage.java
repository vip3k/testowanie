import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tosa on 2017-11-27.
 */
public class MenageProjectPage {

    WebDriver driver;
    @FindBy(xpath = "//a[@href='http://demo.testarena.pl/administration/project_view/206']")
    WebElement project;

    public MenageProjectPage(WebDriver driver) {
        this.driver = driver;
    }


    public MenageProjectPage clickMenage() {
        project.click();
        return new MenageProjectPage(driver);
    }


}
