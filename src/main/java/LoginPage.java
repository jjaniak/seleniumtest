import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;


public class LoginPage extends Page {

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private By inputEmail = By.name("username");

    private void typeEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmail));
        driver.findElement(inputEmail).sendKeys(email);
    }

    private By inputPassword = By.name("password");

    private void typePassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputPassword));
        driver.findElement(inputPassword).sendKeys(password);
    }

    private By loginButton = By.cssSelector("button.loginbtn");

    private void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void loginWith(String email, String password) {
        typeEmail(email);
        typePassword(password);
        clickLogin();
    }

    public void verifyInvalidCredentialsErrorIs(String message) {
        assertEquals(message, error.getMessage());
    }


    public void closePopup() {
        driver.findElement(By.cssSelector("button[id='cookyGotItBtn']")).click();
    }

    public void clickForgetPassword() {
        driver.findElement(By.cssSelector(".btn-block[href='#ForgetPassword']")).click();
    }

    private By resetEmailSelector = By.cssSelector("input[id='resetemail']");

    public void typeInvalidEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(resetEmailSelector));
        driver.findElement(resetEmailSelector).sendKeys(email);
    }

    public void clickResetButton() {
        driver.findElement(By.cssSelector(".resetbtn")).click();
    }

    public void verifyInvalidEmailErrorIs(String message) {
        assertEquals(message, error.getMessage());
    }
}
