package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends DriverBaseTest {
    HomePage homePage;

    @Test(groups = {"PageTests"}, description = "TC01: Homepage loaded test that loads the page and validates whether the header is displayed or not.")
    public void homepageLoadedTest() {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
    }

    @Test(groups = {"PageTests"}, description = "TC02: Check Make Appointment button is clickable.")
    public void makeAppointmentButtonClickTest() {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
        homePage.makeAppointmentClick();
    }

}
