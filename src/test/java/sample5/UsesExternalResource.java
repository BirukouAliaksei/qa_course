package sample5;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import ru.stqa.selenium.factory.WebDriverFactory;

public class UsesExternalResource extends ExternalResource{

    private Capabilities capabilities;

    public UsesExternalResource(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    public static WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }


    @Override
    protected void before() throws Throwable {
        System.out.println("Starting a browser");
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
        driver = WebDriverFactory.getDriver(capabilities);
    }

    @Override
    protected void after() {
        System.out.println("Stopping the browser");
        if (driver != null) {
            WebDriverFactory.dismissDriver(driver);
        }
    }
}
