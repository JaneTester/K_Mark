import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageElements {
    WebDriver driver;

    LoginPageElements(WebDriver driver) {
        this.driver = driver;
    }

    By registrationPageButton = By.xpath("//a[contains(text(),'Регистрация')]");
    By loginInput = By.xpath("//input[@name='LOGIN']");
    By passwordInput = By.xpath("//input[@name='PASS']");
    By loginButton = By.xpath("//button[contains(text(),'Войти')]");
    By forgotPassButton = By.xpath("//button[contains(text(),'Забыли пароль?')]");

    By forgotPassForm = By.xpath("//form[@name='RestorePassForm']");
    By emailInFormInput = By.xpath("//input[@name='name']");
    By sendInFormButton = By.xpath("//button[contains(text(),'Отправить')]");
    By closeInFormButton = By.xpath("//button[contains(text(),'Закрыть')]");
    By forgotPassPopUp = By.xpath("//div[text()='Мы отправили новый пароль на Вашу почту.']");

    public WebElement getRegistrationPageButton() {return driver.findElement(registrationPageButton);}
    public WebElement getLogin() {return driver.findElement(loginInput);}
    public WebElement getPassword() {return driver.findElement(passwordInput);}
    public WebElement getLoginButton() {return driver.findElement(loginButton);}
    public WebElement getForgotPassButton() {return driver.findElement(forgotPassButton);}

    public WebElement getForgotPassForm() {return driver.findElement(forgotPassForm);}
    public WebElement getEmailInForm() {return driver.findElement(emailInFormInput);}
    public WebElement getSendInFormButton() {return driver.findElement(sendInFormButton);}
    public WebElement getCloseInFormButton() {return driver.findElement(closeInFormButton);}
    public WebElement getForgotPassPopUp() {return driver.findElement(forgotPassPopUp);}

}
