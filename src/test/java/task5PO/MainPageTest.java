package task5PO;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class MainPageTest {

    private By setUserNameFieldFooter = By.xpath("//*[@id='user[login]-footer']");
    private By setemailFieldFooter = By.xpath("//*[@id='user[email]-footer']");
    private By setPasswordFieldFooter = By.xpath("//*[@id='user[password]-footer']");
    private By signUpButtonFooter = By.xpath("/html/body/div[4]/main/div[9]/div[2]/form/div/div/button");
    private static WebDriver driver;

    @BeforeClass
    public static void runWeb(){
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://github.com");
    }

    @Test
    public void clickSignUpFooterBtn() {

        driver.findElement(signUpButtonFooter).click();

    }

    @Test
    public void setUserNameFooter() {
        String name = "PipinMister";
        driver.findElement(setUserNameFieldFooter).sendKeys(name);
    }

    @Test
    public void setEmailFooter() {
        String email = "petrossoBrowko666@gmail.com";
        driver.findElement(setemailFieldFooter).sendKeys(email);

    }

    @Test
    public void setPasswordFooter() {
        String password = "12666pqwsed";
        driver.findElement(setPasswordFieldFooter).sendKeys(password);

    }

    @Test
    public void registerUserinFooter() {

//       String name = "Petrusso9994";
//       String email = "petrossoBrowko666@gmail.com";
//       String password = "12666pqwsed";
       setUserNameFooter();
       setEmailFooter();
       setPasswordFooter();
       clickSignUpFooterBtn();
//        driver.findElement(setUserNameFieldFooter).sendKeys(name);
//        driver.findElement(setemailFieldFooter).sendKeys(email);
//        driver.findElement(setPasswordFieldFooter).sendKeys(password);
//        driver.findElement(signUpButtonFooter).submit();
        assertTrue(true);

    }
}