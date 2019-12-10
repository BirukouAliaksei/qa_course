package task5PO;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.manage().window().maximize();
        driver.get("http://github.com");
//        js.executeScript("window.scrollTo(0, document.body.s)");
        MainPage mainPage = new MainPage(driver);

//        mainPage.registerUser("testusername", "testemail@email.com", "qweqwe253253");

		mainPage.clickSignInBtn().loginWithInvalidCreds("testusername", "qweqwe253253");
        // Username error
//		mainPage.setUserNameFooter("Patric")
//                .setEmailFooter("patric@gmail.com")
//                .setPasswordFooter("t8ffff999")
//                .clickSignUpFooterBtn();

        // User name error ( время выполнения дольше )
		mainPage.registerUserinFooter("Patric", "patric@gmail.com", "44455g555").getUserNameErrorFooter();

    }
}
