package task7;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    protected static WebDriver driver;

    @BeforeClass
    public static void page() {
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        }

//    @AfterClass
//    public static void logOut(){
//        driver.findElement(By.xpath("//*[@class='btn dropdown-toggle btn-success navbar-btn']")).click();
//        driver.findElement(By.partialLinkText("Logout")).click();
//    }


}