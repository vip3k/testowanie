import Project.ProjectPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by tomas on 2017-11-23.
 */
public class ProjectTest extends TestBase {


    private static String login = "administrator@testarena.pl";
    private static String pass = "sumXQQ72$L";


    @Test
    public void goToProjectPage() {
        super.loginPage
                .login(login, pass)
                .clickProject()
                .verifyProjectPage();


    }


    @Test
    public void goToMenagePage() {
        ProjectPage projectPage = PageFactory.initElements(driver, ProjectPage.class);
        loginPage.login(login, pass).clickProject();
        projectPage.clickMenage();
    }


}
