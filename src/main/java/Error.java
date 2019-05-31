import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Error extends PageComponent{

    public Error(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        locator = By.cssSelector(".alert-danger");
    }
}
