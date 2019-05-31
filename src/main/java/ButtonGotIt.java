import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonGotIt extends PageComponent {

    public ButtonGotIt(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        locator = By.id("cookyGotItBtn");
    }

}
