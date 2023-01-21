package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public AndroidDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 30");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        capabilities.setCapability("appPackage", "pl.tablica");
        capabilities.setCapability("appActivity", "pl.tablica2.app.startup.activity.StartupActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

}
