import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class StepOnePageTest {
    public WebDriver driver;
    public LoginPage loginPage;
    public LoginPageElements loginElements;
    public StepOnePage stepOnePage;
    public LoginData loginData;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Melkish\\IdeaProjects\\K_Mark\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://mark.thisisit.ru/login");
        loginPage = new LoginPage(driver);
        loginElements = new LoginPageElements(driver);
        loginData = new LoginData();
        stepOnePage = new StepOnePage(driver);
        WebDriverWait wait = (new WebDriverWait(driver, 10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='uc-preloader__inner']")));
        wait.until(ExpectedConditions.visibilityOfAllElements(loginElements.getLogin()));
        loginPage.SignInAccount(loginData.login,loginData.password);
    }
    @Test
    public void GetCheckFieldValueIPInformationTest (){
       stepOnePage.GetCheckFieldValueIPInformation();
    }
    @Test
    public void GetCheckFieldValueInformationTest (){
        stepOnePage.GetCheckFieldValueCompanyInformation();
    }
}
