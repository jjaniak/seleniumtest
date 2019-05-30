import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;


public class LoginPage extends Page {

    private ButtonLogin buttonLogin = new ButtonLogin(driver, wait);
    private ButtonForgetPassword buttonForgetPassword = new ButtonForgetPassword(driver, wait);
    private ButtonReset buttonReset = new ButtonReset(driver, wait);
    private ButtonCookie buttonCookie = new ButtonCookie(driver, wait);
    private InputEmail inputEmail = new InputEmail(driver, wait);
    private InputPassword inputPassword = new InputPassword(driver, wait);


    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

//    private By inputEmail = By.name("username");
//
//    private void typeText(String email) {
//        inputEmail.typeText(email);
//    }
//
//     private By inputPassword = By.name("password");
//
//    private void typePassword(String password) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(inputPassword));
//        driver.findElement(inputPassword).sendKeys(password);
//    }

    private void clickLogin() {
        buttonLogin.click();}       // oneliner like here?


    public void loginWith(String email, String password) {
        inputEmail.typeText(email);
        inputPassword.typeText(password);
        clickLogin();
    }

    public void verifyInvalidCredentialsErrorIs(String message) {
        assertEquals(message, error.getText());
    }


    public void closePopup() {
        buttonCookie.click();
    }

    public void clickForgetPassword() {
        buttonForgetPassword.click();
    }

    private By resetEmailSelector = By.cssSelector("input[id='resetemail']");

    public void typeInvalidEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(resetEmailSelector));
        driver.findElement(resetEmailSelector).sendKeys(email);
    }

    public void clickResetButton() {buttonReset.click();
    }

    public void verifyInvalidEmailErrorIs(String message) {
        assertEquals(message, error.getText());
    }
}