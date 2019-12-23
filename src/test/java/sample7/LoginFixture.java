package sample7;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginFixture{
  public static WebDriver driver;

  @BeforeClass
  public static void login() {
    System.out.println("Login");
    driver.get("http://localhost/someApplication");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("submit")).click();
  }

  @AfterClass
  public static void logout() {
    System.out.println("Logout");
    driver.findElement(By.name("logout")).click();
  }

}
