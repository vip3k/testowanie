package Releases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by tomas on 2017-11-25.
 */
public class ReleasesPage {
    @FindBy(xpath = "//a[contains(text(), 'Add a release')]")
    WebElement addARelease;
    WebDriver driver;

    public ReleasesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyReleasesPage() {
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Releases')]")).isDisplayed());
    }

    public AddAReleasePage clickAddARelease() {
        addARelease.click();
    return new AddAReleasePage(driver);
    }

}
