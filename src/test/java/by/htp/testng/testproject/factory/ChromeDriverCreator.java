package by.htp.testng.testproject.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

public class ChromeDriverCreator extends WebDriverCreator{

    public static final String PATH_TO_CHROMEDRIVER = ".\\src\\main\\java\\resources\\chromedriver.exe";
    
    private static WebDriver driver;

    @Override
    public WebDriver factoryMethod() {
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(
                new File(PATH_TO_CHROMEDRIVER)).build();
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = new ChromeDriver(service);
        return driver;
    }
    
	public static void closeDriver() {
		driver.quit();
		driver = null;
	}
}
