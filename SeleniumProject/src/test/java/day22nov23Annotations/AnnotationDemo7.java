package day22nov23Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo7 {


	@Test
	public void reg() // test method
	{
		System.out.println("User try to registered");
	}
	
	@Test
	public void AA()
	{
		System.out.println("ABC");
	}
	
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Annotation @BeforeSuite");
	}
		
	
	@AfterSuite
	public void AfterSuite ()
	{
		System.out.println("Annotation @AfterSuite");
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

	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Annotation @BeforeTest");
	}
	
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Annotation @BeforeClass");
	}
	
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("Annotation @After Class");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("Annotation @AfterTest");

	}
	
}
