import org.junit.Test;

/**
 * Created by tomas on 2017-12-07.
 */
public class RelasesTest extends TestBase {

    private static String login = "administrator@testarena.pl";
    private static String pass = "sumXQQ72$L";

    @Test
    public void goToReleasesPage() {
        MainPage mainPage = loginPage.login(login, pass);
        mainPage.clickReleases();
    }
}
