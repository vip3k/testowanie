import org.junit.Test;

/**
 * Created by tosa on 2017-12-08.
 */
public class DefectsTest extends TestBase{
    private static String login = "administrator@testarena.pl";
    private static String pass = "sumXQQ72$L";

    @Test
    public void goToDefectsPage() {
        super.loginPage
                .login(login, pass)
                .clickDefects()
                .verifyDefectsPage();

    }
}
