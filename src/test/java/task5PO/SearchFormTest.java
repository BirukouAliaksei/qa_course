package task5PO;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SearchFormTest {
    private static WebDriver driver;
    private By searching = By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/div/div/form/label/input[1]");
    private String input = "smt";
    private String enter = "/html/body/div[1]/header/div/div[2]/div[2]/div/div/div/form/label/img";
    private String expectedUrl = "https://github.com/search?utf8=%E2%9C%93&q=smt&type=";

    @BeforeClass
    public static void runWeb(){
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://github.com");
    }

    @AfterClass
    public static void exit(){
        driver.quit();
    }

    @Test
    public void searchForm() {
        driver.findElement(searching).sendKeys(input);
        driver.findElement(By.xpath(enter)).submit();
        assertEquals(expectedUrl, driver.getCurrentUrl());
    }
}