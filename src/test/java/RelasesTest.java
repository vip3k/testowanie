import Main.MainPage;
import org.junit.Test;

/**
 * Created by tomas on 2017-12-07.
 */
public class RelasesTest extends TestBase {

    private static String login = "administrator@testarena.pl";
    private static String pass = "sumXQQ72$L";
    MainPage mainPage;

    @Test
    public void goToReleasesPage() {
        super.loginPage.login(login, pass).clickReleases().verifyReleasesPage();

    }

    public MainPage goToAnotherPage() {
        return mainPage = loginPage.login(login, pass);
    }


}
