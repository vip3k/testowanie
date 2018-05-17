package Environments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by tomas on 2018-03-17.
 */
public class NewEnvironmentsPage {

    @FindBy(css = "#name")
    WebElement nameField;
    @FindBy(css = "#description")
    WebElement description;
    @FindBy(css = "#save")
    WebElement saveBtn;


    WebDriver driver;

    public NewEnvironmentsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyNEwEnvPage() {
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Add a new environment')]")).isDisplayed());
            }


    public NewEnvironmentsPage setNameOfEnv(String envName) {
        nameField.sendKeys(envName);
        return this;
    }

    public NewEnvironmentsPage setDescription(String descrip) {
        description.sendKeys(descrip);
        return this;
    }


    public void saveButton() {
        saveBtn.click();
    }

    public void verifyIfNewEnvHasBeenAdded() {
        assertTrue(driver.findElement(By.cssSelector(".icon_info")).isDisplayed());
    }


}
