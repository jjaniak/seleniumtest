import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputResetEmail extends InputField {

    public InputResetEmail(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        locator = By.id("resetemail");
    }

}
