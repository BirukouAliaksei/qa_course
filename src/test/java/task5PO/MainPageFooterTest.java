package task5PO;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class MainPageFooterTest {

    private By setUserNameFieldFooter = By.xpath("//*[@id='user[login]-footer']");
    private By setemailFieldFooter = By.xpath("//*[@id='user[email]-footer']");
    private By setPasswordFieldFooter = By.xpath("//*[@id='user[password]-footer']");
    private By signUpButtonFooter = By.xpath("/html/body/div[4]/main/div[9]/div[2]/form/div/div/button");
    private static WebDriver driver;
    private String name = "Petrusso9994";
    private String email = "petrossoBrowko666gmail.com";
    private String password = "12666pqwsed";
    private String registrationError = "//*[@id='signup-form']/div[1]";

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
    public void registerUserinFooter() {
        driver.findElement(setUserNameFieldFooter).sendKeys(name);
        driver.findElement(setemailFieldFooter).sendKeys(email);
        driver.findElement(setPasswordFieldFooter).sendKeys(password);
        driver.findElement(signUpButtonFooter).click();
        assertTrue(driver.findElement(By.xpath(registrationError)).isDisplayed());
    }
}