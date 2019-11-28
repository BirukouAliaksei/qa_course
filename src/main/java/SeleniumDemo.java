import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/");
		driver.navigate().to("http://google.com");
		System.out.println(driver.getTitle()+ " first ");
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		driver.navigate().back();
		WebElement queryInput = driver.findElement(By.xpath("/html/body/header/nav/div[2]/div/div/div/form/table/tbody/tr/td[1]/div/table/tbody/tr/td[1]/input"));
		queryInput.sendKeys("Seleneum");
		queryInput.submit();
		WebElement blogClick = driver.findElement(By.cssSelector("#navbar > a:nth-child(7)"));
		blogClick.click();
		WebElement blogSearch = driver.findElement(By.cssSelector("#gsc-i-id3"));
		blogSearch.sendKeys("Automaton problems");
		blogSearch.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle()+ " second ");

		driver.quit();

    }
}
