package sample6;

import org.junit.Test;

public class SeleniumTest extends SeleniumClassFixture {

  @Test
  public void test1() {
    driver.get("https://selenium.dev/");
  }

  @Test
  public void test2() {
    driver.get("https://webdriver.ru/");
  }

}
