package day27nov23ParamaterAssertation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SaofAssert1 {

	@Test
	public void SoftAssertDemoString()
	{
		String s1 ="Virat";
		String s2 = "Varat1";
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(s1, s2,"s1 is not Equal to s2");
		
	
		int i1 =100;
		int i2 = 101;
		
		
		
		sa.assertEquals(i1, i2,"i1 is not Equal to i2");
		

		Float f1 =100.19f;
		Float f2 = 100.10f;
		
		
		
		sa.assertEquals(f1, f2,"f1 is not Equal to f2");
		
		sa.assertAll();
	}

	
	
}

