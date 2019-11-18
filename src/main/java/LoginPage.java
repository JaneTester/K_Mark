import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends LoginPageElements implements Messages {
    WebDriver driver;

    LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    WebElement getPopUpMessages() {
        return driver.findElement(popUpMessages);
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

    public void SignInInvalidValue(String password) {
        getLogin().sendKeys("kfhjlh@kjhkg");
        getPassword().sendKeys(password);
        getLoginButton().click();
    }

    public boolean hasClass(String className) {
        String classes = getPopUpMessages().getAttribute("class");
        for (String c : classes.split(" ")) {
            if (c.equals(className)) {
                return true;
            }
        }
        return false;
    }

}
