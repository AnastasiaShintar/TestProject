package by.htp.testng.testproject.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
	private static final String DRIVER_FIREFOX = "webdriver.gecko.driver";
	private static final String DRIVER_FIREFOX_PATH = "C:\\driver\\geckodriver.exe";
	
	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (null == driver) {
			System.setProperty(DRIVER_FIREFOX, DRIVER_FIREFOX_PATH);
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static void closeDriver() {
		driver.quit();
		driver = null;
	}
}
