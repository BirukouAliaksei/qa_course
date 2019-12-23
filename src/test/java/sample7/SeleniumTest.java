package sample7;

import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import sample5.UsesExternalResource;


public class SeleniumTest extends LoginFixture {

  @ClassRule
  public static UsesExternalResource driverRule = new UsesExternalResource(
          DesiredCapabilities.chrome());

  @Test
  public void test1() {
    System.out.println(driver.findElements(By.cssSelector("div.movie_box")).size());
  }

}
