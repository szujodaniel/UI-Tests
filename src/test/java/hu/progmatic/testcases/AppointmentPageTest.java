package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.AppointmentPage;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import org.testng.annotations.Test;

public class AppointmentPageTest extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;
    AppointmentPage appointmentPage;

    @Test(groups = {"PageTests"}, description = "TC04: Check Appointment page working properly.")
    public void appointmentPageTest() throws InterruptedException {
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        appointmentPage = new AppointmentPage(driver, wait);

        homePage.loadHomePage();
        homePage.makeAppointmentClick();
        loginPage.enterDemoAccountUserName();
        loginPage.enterDemoAccountPassword();
        loginPage.loginButtonClick();
        appointmentPage.facilityDropdownSelect();
        appointmentPage.hospitalReadmissionCheckboxClick();
        appointmentPage.radioMedicaidClick();
        appointmentPage.visitDateFill();
        appointmentPage.commentFill();
        appointmentPage.bookAppointmentClick();
    }
}
