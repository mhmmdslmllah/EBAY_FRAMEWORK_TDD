package hi;

import org.testng.annotations.Test;

import base.BaseClass;
import utils.data.AutoData;

public class Hi_test_with_auto_data extends BaseClass{
	 
	AutoData autoData = new AutoData("saleem689@yahoo.com", "123.Ebay");
	
	@Test(priority = 2, enabled = false)
	public void signInMuhammed() {
		hiMuhammedPage.signInMuhammedSteps(autoData.getUserName(), autoData.getPassword());
	}
	
	@Test(priority = 1, enabled = true, dependsOnMethods = "signInMuhammed")
	public void signInMuhammedWithNoPara() {
		hiMuhammedPage.signInMuhammedSteps(autoData);
	}
}
