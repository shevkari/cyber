package day22nov23Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo {


	@Test
	public void reg() // test method
	{
		System.out.println("User try to registered");
	}
	
	@Test
	public void Login()
	{
		System.out.println("User try to log in");
	}
		
	
	@Test
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
