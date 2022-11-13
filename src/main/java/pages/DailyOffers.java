package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class DailyOffers {
	public DailyOffers(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//a[text()=' Daily Deals']")
	WebElement dailyElement;
	@FindBy(xpath = "//input[@id='gh-ac']")
	WebElement inputElement;
	
	
	
	
	
	public void clickDailyDeals() {
		clickSave(dailyElement);
		input(dailyElement, "samsung tv 4k");
	}
}
