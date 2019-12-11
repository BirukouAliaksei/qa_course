//import jdk.internal.org.jline.terminal.impl.jna.win.Kernel32;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class KeysClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://en.wikipedia.org");

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='searchInput']"));

        String select = Keys.chord(Keys.CONTROL, "a");
        String cut = Keys.chord(Keys.CONTROL, "x");
        String paste = Keys.chord(Keys.CONTROL, "v");
        String text = "QA Task 3";
        String inputText = Keys.chord(text);

//        searchInput.sendKeys("Qa Task 3");
//        searchInput.sendKeys(select);
//        searchInput.sendKeys(cut);
//        searchInput.sendKeys(paste);
//        searchInput.sendKeys(Keys.ENTER);

//        Actions builder = new Actions(driver);
//        builder.moveToElement(searchInput)
//                .sendKeys(inputText)
//                .sendKeys(select)
//                .sendKeys(cut)
//                .sendKeys(paste)
//                .sendKeys(Keys.ENTER).perform();
//        System.out.println(driver.getTitle());
//
        Actions builder1 = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        builder1.moveToElement(searchInput)
                .sendKeys(inputText)
                .sendKeys(Keys.CONTROL,"a")
                .sendKeys(Keys.CONTROL,"x")
                .sendKeys(Keys.CONTROL,"v")
                .sendKeys(Keys.ENTER).perform();
        driver.quit();
    }
}
