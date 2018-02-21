import Main.MainPage;
import Releases.AddAReleasePage;
import Releases.ReleasesPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by tomas on 2017-12-07.
 */
public class RelasesTest extends TestBase {



    private static String login = "administrator@testarena.pl";
    private static String pass = "sumXQQ72$L";
    MainPage mainPage;




    @Test
    public void goToReleasesPage() {
        super.getLoginPage().clickReleases().verifyReleasesPage();


    }

    public MainPage goToAnotherPage() {
        return mainPage = loginPage.login(login, pass);
    }

    @Test
    public void goToAddRelePage() {

        ReleasesPage releasesPage = PageFactory.initElements(driver, ReleasesPage.class);
        loginPage.login(login, pass).clickReleases();
        releasesPage.clickAddARelease();
        AddAReleasePage addAReleasePage = PageFactory.initElements(driver, AddAReleasePage.class);
        addAReleasePage.setName("sdsd");
        addAReleasePage.setEndDate("2018-01-08");
        addAReleasePage.setStartDate("2018-01-08");



    }

}
