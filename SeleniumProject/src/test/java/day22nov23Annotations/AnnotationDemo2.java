package day22nov23Annotations;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo2 {


	@Test
	public void reg() // test method
	{
		System.out.println("User try to registered");
	}
	
	@Test(dependsOnMethods= {"reg"})
	public void Login()
	{
		System.out.println("User try to log in");
		Assert.fail();
	}
		
	
	@Test(dependsOnMethods= {"reg","Login"})
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
