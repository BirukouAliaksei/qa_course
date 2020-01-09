package task7;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginPageTest extends LoginPage {

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
    String loginPageLink = "http://open-eshop.stqa.ru/oc-panel/auth/login";


    @Test
    @Order(1)
    public void login() {
        driver.findElement(emeilField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(logInButton).submit();
        assertEquals(afterLoginUrl, driver.getCurrentUrl());
    }

    @Test
    @Order(2)
    public void couponCreator() throws InterruptedException {
        driver.findElement(eShopButton).click();
        driver.findElement(selectCouponButton).click();
        driver.findElement(newCoupon).click();
        Thread.sleep(1000);
        driver.findElement(couponName).sendKeys("shaurma");
        driver.findElement(couponDiscount).sendKeys("55");
        driver.findElement(couponDate).sendKeys("2020-01-09");// добавить переменную текущая дата
        driver.findElement(couponNum).clear();
        driver.findElement(couponNum).sendKeys("666");
        driver.findElement(submitBtn).click();
        assertEquals("Success", driver.findElement(By.xpath("//*[@class='alert-heading']")).getText());
        assertEquals("shaurma", driver.findElement(By.xpath("//*[@class='table-responsive']//tbody/tr[1]/td[1]")).getText());
    }

    @Test
    @Order(3)
    public void couponSearch() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(searchForm).sendKeys("shaurma");
        driver.findElement(submitBtnForSearchCoupon).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//*[@class='table table-striped table-bordered']/tbody/tr[1]/td[1]")).getText());
        assertEquals("shaurma", driver.findElement(By.xpath("//*[@class='table table-striped table-bordered']/tbody/tr[1]/td[1]")).getText());
    }

    @Test
    @Order(4)
    public void couponDelete() throws InterruptedException {
        driver.findElement(delBtn).click();
        Thread.sleep(1000);
        driver.findElement(confirmBtn).click();
        assertFalse(driver.findElement(By.xpath("//*[@class='table table-striped table-bordered']//*[@style='display: none;']")).isDisplayed());
    }

    @Test
    @Order(5)
    public void logOut() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@class='btn dropdown-toggle btn-success navbar-btn']")).click();
        driver.findElement(By.partialLinkText("Logout")).click();
        assertEquals(loginPageLink, driver.getCurrentUrl());
    }

}
