import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class StepOnePage extends StepOnePageElements {
    WebDriver driver;

    StepOnePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void GetSearchCompany(String input) {
        getSearchInput().sendKeys(input);
        WebElement result = getListSearchCompany();
        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(result)
                .click().build();
        seriesOfActions.perform();
    }

    public void GetCheckFieldValueIPInformation() {
        GetSearchCompany("ИП Ом Александра Владимировна");
        Assert.assertEquals("Данные индивидуального предпринимателя", getHeadingIPData().getText());
        Assert.assertEquals("Юридический адрес", getHeadingLegalAddress().getText());
        String valueFullName = getFullNameInput().getAttribute("value");
        System.out.println(valueFullName);
        Assert.assertNotNull(valueFullName);
        String valueINN = getINNInput().getAttribute("value");
        System.out.println(valueINN);
        Assert.assertNotNull(valueINN);
        String valueOGRNIP = getOGRNIP().getAttribute("value");
        System.out.println(valueOGRNIP);
        Assert.assertNotNull(valueOGRNIP);
        String valueLegalAddress = getLegalAddressInput().getAttribute("value");
        System.out.println(valueLegalAddress);
        Assert.assertNotNull(valueLegalAddress);
    }

    public void GetCheckFieldValueCompanyInformation() {
        GetSearchCompany("Сиденис");
        Assert.assertEquals("Реквизиты организации", getHeadingCompanyDetails().getText());
        Assert.assertEquals("Данные руководителя", getHeadingManagerDetails().getText());
        Assert.assertEquals("Юридический адрес", getHeadingLegalAddress().getText());
        String valueFullName = getFullNameInput().getAttribute("value");
        System.out.println(valueFullName);
        Assert.assertNotNull(valueFullName);
        String valueShortNameInput = getShortNameInput().getAttribute("value");
        System.out.println(valueShortNameInput);
        Assert.assertNotNull(valueShortNameInput);
        String valueINNInput = getINNInput().getAttribute("value");
        System.out.println(valueINNInput);
        Assert.assertNotNull(valueINNInput);
        String valueKPPInput = getKPPInput().getAttribute("value");
        System.out.println(valueKPPInput);
        Assert.assertNotNull(valueKPPInput);
        String valueOGRN = getOGRN().getAttribute("value");
        System.out.println(valueOGRN);
        Assert.assertNotNull(valueOGRN);
        String valueManagementPostInput = getManagementPostInput().getAttribute("value");
        System.out.println(valueManagementPostInput);
        Assert.assertNotNull(valueManagementPostInput);
        String valueManagementNameInput = getManagementNameInput().getAttribute("value");
        System.out.println(valueManagementNameInput);
        Assert.assertNotNull(valueManagementNameInput);
        String valueManagementBasisInput = getManagementBasisInput().getAttribute("value");
        System.out.println(valueManagementBasisInput);
        Assert.assertNotNull(valueManagementBasisInput);
        String valueLegalAddressInput = getLegalAddressInput().getAttribute("value");
        System.out.println(valueLegalAddressInput);
        Assert.assertNotNull(valueLegalAddressInput);
    }
}
