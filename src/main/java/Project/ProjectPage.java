package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

/**
 * Created by tomas on 2017-11-23.
 */
public class ProjectPage {


    @FindBy(css = ".open[href*='project_view']")
    WebElement menage;
    @FindBy(css = "li >a.open[href='#']")
    WebElement attchamentbutton;
    @FindBy(xpath = "/a[@href='http://demo.testarena.pl/fefg/project_add_plan_ajax'")
    WebElement addAttachmentPlan;
    @FindBy(css = "li >a.open[href='#']")
    WebElement addAttachmentDocumentation;
    @FindBy(css = "[href$='project_view']")
    WebElement project;

    WebDriver driver;

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    public void clickAddAttachmentsPlan() {

        WebElement mySelectElement = attchamentbutton;
        Select dropdown = new Select(mySelectElement);
        dropdown.selectByIndex(1);

    }

    public void clickAddAttachmentsDocumentation() {
        addAttachmentDocumentation.click();
    }


    public MenageProjectPage clickMenage() {
        menage.click();
        return new MenageProjectPage(driver);
    }


    public void addattchment() {
        attchamentbutton.click();
    }

    public void verifyProjectPage() {
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Project')]")).isDisplayed());
    }


}
