import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class QaWebAutomaton3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        WebElement inputBanana = driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
        inputBanana.sendKeys("Banana");
        inputBanana.click();
        inputBanana.submit();
        // By xpath
//        WebElement filterByType = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[5]/div/div/div[1]/div/div/div[1]/div/div[2]/a"));
//        filterByType.click();
//        filterByType.submit();
        // By css
//        WebElement filterByTypeCss = driver.findElement(By.cssSelector("#hdtb-msb-vis > div:nth-child(2) > a > span"));
//        filterByTypeCss.click();
//        driver.quit();
        // simple selectors
        List<WebElement> filters = driver.findElements(By.className("HF9Klc iJddsb"));
        Optional<WebElement> filterByType = filters.stream().filter(elem -> {
            String titleAttr = elem.getAttribute("text");
            return titleAttr != null && titleAttr.equals("Відарысы");
        }).findFirst();
        if (!filterByType.isPresent())
            throw new NoSuchElementException("Filter not found");
        filterByType.get().click();
        filterByType.get().submit();
    }
}
