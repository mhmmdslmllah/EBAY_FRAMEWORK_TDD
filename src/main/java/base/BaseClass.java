package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DailyOffers;
import pages.HelpAndContactPage;
import pages.HiMuhammedPage;
import pages.HomePage;
import pages.NewAccount;
import pages.ShopCatagoryPage;
import utils.Configuration;
import static utils.IConstant.*;
import java.time.Duration;

public class BaseClass {

	Configuration config = new Configuration();
	WebDriver driver;
	protected HomePage homePage;
	protected NewAccount newAccount;
	protected DailyOffers dailyOffers;
	protected ShopCatagoryPage shopCatagoryPage;
	protected HelpAndContactPage helpAndContactPage;
	protected HiMuhammedPage hiMuhammedPage;
	
	
	@BeforeMethod
	public void setUp() {
		initDriver();
		driver.manage().window().maximize();
		driver.get(config.getProperties().getProperty(URL));
		long pageLoadTime = Long.parseLong(config.getProperties().getProperty(IMPLICIT_WAIT));
		long implicitWait = Long.parseLong(config.getProperties().getProperty(IMPLICIT_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		inputClasses();
	}

	private void initDriver() {
		String browserName = config.getProperty(BROWSER);
		switch (browserName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case SAFRI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
	}

	public void inputClasses() {
		homePage = new HomePage(driver);
		newAccount = new NewAccount(driver);
		dailyOffers = new DailyOffers(driver);
		shopCatagoryPage = new ShopCatagoryPage(driver);
		helpAndContactPage = new HelpAndContactPage(driver);
		hiMuhammedPage = new HiMuhammedPage(driver);
	}

	public WebDriver getDriver() {
		return driver;
	}

	@AfterMethod

	public void tearDown() {
		getDriver().quit();

	}
}