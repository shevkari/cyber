package day27nov23ParamaterAssertation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo2 {

	@Test
	public void test1()
	{
	
	/*	System.out.println("method start");
		Assert.fail("Intentionally failing the test method");
		System.out.println("method Ended");
	*/
		
/*		System.out.println("method start");
		int i= 10;
		int j= 10;
	//	Assert.assertTrue(i==j,"i is NOT equal to j");
		
		Assert.assertFalse(i==j,"i is equal to j");
		
		System.out.println("method Ended");
*/
		
		
/*		 HardAssertionDemo2 had = new HardAssertionDemo2();
	//	 had=null;
		 
		 Assert.assertNotNull(had,"Contains null value");
*/
		
/*		HardAssertionDemo2 had = new HardAssertionDemo2();
	//	 had=null;
		 
		 Assert.assertNull(had,"Contains NOT null value");
*/	
		 
		int a = 10;
		int b = 10;
		
		Assert.assertNotEquals(a, b,"Value of a is equal to value of b");
		
		
	}
	
	
	
}
