package by.htp.testng.testproject.steps;

import by.htp.testng.testproject.pages.MainPage;
import by.htp.testng.testproject.pages.ResultPage;

import org.openqa.selenium.WebDriver;

import by.htp.testng.testproject.driver.Driver;

public class Steps {

	private WebDriver driver;
	

	public void initBrowser() {
		driver = Driver.getDriver();
	}

	public void closeDriver() {
		Driver.closeDriver();
	}

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
