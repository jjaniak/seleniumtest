import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;


public class LoginPage extends Page {

    private ButtonLogin buttonLogin = new ButtonLogin(driver, wait);
    private ButtonForgetPassword buttonForgetPassword = new ButtonForgetPassword(driver, wait);
    private ButtonReset buttonReset = new ButtonReset(driver, wait);
    private ButtonGotIt buttonGotIt = new ButtonGotIt(driver, wait);
    private InputEmail inputEmail = new InputEmail(driver, wait);
    private InputPassword inputPassword = new InputPassword(driver, wait);
    private InputResetEmail inputResetEmail = new InputResetEmail(driver, wait);


    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private void clickLogin() {
        buttonLogin.click();
    }

    public void loginWith(String email, String password) {
        inputEmail.typeText(email);
        inputPassword.typeText(password);
        clickLogin();
    }

    public void verifyInvalidCredentialsErrorIs(String message) {
        assertEquals(message, error.getText());
    }

    public void closePopup() {
        buttonGotIt.click();
    }

    public void clickForgetPassword() {
        buttonForgetPassword.click();
    }

    public void typeInvalidEmail(String invalidEmail) {
        inputResetEmail.typeText(invalidEmail);
    }

    public void clickResetButton() {buttonReset.click();
    }

    public void verifyInvalidEmailErrorIs(String message) {
        assertEquals(message, error.getText());
    }
}