import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestLogin {

    private static WebDriver driver;
    private static WebDriverWait wait;

    private static LoginPage onLoginPage;

    private static final String LOGINWEBSITE = "https://www.phptravels.net/login";

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);

        onLoginPage = new LoginPage(driver, wait);
    }

    @Before
    public void beforeMethod() {
        driver.navigate().refresh();
        driver.navigate().to(LOGINWEBSITE);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void checkInvalidMessageAppear() {
        onLoginPage.loginWith("randomEmail@sth.com", "TropicalJungle987");
        onLoginPage.verifyInvalidCredentialsErrorIs("Invalid Email or Password");
    }

    @Test
    public void checkInvalidEmailErr() {
        onLoginPage.closePopup();
        onLoginPage.clickForgetPassword();
        onLoginPage.typeInvalidEmail("dragon@gmail.com");
        onLoginPage.clickResetButton();
        onLoginPage.verifyInvalidEmailErrorIs("Email Not Found");
    }
}