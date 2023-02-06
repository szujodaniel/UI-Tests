package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePage {
    WebDriver driver;
    WebDriverWait wait;
    By menu = By.id("menu-toggle");
    By profile = By.cssSelector("a[href='profile.php#profile']");

    By logout = By.linkText("Logout");

    public ProfilePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void menuBarClick() {
        WebElement menuElement = driver.findElement(menu);
        menuElement.click();
        System.out.println("Menu bar has been loaded");
    }

    public void profilePageClickAndCheck() {
        WebElement profilePageElement = driver.findElement(profile);
        profilePageElement.click();

        WebElement logoutElement = driver.findElement(logout);
        Assert.assertEquals(logoutElement.getText(), "Logout");
        System.out.println("Profile page has been loaded properly");

    }


}
