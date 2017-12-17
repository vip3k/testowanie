import org.junit.Test;

/**
 * Created by tomas on 2017-12-07.
 */
public class EnvironmentsTest extends TestBase {

    private static String login = "administrator@testarena.pl";
    private static String pass = "sumXQQ72$L";

    @Test
    public void goToEnvironmentsPage() {
        MainPage mainPage = loginPage.login(login, pass);
        mainPage.clickEnvironments().verifyEnvironmentsPage();

    }
}
