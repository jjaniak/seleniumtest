import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button extends PageComponent {

    public Button(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private By locator;


    public void click() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).click();

    }

    public String getText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator).getText();

    }

    public void isItvisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).isDisplayed();
     //   assertTrue(isElementPresent(By.id("idOfElement")));

    }
}
