package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HelpAndContactPage {
	
	WebDriver driver;
	
	public HelpAndContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()=' Help & Contact']")
	WebElement helpContactElement;
	@FindBy(xpath ="//a[text()='Sign in' and @class='signIn']")
	WebElement customerSignInElement;
	@FindBy(xpath = "//input[@id='userid']")
	WebElement continueUsrNameElement;
	@FindBy(id = "signin-continue-btn")
	WebElement continueBtnElement;
	@FindBy(xpath = "//input[@id='pass']")
	WebElement continuePassElement;
	@FindBy(id = "sgnBt")
	WebElement signInBtnElement;
	@FindBy(id = "webauthn-maybe-later-link")
	WebElement mayBeLaterElement;
	
	
	public void helpAndContactPageSteps() {
		clickSave(helpContactElement);
		clickSave(customerSignInElement);
		input(continueUsrNameElement, "saleem689@yahoo.com");
		clickSave(continueBtnElement);
		input(continuePassElement, "123.Ebay");
		clickSave(signInBtnElement);
		clickSave(mayBeLaterElement);
		
	}
	
}
