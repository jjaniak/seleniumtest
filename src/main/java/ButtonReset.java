import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonReset extends PageComponent {

    public ButtonReset (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        locator = By.cssSelector(".resetbtn");
    }

}
