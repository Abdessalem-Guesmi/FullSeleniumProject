package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseTests {

	public WebDriver driver;
	protected HomePage homePage;

	@BeforeClass
	public void setUp() {

	}

	@BeforeMethod
	public void goHome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/");
		homePage = new HomePage(driver);
	}

	@AfterMethod
	public void recordFailure() {

		driver.close();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
