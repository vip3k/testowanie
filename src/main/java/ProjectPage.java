import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;

/**
 * Created by tomas on 2017-11-23.
 */
public class ProjectPage {


    WebDriver driver;

    @FindBy (css = "a[href=\'http://demo.testarena.pl/administration/project_view/198\']")
    WebElement menage;

    public ProjectPage (WebDriver driver){
        this.driver = driver;
    }

    public void menage(){
        menage.click();
    }


}
