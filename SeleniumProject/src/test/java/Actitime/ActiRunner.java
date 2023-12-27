package Actitime;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActiRunner {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver = new EdgeDriver();
		driver.get("http://desktop-calvdqi:82/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void loginToActitime() 
	{
		LoginPage lp = new LoginPage(driver);
		LandingPage plg = lp.performAction("Admin", "manager");
		PerformOperations po = plg.actionsOnLandingPage();
		AddUserPage apu = po.userDetails();
		CreatedUserPage cpu = apu.enterUserDetails("Shiva", "Shiva@123","Shiva@123" ,"Shivansh","Amol","Shevkari","Shiva..Shevkari@gmial.com");
				List<String> str = cpu.listOfUser();
				
		System.out.println(str);
		String actual = str.get(0);
		String Expected = "System, Administrator (admin)1";
		//List<String> al = new ArrayList<>();
		//al.add(str);
		//System.out.println(al);
		
		Assert.assertEquals(actual,Expected,"actual is not matching with Expected");
		
	}
	
	@Test
	public void checkAssert()
	{
		LoginPage lp = new LoginPage(driver);
		LandingPage plg = lp.performAction("Admin", "manager");
		
		String actLabel = plg.getLabel();
		String ExpLabel = "Administrator System";
			
			
		Assert.assertEquals(actLabel,ExpLabel,"Actlabel NOT Matches to ExpLabel");
		
	}
}
