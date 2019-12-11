package task5PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private static WebDriver driver;
    private By setUserNameFieldFooter = By.xpath("//*[@id='user[login]-footer']");
    private By setemailFieldFooter = By.xpath("//*[@id='user[email]-footer']");
    private By setPasswordFieldFooter = By.xpath("//*[@id='user[password]-footer']");
    private By signInBtn = By.xpath("//a[@href='/login']");
    private By signUpBtn = By.xpath("//a[@href='/join?source=header-home']");
    private By signUpButtonFooter = By.xpath("/html/body/div[4]/main/div[9]/div[2]/form/div/div/button");
    private By userNameField = By.xpath("//input[@id='user[login]']");
    private By emailField = By.xpath("//input[@id='user[email]']");
    private By passwordField = By.xpath("//input[@id='user[password]']");
    private By signUpFormBtn = By.xpath("//button[text()='Sign up for GitHub']");
    private By userNameError = By.xpath("//input[@id='user[login]']/ancestor::dd/following-sibling::dd/div/div");
    private By emailError = By.xpath("//input[@id='user[email]']/ancestor::dd/following-sibling::dd");
    private By searching = By.xpath("//input[text]");

    public MainPage(WebDriver driver) {
    }

//    public MainPage(WebDriver driver) {
//        this.driver = driver;
//    }


    public LoginPage clickSignInBtn() {
        driver.findElement(signInBtn).click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUpBtn() {
        driver.findElement(signUpBtn).click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpFormBtn() {
        driver.findElement(signUpFormBtn).click();
        return new SignUpPage(driver);
    }

    public MainPage clickSignUpFooterBtn() {
        driver.findElement(signUpButtonFooter).click();
        return this;
    }

    public MainPage setUserName(String value) {
        driver.findElement(userNameField).sendKeys(value);
        return this;
    }

    public MainPage setPassword(String value) {
        driver.findElement(passwordField).sendKeys(value);
        return this;
    }

    public MainPage setEmailField(String value) {
        driver.findElement(emailField).sendKeys(value);
        return this;
    }
    public MainPage setUserNameFooter(String value){
        driver.findElement(setUserNameFieldFooter).sendKeys(value);
        return this;
    }

    public MainPage setEmailFooter(String value) {
        driver.findElement(setemailFieldFooter).sendKeys(value);
        return this;
    }

    public MainPage setPasswordFooter(String value) {
        driver.findElement(setPasswordFieldFooter).sendKeys(value);
        return this;
    }

    public SignUpPage registerUser(String name, String email, String password) {
        this.setUserName(name);
        this.setEmailField(email);
        this.setPassword(password);
        this.clickSignUpFormBtn();
        return new SignUpPage(driver);
    }
    public SignUpPage registerUserinFooter (String name, String email, String password) {
        this.setUserNameFooter(name);
        this.setEmailFooter(email);
        this.setPasswordFooter(password);
        this.clickSignUpFooterBtn();
        return new SignUpPage(driver);
    }
    public String getUsernameErrorText() {
        return driver.findElement(userNameError).getText();
    }

    public String getEmailErrorText() {
        return driver.findElement(emailError).getText();
    }

    public MainPage searchForm(){
        driver.findElement(searching).sendKeys("GitHi");
        return this;

    }

}
