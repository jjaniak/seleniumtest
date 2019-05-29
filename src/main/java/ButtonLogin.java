import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonLogin extends Button {

    private WebDriver driver;
    private WebDriverWait wait;

    public ButtonLogin(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private By loginButton = By.cssSelector("button.loginbtn");



}
