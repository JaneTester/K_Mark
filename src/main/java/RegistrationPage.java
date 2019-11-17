import org.openqa.selenium.WebDriver;

public class RegistrationPage extends RegistrationPageElements {
    WebDriver driver;

    RegistrationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


}
