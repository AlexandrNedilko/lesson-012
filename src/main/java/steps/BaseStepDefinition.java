package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.MainPage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import pages.SignInPage;
import utils.Config;

import java.util.Properties;

public class BaseStepDefinition {
    protected WebDriver driver;
    protected final Properties config = Config.loadProperties("test.properties");

    protected MainPage mainPage;
    protected MyAccountPage myAccountPage;
    protected RegistrationPage registrationPage;
    protected SignInPage signInPage;

    public BaseStepDefinition() {
        if (config.getProperty("browser").toLowerCase().equals("chrome")) {
            WebDriverManager
                    .chromedriver()
                    .version(config.getProperty("chromedriver.version"))
                    .setup();
            driver = new ChromeDriver();
        } else if (config.getProperty("browser").toLowerCase().equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }
}
