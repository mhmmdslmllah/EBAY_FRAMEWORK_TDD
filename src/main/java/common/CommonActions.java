package common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import reporting.Logs;

public class CommonActions {

	public static void input(WebElement element, String value) {
		try {
			element.sendKeys(value);
			Logs.log(value + " : has been passed to ------>" + element);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log(value + "Element not found------>" + element);
			Assert.fail();
		}
	}

	public static void clickSave(WebElement element) {
		try {
			element.click();
			Logs.log(element + " : has been clicked");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("Element not found------>" + element);
			Assert.fail();
		}
	}

	public static boolean isPresent(WebElement element) {
		try {
			element.isEnabled();
			Logs.log(element + "<---- has been present");
			return true;
		} catch (NoSuchElementException | NullPointerException e) {
			Logs.log("Element not found ----->" + element);
			return false;
		}
	}

	public static boolean isPresent(By byLoactor, WebDriver driver) {
		List<WebElement> elements = driver.findElements(byLoactor);
		if (elements.size() == 0) {
			Logs.log("Element not found ----->" + byLoactor);
			return false;
		} else {
			Logs.log(elements.get(0) + "<---- has been present");
			return true;
		}
	}
	
	public static boolean isDispalyed(WebElement element) {
		if (element.isDisplayed()) {
			Logs.log(element + "<------ is VISIBLE" );
			return true;
		}else {
			Logs.log(element + "<------ is NOT VISIBLE" );
			return false;
		}
	}
} 
