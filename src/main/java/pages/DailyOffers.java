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
	@FindBy(id = "gh-btn")
	WebElement searchBtnElement;
	@FindBy(xpath = "//span[text()='HP M24F (Black) FHD Monitor 23.8\" IPS Display AMD FreeSync 5ms VGA HDMI 75 Hz']")
	WebElement productTVElement;
	@FindBy(xpath = "//span[text()='Add to cart']")
	WebElement addToCartElement;
	@FindBy(css = ".btn.btn-prim.vi-VR-btnWdth-XL ")
	WebElement finalAddCartElement;
	
	
	
	public void clickDailyDeals() {
		clickSave(dailyElement);
		input(dailyElement, "samsung tv 4k");
	}
	
	
	public void clickDailyDeals02() {
		clickSave(dailyElement);
		input(dailyElement, "headphones");
		clickSave(searchBtnElement);
		if(isPresent(productTVElement));
		if(isDispalyed(productTVElement));
		clickSave(productTVElement);
		clickSave(addToCartElement);
		clickSave(finalAddCartElement);
	}
}
