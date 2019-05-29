import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Error {

    private WebDriver driver;
    private WebDriverWait wait;

    public Error(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private By errorLocator = By.cssSelector(".alert-danger");

    public String getMessage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorLocator));
        return driver.findElement(errorLocator).getText();
    }
}
