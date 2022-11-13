package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;


public class HomePage {

	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input.gh-tb.ui-autocomplete-input")
	WebElement searchFieldElement;
	@FindBy(xpath = "//a[text()='Saved']")
	WebElement saveIconElement;
	@FindBy(xpath = "//input[@id='userid']")
	WebElement userIdElement;
	@FindBy(id = "signin-continue-btn")
	WebElement clickContinuElement;
	@FindBy(xpath = "//input[@id='pass']")
	WebElement passwordElement;
	@FindBy(id = "sgnBt")
	WebElement signInElement;
	@FindBy(id = "webauthn-maybe-later-link")
	WebElement mayBeLaterElement;

	public void typeField() {
		input(searchFieldElement, "Iphone 14 pro");
		clickSave(saveIconElement);
		input(userIdElement, "saleem689@yahoo.com");
		clickSave(clickContinuElement);
		input(passwordElement, "123.Ebay");
		clickSave(signInElement);

		if (isPresent(mayBeLaterElement)) {
			if (isDispalyed(mayBeLaterElement)) {
				clickSave(mayBeLaterElement);
			}
		}

	}
}
