package day22nov23Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 {


	@Test(priority=1)
	public void reg() // test method
	{
		System.out.println("User try to registered");
	}
	
	@Test(priority=5)
	public void Login()
	{
		System.out.println("User try to log in");
	}
		
	
	@Test(priority=10)
	public void Logout()
	{
		System.out.println("user try to logout");
	}
		
	@BeforeMethod
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
