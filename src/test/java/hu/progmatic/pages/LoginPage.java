package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    By userNameField = By.name("username");
    By userPasswordField = By.name("password");
    By loginButton = By.id("btn-login");
    By errorMessage = By.xpath("//*[@id=\"login\"]/div/div/div[1]/p[2]");
    By login = By.cssSelector("a[href='profile.php#login']");
    By menu = By.id("menu-toggle");



    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void menuBarClick() {
        WebElement menuElement = driver.findElement(menu);
        menuElement.click();
        System.out.println("Menu bar has been loaded");
    }


    public void loginPageClick() {
        WebElement loginPageElement = driver.findElement(login);
        loginPageElement.click();
        System.out.println("Login page has been loaded");
    }

    public void enterWrongUserName() {
        WebElement userName = driver.findElement(userNameField);
        userName.sendKeys("wrongusername");
        System.out.println("Wrong username has been entered");
    }

    public void enterDemoAccountUserName() {
        WebElement userName = driver.findElement(userNameField);
        userName.sendKeys("John Doe");
        System.out.println("Demo account userName has been entered");
    }

    public void enterWrongPassword() {
        WebElement userPassword = driver.findElement(userPasswordField);
        userPassword.sendKeys("wronguserpassword");
        System.out.println("Demo account password has been entered");
    }

    public void enterDemoAccountPassword() {
        WebElement userPassword = driver.findElement(userPasswordField);
        userPassword.sendKeys("ThisIsNotAPassword");
        System.out.println("Demo account password has been entered");
    }


    public void loginButtonClick() {
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
        System.out.println("Login button clicked");
    }

    public void CheckErrorMessage() {
        WebElement errorMessageElement = driver.findElement(errorMessage);
        Assert.assertEquals(errorMessageElement.getText(), "Login failed! Please ensure the username and password are valid.");
        System.out.println("Error message has been appeared");
    }
}
