package sample6;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.selenium.factory.WebDriverFactory;

public class RuleClass extends ExternalResource{

    private Capabilities capabilities;

    public RuleClass(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    private static WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    protected void unstableTest(){
    }

    @BeforeClass
    public static void setUp() {
        System.out.println("Starting a browser");
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Stopping the browser");
        if (driver != null) {
            driver.quit();
        }
    }}
