package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class NewAccount {
	public NewAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='register']")
	WebElement registrationElement;
	@FindBy(xpath = "//input[@id='firstname']")
	WebElement firstNamElement;
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement lastNamElement;
	@FindBy(xpath = "//input[@id='Email']")
	WebElement eMailElement;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordElement;
	@FindBy(id = "EMAIL_REG_FORM_SUBMIT")
	WebElement continuElement;
	@FindBy(xpath = "(//a[text()='Sign in'])[1]")
	WebElement hiMuhammedElement;

	public void clickAccount() {
		clickSave(registrationElement);
		input(firstNamElement, "saleem");
		input(lastNamElement, "Mohammad");
		input(eMailElement, "Saleem689@yahoo.com");
		input(passwordElement, "098.Ebay");
		clickSave(continuElement);
	}

}
