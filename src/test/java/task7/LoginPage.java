package task7;

import mx4j.tools.config.DefaultConfigurationBuilder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    protected static WebDriver driver;

    @BeforeAll
    public static void page() {
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        driver = new ChromeDriver(options);
        Dimension d = new Dimension(1920, 1080);
        driver.manage().window().setSize(d);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://open-eshop.stqa.ru/oc-panel/auth/login");
    }

    @AfterAll
    public static void closeBrowser()  {
        driver.quit();
    }


}