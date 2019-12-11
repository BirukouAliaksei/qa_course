package task5PO;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SingUpMainPageTest {
    private static WebDriver driver;
    private By signUpFormBtn = By.xpath("//button[text()='Sign up for GitHub']");
    private By userNameField = By.xpath("//input[@id='user[login]']");
    private By emailField = By.xpath("//input[@id='user[email]']");
    private By passwordField = By.xpath("//input[@id='user[password]']");
    private By emailError = By.xpath("//input[@id='user[email]']/ancestor::dd/following-sibling::dd");
    private String name = "VictorVitekVictor";
    private String email = "aleksand@rmail.ru";
    private String password = "123kkkk112";
    private String enableSingUpButton = "//*[@id='signup_button']";

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
    public void registerUser() {
        driver.findElement(userNameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(signUpFormBtn).click();
        assertTrue(driver.findElement(By.xpath(enableSingUpButton)).isEnabled());
    }
}