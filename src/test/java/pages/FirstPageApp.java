package pages;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Helper;

public class FirstPageApp {

    private AndroidDriver driver;

    private static Logger logger = LoggerFactory.getLogger(FirstPageApp.class);

    private String loginButton = "pl.tablica:id/loginBtnExp";

    public FirstPageApp(AndroidDriver driver) {
        this.driver = driver;
    }

    @Step("Open login page")
    public void openLoginPage() {
        logger.info("Open login page");
        Helper.waitElementVisibility(driver, By.id(loginButton));
        driver.findElement(By.id(loginButton)).click();
    }

}
