package by.htp.testng.testproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import by.htp.testng.testproject.driver.Driver;
import by.htp.testng.testproject.steps.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTestFifefox {
	private Steps steps;

	@BeforeClass
	public void setUp() {
		steps = new Steps();
		steps.initFirefoxBrowser();
	}

	@Test
	public void ChoosePlace() {
		steps.HotelSearch();
	}

	// @Test
	// public void CompareCheckOutDate() {
	// steps.CompareCheckOutDate();
	// }

	@Test
	public void ComparePrice() {
		steps.ComparePrice();
	}

	@AfterClass
	public void StopBrowser() {
		// steps.closeDriver();
	}

}
