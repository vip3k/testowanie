import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by tomas on 2017-11-23.
 */
public class ProjectPage {


    WebDriver driver;

    @FindBy(css = "a[href=\'http://demo.testarena.pl/administration/project_view/205\']")
    WebElement menage;
    @FindBy(xpath = "//a[@class='open button_link'] [@href='#']")
    WebElement attchamentbutton;
    @FindBy(xpath = "/a[@href='http://demo.testarena.pl/fefg/project_add_plan_ajax'")
    WebElement addAttachmentPlan;
    @FindBy(xpath = "/a[@href='http://demo.testarena.pl/fefg/project_add_documentation_ajax'")
    WebElement addAttachmentDocumentation;
    @FindBy(xpath = "//a[@href='http://demo.testarena.pl/administration/project_view/206']")
    WebElement project;


    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickAddAttachmentsPlan() {
        addAttachmentPlan.click();

    }

    public void clickAddAttachmentsDocumentation() {
        addAttachmentDocumentation.click();
            }



    public MenageProjectPage clickMenage() {
        menage.click();
        return new MenageProjectPage(driver);
    }


    public void addattchment(){
        attchamentbutton.click();
    }

    public void verifyProjectPage() {
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Project')]")).isDisplayed());
    }


}
