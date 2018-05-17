package Environments;

import Main.MainPage;
import Project.MenageProjectPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

/**
 * Created by tomas on 2017-11-25.
 */
public class EnvironmentsPage {


    @FindBy(css = ".button_link[href*='add_environment']")
    WebElement addEnvironment;

    WebDriver driver;

    public EnvironmentsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    public void verifyEnvironmentsPage() {
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Environments')]")).isDisplayed());
    }

    public NewEnvironmentsPage clickAddAEnvironment() {

        addEnvironment.click();
        return new NewEnvironmentsPage(driver);
    }
}

