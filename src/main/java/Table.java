//import java.lang.invoke.StringConcatFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.OptionalInt;

public class Table extends TableCounter {

    private OptionalInt filters;

    public void getLineOfTable(int row) {

        String firstLineOfTable = "//*[@id='customers']/tbody/tr["+row+"]";
        String firstLineOfTableChanged = firstLineOfTable;
        WebElement firstLineOfTableOfElement = driver.findElement(By.xpath(firstLineOfTableChanged));
        System.out.println("it is the first line - " + firstLineOfTableOfElement.getText());
    }

    public void getElementLineOfTable(int row, int column) {

        String elementOffirstLineOfTable = "//*[@id='customers']/tbody/tr[" + row + "]/th[" + column + "]";
        String firstLineOfTableChanged = elementOffirstLineOfTable;
        WebElement firstLineOfTableOfElement = driver.findElement(By.xpath(firstLineOfTableChanged));
        System.out.println("it is the first Element in Line - " + firstLineOfTableOfElement.getText());

    }

    public void getAllLineOfTable(int row, int column) {

        String elementOffirstLineOfTable = "//*[@id='customers']/tbody/tr[" + row + "]/td[" + column + "]";
        String lineOfTable = elementOffirstLineOfTable;
        WebElement sfirstLineOfTableOfElement = driver.findElement(By.xpath(lineOfTable));
        System.out.println(sfirstLineOfTableOfElement.getText());
    }

    public void getTableStringCounter() {

        String allStrings = "//*[@id='customers']/tbody/tr";
        List<WebElement> count = driver.findElements(By.xpath(allStrings));
        System.out.println("Count of Strings in Table - " + count.size());
    }
}
