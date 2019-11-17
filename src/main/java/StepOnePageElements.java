import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StepOnePageElements {
    WebDriver driver;

    StepOnePageElements (WebDriver driver) {
        this.driver=driver;
    }

    By heading = By.xpath("//h1[text()='Добавить компанию']");
    By searchInput = By.xpath("//input[@type='search']");
    By listSearchCompany = By.xpath("//md-virtual-repeat-container[@md-auto-shrink-min='1']");

    By fullNameIPInput = By.xpath("//input[@name='fullName']");
    By innInput = By.xpath("//input[@name='inn']");
    By legalAddressInput = By.xpath("//div[contains(@class,'md-padding')]//input[@type='search']");

    By headingIPData = By.xpath("//h3[text()='Данные индивидуального предпринимателя']");
    By ogrnip = By.xpath("//input[@name='ogrn']");
    By headingLegalAddress = By.xpath("//h3[text()='Юридический адрес']");
    By checkboxMailingAddress = By.xpath("//md-checkbox[@type='checkbox']");
    By headingMailingAddress = By.xpath("//h3[text()='Почтовый адрес']");
    By mailingAddressInput = By.xpath("//input[@type='search']");

    By headingCompanyDetails = By.xpath("//h3[text()='Реквизиты организации']");
    By headingManagerDetails = By.xpath("//h3[text()='Данные руководителя']");
    By shortNameInput = By.xpath("//input[@name='shortName']");
    By kppInput = By.xpath("//input[@name='kpp']");
    By ogrn = By.xpath("//input[@name='ogrn']");
    By managementPostInput = By.xpath("//input[@name='managementPost']");
    By managementNameInput = By.xpath("//input[@name='managementName']");
    By managementBasisInput = By.xpath("//input[@name='managementBasis']");




    public WebElement getHeading (){return driver.findElement(heading);}
    public WebElement getSearchInput (){return driver.findElement(searchInput);}
    public WebElement getListSearchCompany (){return driver.findElement(listSearchCompany);}
    public WebElement getHeadingIPData (){return driver.findElement(headingIPData);}
    public WebElement getFullNameInput (){return driver.findElement(fullNameIPInput);}
    public WebElement getINNInput (){return driver.findElement(innInput);}
    public WebElement getOGRNIP (){return driver.findElement(ogrnip);}
    public WebElement getHeadingLegalAddress (){return driver.findElement(headingLegalAddress);}
    public WebElement getLegalAddressInput (){return driver.findElement(legalAddressInput);}
    public WebElement getCheckboxMailingAddress (){return driver.findElement(checkboxMailingAddress);}
    public WebElement getHeadingMailingAddress (){return driver.findElement(headingMailingAddress);}
    public WebElement getMailingAddressInput (){return driver.findElement(mailingAddressInput);}

    public WebElement getHeadingCompanyDetails (){return driver.findElement(headingCompanyDetails);}
    public WebElement getHeadingManagerDetails (){return driver.findElement(headingManagerDetails);}
    public WebElement getShortNameInput (){return driver.findElement(shortNameInput);}
    public WebElement getKPPInput (){return driver.findElement(kppInput);}
    public WebElement getOGRN (){return driver.findElement(ogrn);}
    public WebElement getManagementPostInput (){return driver.findElement(managementPostInput);}
    public WebElement getManagementNameInput (){return driver.findElement(managementNameInput);}
    public WebElement getManagementBasisInput (){return driver.findElement(managementBasisInput);}

}
