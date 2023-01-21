package pages;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Helper;

public class LoginPage {

    private AndroidDriver driver;

    private static Logger logger = LoggerFactory.getLogger(LoginPage.class);

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private String loginField = "//android.widget.EditText";
    private String passwordField = "//android.view.View[4]//android.widget.EditText";
    private String loginButton = "//android.widget.FrameLayout[2]//android.widget.Button[2]";

    private String invalidMessage = "//android.view.View[@text='Nieprawidłowy login lub hasło']";

    @Step("Set login and password")
    public void invalidLogin(String email, String password) {
        logger.info("Entering incorrect data");
        Helper.waitElementVisibility(driver, By.xpath(loginField));
        driver.findElement(By.xpath(loginField)).sendKeys(email);
        driver.findElement(By.xpath(passwordField)).sendKeys(password);
        driver.findElement(By.xpath(loginButton)).click();
    }

    public String invalidMessageField() {
        Helper.waitElementVisibility(driver, By.xpath(invalidMessage));
        return driver.findElement(By.xpath(invalidMessage)).getText();
    }
}
