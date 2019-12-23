package sample5;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;

public class SeleniumTest extends SeleniumMethodFixture{

  @Test
  public void test1() {
    driver.get("https://selenium.dev/");
  }

  @Test
  public void test2() {
    driver.get("https://webdriver.ru/");
  }

}
