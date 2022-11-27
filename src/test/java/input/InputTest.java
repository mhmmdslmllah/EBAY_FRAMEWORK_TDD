package input;

import org.testng.annotations.Test;

import base.BaseClass;
import reporting.Logs;

public class InputTest extends BaseClass{
	
	@Test(priority = 2, enabled = true)
	public void aTest() {
		homePage.typeField();
	}

	@Test(priority = 1, enabled = false)
	public void bTest() {
		Logs.log("This is bTest priority 1.");
	}
	
	@Test(priority = 4, enabled = false)
	public void cTest() {
		Logs.log("This is cTest priority 4.");
	}
	
	@Test(priority = 0, enabled = false)
	public void dTest() {
		Logs.log("This is dTest priority 3.");
	}
}
