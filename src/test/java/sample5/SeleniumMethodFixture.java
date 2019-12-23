package sample5;


import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumMethodFixture {

  protected static WebDriver driver;

  @ClassRule
  public static UsesExternalResource driverRule = new UsesExternalResource(
          DesiredCapabilities.chrome());

  @Rule
  public ExternalResource extractDriverRule = new ExternalResource() {
    @Override
    protected void before() throws Throwable {
      driver = driverRule.getDriver();
    }
  };

  @Rule
  public void unstableTest() {

  }


}

