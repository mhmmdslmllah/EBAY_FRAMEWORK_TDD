package base;

  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Configuration;
import static utils.Constant.* ;

import java.time.Duration;


public class BaseClass {
	
	Configuration config = new Configuration();
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config.getProperties().getProperty(URL.name()));
		long pageLoadTime = Long.parseLong(config.getProperties().getProperty(IMPLICIT_WAIT.name()));
		long implicitWait =Long.parseLong(config.getProperties().getProperty(IMPLICIT_WAIT.name()));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	@AfterMethod
	
	public void tearDown() {
		getDriver().quit();
	}
}
