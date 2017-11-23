import org.junit.Test;

/**
 * Created by tomas on 2017-11-23.
 */
public class ProjectTest extends MainTest{


    ProjectPage projectPage;
    MainPage mainPage;


    @Test
    public void goToMenagePage() {
     mainPage.clickProject();
     projectPage.menage();
    }

}
