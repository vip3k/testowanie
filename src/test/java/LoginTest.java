import org.junit.Test;


public class LoginTest extends MainTest{


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
        super.loginPage.openLoginPage()
                .setUser("v01")
                .setpPasswordInput("haslo123")
                .loginButton();

    }

    public void v01(){
    }


}
