package by.htp.testng.testproject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import by.htp.testng.testproject.driver.Driver;
import by.htp.testng.testproject.steps.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {

	private Steps steps;

	@BeforeMethod
	public void setUp() {
		steps = new Steps();
		steps.initBrowser();
	}

	@Test
	public void ChoosePlace() {
		steps.HotelSearch();
	}
	
	@Test
	public void CompareCheckOutDate() {
		steps.CompareCheckOutDate();
	}
	

	@AfterMethod
	public void StopBrowser() {
		// steps.closeDriver();
	}

}
