import org.junit.Test;

/**
 * Created by tomas on 2017-11-23.
 */
public class ProjectTest extends TestBase {

    private static String login = "administrator@testarena.pl";
    private static String pass = "sumXQQ72$L";

    @Test
    public void goToProjectPage() {
        MainPage mainPage = loginPage.login(login, pass);
        mainPage.clickProject();


    }



}
