package day23nov23DataProvider;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Shipping {


	@BeforeTest
	public void TearUp()
	{
		System.out.println("BeforeTest Annotation from Shipping class");	
	}

	@AfterTest
	public void TearDown()
	{
		System.out.println("AfterTest annotation from Shipping Class");
	}
	
	
	@Test
	public void Test3()
	{
		System.out.println("Test3 from Shipping Class");
	}
	
	@Test
	public void Test4()
	{
		System.out.println("Test4 from Shipping class");
	}
	
}
