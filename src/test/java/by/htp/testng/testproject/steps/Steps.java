package by.htp.testng.testproject.steps;

import org.openqa.selenium.WebDriver;

import by.htp.testng.testproject.factory.ChromeDriverCreator;
import by.htp.testng.testproject.factory.FirefoxDriverCreator;
import by.htp.testng.testproject.factory.WebDriverCreator;
import by.htp.testng.testproject.pages.MainPage;
import by.htp.testng.testproject.pages.ResultPage;

public class Steps {

	private WebDriver driver;
	
	public void initChromeBrowser() {
		WebDriverCreator chromeCreator = new ChromeDriverCreator();
		driver = chromeCreator.factoryMethod();
	}
	
	public void initFirefoxBrowser() {
		WebDriverCreator firefoxCreator = new FirefoxDriverCreator();
		driver = firefoxCreator.factoryMethod();
	}

//	public void closeDriver() {
//		Driver.closeDriver();
//	}

	public void HotelSearch() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.DataInput();
		mainPage.CompareResult();
	}
	
	public void CompareCheckOutDate() {
		ResultPage resultPage = new ResultPage(driver);
//		resultPage.CompareDates();
	}
	
	public void ComparePrice() {
		ResultPage resultPage = new ResultPage(driver);
		resultPage.ChangeCarrency();
		resultPage.ChoosePriceRange();
		
	}

}
