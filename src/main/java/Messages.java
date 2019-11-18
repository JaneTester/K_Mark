import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface Messages {
    By popUpMessages = By.xpath("//div[contains(concat(\" \", normalize-space(@class), \" \"), \" uc-notify \")]");
    By errorMessagesInForm = By.xpath("//div[text()='Обязательное поле']");

    boolean hasClass(String className);
}
