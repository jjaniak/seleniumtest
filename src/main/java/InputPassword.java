import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputPassword extends InputField {

    public  InputPassword (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        locator = By.name("password");
    }
}