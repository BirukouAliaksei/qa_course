package sample6;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import sample5.UsesExternalResource;

public class SeleniumClassFixture {

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


}
