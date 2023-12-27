package amazonPOM;


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
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void searchItem() 
	{
		HomePage hp = new HomePage(driver);
		LandingPage lpg = hp.loginAction("Iphone");
		CheckOutPage cop = lpg.actionOnLanding("9763037354","Amol1866");
		String actLabel = cop.getLabel();
		String expLabel = "Checkout";
		
		Assert.assertEquals(actLabel,expLabel,"Actual NOT matches Expected");
	}
	
}
