package help;

import org.testng.annotations.Test;
import base.BaseClass;
import reporting.Logs;

public class HelpAndContactPageTest extends BaseClass {

	@Test(enabled = false)
	public void customerService() {
		helpAndContactPage.helpAndContactPageSteps();
	}

	@Test(enabled = true, priority = 1)
	public void customerService01() {
		Logs.log("This is from group");
	}

	@Test(enabled = true, priority = 2, dependsOnMethods = "customerService01" )
	public void customerService02() {
		Logs.log("This is from group with priority 2");
	}

	@Test(groups = {"HelpAndContact", "priority"})
	public void customerService03() {
		Logs.log("This is from group with priority 3");

	}

	@Test(groups = {"HelpAndContact", "nopriority"})
	public void customerService04() {
		Logs.log("This is from group with no priority.");
	}
	
	@Test(groups = {"HelpAndContact", "priority"})
	public void customerService05() {
		Logs.log("This is from group with priority 5");

	}

	@Test(groups = {"HelpAndContact", "priority"})
	public void customerService06() {
		Logs.log("This is from group with priority 6");

	}
}