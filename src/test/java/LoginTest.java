import org.junit.Test;


public class LoginTest extends TestBase {


    @Test
    public void shouldLogin() {

        super.loginPage
                .setUser("administrator@testarena.pl")
                .setpPasswordInput("sumXQQ72$L")
                .loginButton()
                .assertUserIsLoggedIn();
    }


    @Test
    public void shouldNotLogin() {
        super.loginPage
                .setUser("Wrongusertestname")
                .setpPasswordInput("haslo123")
                .loginButton();
    }


}
