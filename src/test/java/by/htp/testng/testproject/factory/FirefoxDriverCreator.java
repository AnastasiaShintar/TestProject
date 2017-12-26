package by.htp.testng.testproject.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FirefoxDriverCreator extends WebDriverCreator {
	
	private static WebDriver driver;

	@Override
	public WebDriver factoryMethod() {
		System.setProperty("webdriver.gecko.driver", ".//src/main/java/resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void closeDriver() {
		driver.quit();
		driver = null;
	}
}
