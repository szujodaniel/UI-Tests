package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends DriverBaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @Test(groups = {"PageTests"}, description = "TC03: Login with wrong password and username, check error message appear.")
    public void LoginWithWrongPasswordAndUsernameCheckErrorMessage() {
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        homePage.loadHomePage();
        homePage.makeAppointmentClick();
        loginPage.enterWrongUserName();
        loginPage.enterWrongPassword();
        loginPage.loginButtonClick();
        loginPage.CheckErrorMessage();

    }

}
