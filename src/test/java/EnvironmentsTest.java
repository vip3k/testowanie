import org.junit.Test;

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
}
