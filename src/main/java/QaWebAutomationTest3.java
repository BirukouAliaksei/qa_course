import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class QaWebAutomationTest3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
//        searchByXpath();

//        driver.manage().window().fullscreen();

//        WebElement userName = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
//        userName.sendKeys("hi");
//        userName.submit();
//        driver.quit();
//
//        WebElement userName1 = driver.findElement(By.cssSelector("div > a"));
//        userName1.click();
//        userName1.submit();
//
//        WebElement userName2 = driver.findElement(By.cssSelector("div a"));
//        userName2.click();
//        userName2.submit();

//        WebElement searchById = driver.findElement(By.cssSelector("#fsl"));
//        searchById.click();
//        searchById.submit();

//        WebElement searchByAttr = driver.findElement(By.cssSelector("a[]"));
//        searchByAttr.click();// разобраться
//
//        WebElement searchByClass = driver.findElement(By.cssSelector("div.gb_h.gb_i"));
//        searchByClass.sendKeys("hi");
//        searchByClass.click();

        WebElement searchNameInput = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchNameInput.sendKeys("hi");
        searchNameInput.submit();

//        WebElement searchName2 = driver.findElement(By.xpath("//div/a"));
//        searchName2.click();
//
//        WebElement searchName3 = driver.findElement(By.xpath("//div/a"));
//        searchName3.click();

//        WebElement searchNameText = driver.findElement(By.xpath("//div[@class='gb_h gb_i']//*[text()='Gmail']"));
//        searchNameText.click();
//
//        WebElement searchNameClass = driver.findElement(By.xpath("//div[@class='gb_h gb_i']"));
//        searchNameClass.click();
//
//        WebElement searchName = driver.findElement(By.xpath("//div[@id='searchform']"));
//        searchName.getText();
//        System.out.println(searchName.getTagName());
//        driver.quit();
//
//        List<WebElement> imagesWithAlt = driver.findElements(By.xpath("//img[@alt]"));
//        System.out.println(imagesWithAlt);
//        driver.quit();

    }
}
