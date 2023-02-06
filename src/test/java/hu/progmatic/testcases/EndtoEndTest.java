package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.AppointmentPage;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import hu.progmatic.pages.SummaryPage;
import org.testng.annotations.Test;

public class EndtoEndTest extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;
    AppointmentPage appointmentPage;
    SummaryPage summaryPage;

    @Test(groups = {"EndToEnd"}, description = "TC06: End to end Test. Make an appointment and redirect to home page.")
    public void EndToEndTest() throws InterruptedException {
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        appointmentPage = new AppointmentPage(driver, wait);
        summaryPage = new SummaryPage(driver, wait);

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
        summaryPage.goToHomePageButtonClick();


    }
}
