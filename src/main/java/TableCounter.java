import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.text.Format;
import java.util.BitSet;
import java.util.List;

public class TableCounter{
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/projects/qa_course/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.w3schools.com/html/html_tables.asp");
        Table table = new Table();

        table.getLineOfTable(1);
        table.getElementLineOfTable(1,1);
        table.getTableStringCounter();
        table.getAllLineOfTable(2,3);
        table.getAllLineOfTable(4,1);
        table.getAllLineOfTable(5,1);
        table.getAllLineOfTable(2,3);
        table.getAllLineOfTable(3,2);
        driver.quit();
    }
}
