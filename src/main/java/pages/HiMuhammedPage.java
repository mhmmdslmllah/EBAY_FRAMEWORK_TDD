package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.data.AutoData;

import static common.CommonActions.*;

public class HiMuhammedPage {

	public HiMuhammedPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[text()='Sign in'])[1]")
	WebElement signInMuhammedElement;
	@FindBy(xpath = "//input[@id='userid']")
	WebElement hiUserNamElement;
	@FindBy(id = "signin-continue-btn")
	WebElement contBtnElement;
	@FindBy(xpath = "//input[@id='pass']")
	WebElement passElement;
	@FindBy(id = "sgnBt")
	WebElement signInBtnElement;

	public void signInMuhammedSteps(String userName, String password) {
		clickSave(signInMuhammedElement);
		input(hiUserNamElement, userName);
		clickSave(contBtnElement);
		input(passElement, password);
		clickSave(signInBtnElement);
	}

	public void signInMuhammedSteps(AutoData autoData) {
		clickSave(signInMuhammedElement);
		input(hiUserNamElement, autoData.getUserName());
		clickSave(contBtnElement);
		input(passElement, autoData.getPassword());
		clickSave(signInBtnElement);
	}
}