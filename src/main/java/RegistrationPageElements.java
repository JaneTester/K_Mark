import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageElements {
    WebDriver driver;

    RegistrationPageElements(WebDriver driver) {
        this.driver = driver;
    }

    By loginPageButton = By.xpath("//a[contains(text(),'Вход')]");
    By emailInput = By.xpath("//input[@name='EMAIL']");
    By nameInput = By.xpath("//input[@name='NAME']");
    By phoneInput = By.xpath("//input[@name='PHONE']");
    By registrationButton = By.xpath("//button[contains(text(),'Зарегистрироваться')]");
    By consentCheckbox = By.xpath("//div[contains(@class,'md-container')]");
    By consentLink = By.xpath("//a[text()='обработкой моих персональных данных']");

    public WebElement getLoginPageButton (){return driver.findElement(loginPageButton);}
    public WebElement getEmail (){return driver.findElement(emailInput);}
    public WebElement getName (){return driver.findElement(nameInput);}
    public WebElement getPhone (){return driver.findElement(phoneInput);}
    public WebElement getRegistrationButton (){return driver.findElement(registrationButton);}
    public WebElement getConsentCheckbox (){return driver.findElement(consentCheckbox);}
    public WebElement getConsentLink (){return driver.findElement(consentLink);}
}

