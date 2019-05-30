import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonLogin extends PageComponent {

    public ButtonLogin(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        locator = By.cssSelector("button.loginbtn");
    }
}
