package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AppointmentPage {
    WebDriver driver;
    WebDriverWait wait;
    By readmissionCheckBox = By.name("hospital_readmission");
    By radioMedicaid = By.id("radio_program_medicaid");
    By visitDate = By.cssSelector("input[placeholder='dd/mm/yyyy']");
    By commentField = By.id("txt_comment");
    By bookAppointmentButton = By.id("btn-book-appointment");
    By facilityDropDown = By.id("combo_facility");

    public AppointmentPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void facilityDropdownSelect() {
        Select facilitySelect = new Select(driver.findElement(facilityDropDown));
        facilitySelect.selectByVisibleText("Hongkong CURA Healthcare Center");
        System.out.println("Hongkong CURA Healthcare Center selected");

        System.out.println("Readmission checkbox checked");
    }

    public void hospitalReadmissionCheckboxClick() {
        WebElement checkbox = driver.findElement(readmissionCheckBox);
        checkbox.click();
        System.out.println("Readmission checkbox checked");
    }

    public void radioMedicaidClick() {
        WebElement radioMedicaidElement = driver.findElement(radioMedicaid);
        radioMedicaidElement.click();
        System.out.println("Medicaid radio button clicked");
    }

    public void visitDateFill() {
        WebElement visitDateElement = driver.findElement(visitDate);
        visitDateElement.sendKeys("28/02/2023");
        System.out.println("Date has been filled");
    }

    public void commentFill() {
        WebElement commentElement = driver.findElement(commentField);
        commentElement.sendKeys("Best modulzaro ever!");
    }

    public void bookAppointmentClick() {
        WebElement bookAppointmentElement = driver.findElement(bookAppointmentButton);
        bookAppointmentElement.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/appointment.php#summary");
    }
}
