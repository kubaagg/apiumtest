package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FirstPageApp;
import pages.LoginPage;
import utils.BaseTest;

public class InvalidLoginTest extends BaseTest {


    @Test
    @Description("Login and password with invalid data")
    public void loginWithInvalidData() {
        FirstPageApp firstPageApp = new FirstPageApp(driver);
        firstPageApp.openLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.invalidLogin("Test123@test.pl", "Test123@test.pl");

        Assert.assertEquals(loginPage.invalidMessageField(), "Nieprawidłowy login lub hasło");

    }
}
