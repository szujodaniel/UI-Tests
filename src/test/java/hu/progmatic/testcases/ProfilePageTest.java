package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import hu.progmatic.pages.ProfilePage;
import org.testng.annotations.Test;

public class ProfilePageTest extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;
    ProfilePage profilePage;

    @Test(groups = {"PageTests"}, description = "TC05: Check Profile page can be loaded.")
    public void ProfilePageLoadTest() {
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        profilePage = new ProfilePage(driver, wait);

        homePage.loadHomePage();
        loginPage.menuBarClick();
        loginPage.loginPageClick();
        loginPage.enterDemoAccountUserName();
        loginPage.enterDemoAccountPassword();
        loginPage.loginButtonClick();
        profilePage.menuBarClick();
        profilePage.profilePageClickAndCheck();

    }
}
