import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonForgetPassword extends PageComponent {

    public ButtonForgetPassword (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        locator = By.cssSelector(".btn-block[href='#ForgetPassword']");
    }
}
