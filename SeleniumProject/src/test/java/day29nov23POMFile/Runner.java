package day29nov23POMFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@Test(description="Verify login for Orange HRM")
	public void loginPage()
	{
		LoginPage lp = new LoginPage(driver);
		LandingPage ldp = lp.enterUserName("Admin").enterPassword("admin123").clickBtn();
		
		String actLabel = ldp.getText();
		String expLabel = "Dashboard";
		
		Assert.assertEquals(actLabel, expLabel,"actLabel not matches expLabel");
		
	}
	
	@Test
	public void addCustomer() throws InterruptedException 
	{
		LoginPage lp = new LoginPage(driver);
		LandingPage ldp = lp.enterUserName("Admin").enterPassword("admin123").clickBtn();
		
		ldp.clickOnPIM();
		CustomerPage ap = ldp.clickAddButton();
	
		ap.addCustomerDetails();
	}
}
