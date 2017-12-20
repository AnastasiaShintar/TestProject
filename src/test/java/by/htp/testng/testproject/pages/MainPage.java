package by.htp.testng.testproject.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class MainPage extends AbstractPage {

	public MainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	private final String BASE_URL = "https://www.booking.com";

	@FindBy(id = "ss")
	private WebElement searchLineCity;

	@FindBy(xpath = "//*[@id=\"frm\"]/div[2]/div/div[1]/ul[1]/li[1]/b[1]")
	private WebElement minskCity;

	@FindBy(css = "#frm > div.sb-searchbox__row.u-clearfix.-submit.sb-searchbox__footer.-last > div.sb-searchbox-submit-col.-submit-button > button")
	private WebElement searchButton;

	@FindBy(xpath = "//td[@data-id=\"1514678400000\"]")
	private WebElement date31InCheckInCalendar;

	public void DataInput() {
		searchLineCity.sendKeys("Минск");
		minskCity.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		date31InCheckInCalendar.click();
		searchButton.click();
	}

	public void CompareResult() {
		String title = driver.getTitle();
		assertTrue(title.contains("Минск"));
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);

	}

}
