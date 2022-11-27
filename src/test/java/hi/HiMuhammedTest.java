package hi;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import base.BaseClass;

public class HiMuhammedTest extends BaseClass{
	
	@Test
	public void signInMuhammed() {
		hiMuhammedPage.signInMuhammedSteps("saleem689@yahoo.com","123.Ebay");
	}
	
	@Parameters({"userName", "password"})
	@Test
	public void signInMuhammedParameterized(String userName, String password) {
		hiMuhammedPage.signInMuhammedSteps(userName, password);

	}
}
