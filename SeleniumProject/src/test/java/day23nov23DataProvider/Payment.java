package day23nov23DataProvider;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Payment {
	
	@BeforeTest
	public void TearUp()
	{
		System.out.println("Beforetest() Annotation");
	}
	
	@AfterTest
	public void TearDown()
	{
		System.out.println("AfetrTest() Annotation");
	}

	@Test
	public void Test1()
	{
		System.out.println("Test1 from Payment class");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2 from Payment Class");
	}
}
