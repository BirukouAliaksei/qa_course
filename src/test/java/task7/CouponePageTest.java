package task7;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class CouponePageTest {
    private static WebDriver driver;
    String couponPageLink = "http://open-eshop.stqa.ru/oc-panel/coupon";

    @Test
    public void page(){
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(couponPageLink);
    }

}