import Environments.EnvironmentsPage;
import Environments.NewEnvironmentsPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by tomas on 2017-12-07.
 */
public class EnvironmentsTest extends TestBase {


    @Test
    public void goToEnvironmentsPage() {
        super.getLoginPage()
                .clickEnvironments()
                .verifyEnvironmentsPage();

    }


    @Test
    public void goToNewEnvPage() {
        EnvironmentsPage environmentsPage = PageFactory.initElements(driver, EnvironmentsPage.class);
        goToEnvironmentsPage();
        environmentsPage.clickAddAEnvironment().verifyNEwEnvPage();



    }


    @Test
    public void setNewEnv() {
        NewEnvironmentsPage newEnvironmentsPage = PageFactory.initElements(driver, NewEnvironmentsPage.class);
        goToNewEnvPage();
        newEnvironmentsPage
                .setNameOfEnv("Nowy Env")
                .setDescription("sdhjshdjshdjshjd")
                .saveButton();


    }


}
