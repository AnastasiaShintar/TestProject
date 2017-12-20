package by.htp.testng.testproject.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends AbstractPage{

	public ResultPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(css = "#frm > div:nth-child(10) > div > div.sb-dates__grid.u-clearfix > div.sb-dates__col.--checkout-field > div > div > div.sb-date-field.b-datepicker > div > div.sb-date-field__display")
	private WebElement checkOutDate;
	@FindBy(css = "#user_form > ul > li.user_center_option.uc_currency")
	private WebElement currency;
	@FindBy(css = "#currency_dropdown_top > ul:nth-child(1) > li.currency_USD > a > span.seldescription")
	private WebElement usd;
	@FindBy(css = "#filter_price > div:nth-child(2) > a:nth-child(1) > svg:nth-child(2)")
	private WebElement priceRange;
	
	
	public void CompareDates() {
		String visibleCheckOutDate = checkOutDate.getAttribute("понедельник, 1 января 2018");
		assertTrue(visibleCheckOutDate.contains("1 января 2018"));
	}
	
	public void ChangeCarrency() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		currency.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		usd.click();
	}
	
	public void ChoosePriceRange() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		priceRange.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	@Override
	public void openPage() {
		
	}
	
	

}
