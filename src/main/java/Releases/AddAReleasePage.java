package Releases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tomas on 2018-01-14.
 */
public class AddAReleasePage {

    ReleasesPage releasesPage;

    @FindBy(id = "name")
    WebElement nameField;
    @FindBy(id = "startDate")
    WebElement startDate;

    WebDriver driver;

    public AddAReleasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String name) {

        nameField.clear();
        nameField.sendKeys(name);
    }

    public void setStartDate(String dzien) {
        startDate.click();
        startDate.sendKeys(dzien);
    }

    public void setEndDate(String dzien) {
        startDate.click();
        startDate.sendKeys(dzien);
    }


}
