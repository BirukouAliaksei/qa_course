import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaWebAutomationTest3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");

        WebElement userName = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        userName.sendKeys("hi");
        userName.submit();

//        WebElement userName1 = driver.findElement(By.cssSelector("div > a"));
//        userName1.click();
//        userName1.submit();
//
//        WebElement userName2 = driver.findElement(By.cssSelector("div a"));
//        userName2.click();
//        userName2.submit();

//        WebElement searchById = driver.findElement(By.cssSelector(""));
//        searchById.click();
//        searchById.submit();
//
//        WebElement searchByAttr = driver.findElement(By.cssSelector("//"));
//        searchByAttr.click();
//
//        WebElement searchByClass = driver.findElement(By.cssSelector("class"));
//        searchByClass.click();

//        WebElement searchName = driver.findElement(By.xpath("//img"));
//        searchName.click();

//        WebElement searchName2 = driver.findElement(By.xpath("//div/a"));
//        searchName2.click();
//
//        WebElement searchName3 = driver.findElement(By.xpath("//div/a"));
//        searchName3.click();

        WebElement searchNameText = driver.findElement(By.xpath(".//class//[text()='Gmail']/"));
        searchNameText.click();
//
//        WebElement searchName = driver.findElement(By.xpath(""));
//
//        WebElement searchName = driver.findElement(By.xpath(""));



    }
}
