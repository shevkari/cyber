package day22nov23Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo3 {


	@Test(description="User registeration Test method")
	public void reg() // test method
	{
		System.out.println("User try to registered");
	}
	
	@Test(enabled = true, description="User Login Test method")
	public void Login()
	{
		System.out.println("User try to log in");
	}
		
	
	@Test(description="User Logout Test method")
	public void Logout()
	{
		System.out.println("user try to logout");
	}
		
	@BeforeMethod(alwaysRun=true)
	public void SetUp()
	{
		System.out.println("Annotation @BeforeMethod");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Annotation @AfterMethod");
	}

	
	
}
