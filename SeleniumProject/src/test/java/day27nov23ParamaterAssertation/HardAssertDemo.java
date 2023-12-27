package day27nov23ParamaterAssertation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo {

	@Test
	public void Test1String()
	{
		System.out.println("Test Start");
		String s1 = "pune";
		String s2 = "Pune1";
		
		Assert.assertEquals(s1, s2,"s1 is not equal to s2");
		
		System.out.println("Test End");
	}
	
	@Test
	public void Test2Integer() {
		
		System.out.println("Test Start");
 		int i1 = 34;
		int i2 = 34;
		
		Assert.assertEquals(i1,i2,"i1 is not equal to i2");
		System.out.println("Test End");	}

	
	@Test
	public void Test3Float()
	{
		System.out.println("Test Start");
		Float f1 = 100.45f;
		Float f2 = 100.45f;
		Assert.assertEquals( f1, f2,"f1 is not equal to f2");
		
		System.out.println("Test End");
	}
	
}
