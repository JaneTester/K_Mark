import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends LoginPageElements {
    WebDriver driver;

    LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public StepOnePage SignInAccount(String login, String password) {
        getLogin().sendKeys(login);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new StepOnePage(driver);
    }

    public void NewPassword(String login) {
        getForgotPassButton().click();
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.visibilityOf(getForgotPassForm()));
        getEmailInForm().sendKeys(login);
        getSendInFormButton().click();


    }

}
