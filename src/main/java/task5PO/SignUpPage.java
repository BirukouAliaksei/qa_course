package task5PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    private WebDriver driver;
    private By heading = By.xpath("//div[@class='application-main ']//h1");
    private By userNameField = By.xpath("//input[@id='user_login']");
    private By emailField = By.xpath("//input[@id='user_email']");
    private By passwordField = By.xpath("//input[@id='user_password']");
    private By signUpButton = By.xpath("//button[@id='signup_button']");
    private By userNameError = By.xpath("//input[@id='user_login']/ancestor::dd/following-sibling::dd/div/div");
    private By emailError = By.xpath("//input[@id='user_email']/ancestor::dd/following-sibling::dd");
    private By passwordError = By.xpath("/html/body/div[4]/main/div/div[2]/div/form/div[1]");
    private By userNameErrorFooter = By.xpath("/html/body/div[4]/main/div/div[2]/div/form/auto-check[1]/dl/dd[2]/text()");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage typeUserName(String username) {
        driver.findElement(userNameField).sendKeys(username);
        return this;
    }

    public SignUpPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public SignUpPage typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public String getUsernameErrorText() {
        return driver.findElement(userNameError).getText();
    }

    public String getEmailErrorText() {
        return driver.findElement(emailError).getText();
    }

    public String getPasswordError() {return driver.findElement(passwordError).getText(); }

    public String getUserNameErrorFooter() {return driver.findElement(userNameErrorFooter).getText();}

}
