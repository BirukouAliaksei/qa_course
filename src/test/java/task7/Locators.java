package task7;

import org.openqa.selenium.By;

public class Locators {
    public By loginform;
    public By logOutForm = By.xpath("/html/body/header/div/div[2]/a[2]");
    public By logOuteFormButton = By.partialLinkText("Logout");
    public By emeilField = By.xpath("//*[@id='page']/form/div[1]/div/input");
    public By passwordField = By.xpath("//*[@id='page']/form/div[2]/div/input");
    public By logInButton = By.xpath("//*[@id='page']/form/div[4]/button");
    //    private By logInButton = By.cssSelector("button.btn.btn-primary");
    public By eShopButton = By.xpath("//*[@id='accordion']/div[1]/div[1]/h4/a/span[1]");
    public By selectCouponButton = By.xpath("/html/body/aside/div/div[2]/div/div/div/div[1]/div[2]/div/table/tbody/tr[4]/td/li/a");
    public By newCoupon = By.xpath("//*[@id='content']/a[1]");
    public By couponName = By.xpath("//*[@id='name']");
    public By couponDiscount = By.xpath("//*[@id='discount_amount']");
    public By couponDate = By.xpath("//*[@name='valid_date']");
    public By couponNum = By.xpath("//*[@id='number_coupons']");
    public static By submitBtn = By.xpath("//*[@type='submit']");
    public By searchForm = By.xpath("//*[@class='form-control']");
    public By delBtn = By.xpath("//*[@class='glyphicon glyphicon-trash']");
    public By confirmBtn = By.xpath("//*[@class='confirm']");

    public String email = "demo@open-eshop.com";
    public String password = "demo";
}
