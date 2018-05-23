import org.junit.Test;


public class LoginTest extends TestBase {


    @Test
    public void shouldLogin() {

        super.loginPage
                .setUser("administrator@testarena.pl")
                .setPasswordInput("sumXQQ72$L")
                .loginButton()
                .assertUserIsLoggedIn();
            }


    @Test
    public void shouldNotLogin() {
        super.loginPage
                .setUser("Wrongusertestname")
                .setPasswordInput("haslo123")
                .loginButton();
    }

    public void v02(){}


}
