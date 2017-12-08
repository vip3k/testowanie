import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by zp300424 on 27.05.2017.
 */
public class MainPage {

    WebDriver driver;
    @FindBy(css = "a[href='http://demo.testarena.pl/DS/project_view']")
    WebElement clickProject;
    @FindBy(linkText = "Releases")
    WebElement clickReleases;
    @FindBy(linkText = "Environments")
    WebElement clickEnvironments;
    @FindBy(linkText = "Versions")
    WebElement clickVersions;
    @FindBy(linkText = "Tags")
    WebElement clickTags;
    @FindBy(linkText = "Tasks")
    WebElement clickTasks;
    @FindBy(linkText = "Defects")
    WebElement clickDefects;
    @FindBy(linkText = "Test base")
    WebElement clickTestBase;
    @FindBy (linkText = "Files")
    WebElement clickFiles;
    @FindBy(id = "head-top")
    WebElement headTop;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertUserIsLoggedIn() {
        assertTrue(driver.findElement(By.id("head-top")).isDisplayed());
    }

    public ProjectPage clickProject() {
        clickProject.click();
        return new ProjectPage(driver);
    }

    public ReleasesPage clickReleases() {
        clickReleases.click();
        return new ReleasesPage(driver);

    }

    public EnvironmentsPage clickEnvironments() {
        clickEnvironments.click();
        return new EnvironmentsPage(driver);
    }

    public VersionsPage clickVersions() {
        clickVersions.click();
        return new VersionsPage(driver);
    }

    public TagsPage clickTags() {
        clickTags.click();
        return new TagsPage(driver);
    }

    public TasksPage clickTasks() {
        clickTasks.click();
        return new TasksPage(driver);
    }

    public DefectsPage clickDefects() {
        clickDefects.click();
        return new DefectsPage(driver);
    }

    public TestBasePage clickTestBase() {
        clickTestBase.click();
        return new TestBasePage(driver);

    }

    public FilesPage clickFiles() {
        clickFiles.click();
        return new FilesPage(driver);
    }
}
