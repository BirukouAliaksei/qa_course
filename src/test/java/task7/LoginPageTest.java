package task7;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class LoginPageTest extends LoginPage{

//    static WebDriverWait wait;
    private By loginform;
    private By logOutForm = By.xpath("//*[@class='btn dropdown-toggle btn-success navbar-btn']");
    private By logOuteFormButton = By.partialLinkText("Logout");
    private By emeilField = By.xpath("//*[@class='col-lg-9']//*[@class='well form-horizontal auth']//*[@name='email']");
    private By passwordField = By.xpath("//*[@class='col-lg-9']//*[@class='well form-horizontal auth']//*[@name='password']");
    private By logInButton = By.xpath("//*[@class='col-lg-9']//*[@class='well form-horizontal auth']//*[@type='submit']");
    private By eShopButton = By.xpath("//*[@class='glyphicon glyphicon-th']");
    private By selectCouponButton = By.xpath("//*[@title='Coupons']");
    private By newCoupon = By.xpath("//*[@class='btn btn-primary pull-right']");
    private By couponName = By.xpath("//*[@id='name']");
    private By couponDiscount = By.xpath("//*[@id='discount_amount']");
    private By couponDate = By.xpath("//*[@name='valid_date']");
    private By couponNum = By.xpath("//*[@id='number_coupons']");
    private By submitBtn = By.xpath("//*[@type='submit']");
    private By submitBtnForSearchCoupon = By.xpath("//*[@class='btn']");
    private By searchForm = By.xpath("//*[@name='name']");
    private By delBtn = By.xpath("//*[@class='glyphicon glyphicon-trash']");
    private By confirmBtn = By.xpath("//*[@class='confirm']");

    private String email = "demo@open-eshop.com";
    private String password = "demo";
    String couponPageLink = "http://open-eshop.stqa.ru/oc-panel/coupon";
    String afterLoginUrl = "http://open-eshop.stqa.ru/oc-panel";


    @Test
    public void login() {
        driver.get("http://open-eshop.stqa.ru/oc-panel/auth/login");
        driver.findElement(emeilField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(logInButton).submit();
        Assert.assertEquals(afterLoginUrl, driver.getCurrentUrl());
    }

    @Test
    public void couponCreator() throws InterruptedException {
        driver.findElement(eShopButton).click();
        driver.findElement(selectCouponButton).click();
        driver.findElement(newCoupon).click();
        Thread.sleep(1000);
        driver.findElement(couponName).sendKeys("shaurma");
        driver.findElement(couponDiscount).click();
        driver.findElement(couponDiscount).sendKeys("55");
        driver.findElement(couponDate).sendKeys("2020-01-09");// добавить переменную текущая дата
        driver.findElement(couponNum).clear();
        driver.findElement(couponNum).sendKeys("666");
        driver.findElement(submitBtn).click();
        Assert.assertEquals("Success", driver.findElement(By.xpath("//*[@class='alert-heading']")).getText());
        Assert.assertEquals("shaurma", driver.findElement(By.xpath("//*[@class='table-responsive']//tbody/tr[1]/td[1]")).getText());

    }

    @Test
    public void couponSearch() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(searchForm).click();
        driver.findElement(searchForm).sendKeys("shaurma");
        driver.findElement(submitBtnForSearchCoupon).click();
        Thread.sleep(1000);
        driver.findElement(delBtn).click();
        Thread.sleep(1000);
        driver.findElement(confirmBtn).click();
        System.out.println(driver.findElement(By.xpath("//*[@class='table table-striped table-bordered']/tbody/tr[1]/td[1]")).getText());
        Assert.assertEquals("shaurma",driver.findElement(By.xpath("//*[@class='table table-striped table-bordered']/tbody/tr[1]/td[1]")).getText());

    }

//    @AfterClass
//    public static void closeBrowser(){
//        driver.quit();
//    }
}
