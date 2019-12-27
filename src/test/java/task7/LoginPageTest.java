package task7;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageTest extends Locators{
    private static WebDriver driver;
//    Locators loc = new Locators();

    @BeforeClass
    public static void runWeb() {
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://open-eshop.stqa.ru/oc-panel/auth/login");
    }
    @Test
    public void login() {
        driver.findElement(emeilField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(logInButton).submit();
        Assert.assertTrue(true);
    }

    @Test
    public void couponCreator(){
        driver.findElement(eShopButton).click();
        driver.findElement(selectCouponButton).click();
        driver.findElement(newCoupon).click();
        driver.findElement(couponName).sendKeys("shaurma");
        driver.findElement(couponDiscount).sendKeys("55");
        driver.findElement(couponDate).sendKeys("1999-12-27");// добавить переменную текущая дата
        driver.findElement(couponNum).clear();
        driver.findElement(couponNum).sendKeys("666");
        driver.findElement(submitBtn).submit();

    }
    @Test
    public void couponSearch() throws InterruptedException {
        driver.findElement(searchForm).click();
        driver.findElement(searchForm).sendKeys("shaurma");
        driver.findElement(submitBtn).submit();
        driver.findElement(delBtn).click();
        driver.findElement(confirmBtn).click();

    }
    @Ignore
    @AfterClass
    public void logUut(){
        driver.findElement(logOutForm).click();
        driver.findElement(logOuteFormButton).click();
    }

}