import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputEmail extends InputField {

    public  InputEmail (WebDriver webDriver, WebDriverWait wait) {
        super(driver, wait);
        locator = By.name("username");
    }
}
