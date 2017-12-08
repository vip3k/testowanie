import org.junit.Test;

/**
 * Created by tosa on 2017-12-08.
 */
public class TagsTest extends TestBase {

    private static String login = "administrator@testarena.pl";
    private static String pass = "sumXQQ72$L";

    @Test
    public void goToTagsPage() {
        MainPage mainPage = loginPage.login(login, pass);
        mainPage.clickTags();


    }

}
