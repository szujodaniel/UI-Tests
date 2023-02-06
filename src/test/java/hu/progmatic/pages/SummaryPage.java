package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SummaryPage {
    WebDriver driver;
    WebDriverWait wait;
    By homePageButton = By.linkText("Go to Homepage");
    By bookAppointment = By.id("btn-book-appointment");

    public SummaryPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void goToHomePageButtonClick() {
        WebElement goToHomePageElement = driver.findElement(homePageButton);
        goToHomePageElement.click();
        System.out.println("Go to home page button has been clicked");

        WebElement bookAppointmentElement = driver.findElement(bookAppointment);

        Assert.assertTrue(bookAppointmentElement.isDisplayed());

    }
}
