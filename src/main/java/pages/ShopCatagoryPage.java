package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonWaits;

import static common.CommonActions.*;

public class ShopCatagoryPage {
	
	WebDriver driver;
	CommonWaits waits;
	
	public ShopCatagoryPage(WebDriver driver) {
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gh-shop-a")
	WebElement shopByCatagoriesbtnElement;
	@FindBy(xpath = "//a[text()='Parts & accessories']")
	WebElement autoElement;
	@FindBy(xpath = "//div[text()='Add a vehicle']")
	WebElement addVehiclElement;

	public void shopbtnclick() {
		clickSave(shopByCatagoriesbtnElement);
		clickSave(autoElement);
		
		waits.waitUntilVisible(addVehiclElement);
		if (isPresent(addVehiclElement)) {
			if (isDispalyed(addVehiclElement)) {
				clickSave(addVehiclElement);

			}
		}

	}
}
