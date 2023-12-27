package day27nov23ParamaterAssertation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert2 {

	SoftAssert sa = new SoftAssert();
		@Test
		public void SoftAssertString()
		{
			String s1 ="Virat";
			String s2 = "Varat1";
			
			sa.assertEquals(s1, s2,"s1 is not Equal to s2");
			
			sa.assertAll();
		}
		
		@Test
		public void SoftAssertInteger()
		{
		
			int i1 =1100;
			int i2 = 100;
			
			sa.assertEquals(i1, i2,"i1 is not Equal to i2");
			
		//	sa.assertAll();
		}

		@Test
		public void SoftAssertFloat()
		{
			
			Float f1 =100.19f;
			Float f2 = 100.10f;
						
			sa.assertEquals(f1, f2,"f1 is not Equal to f2");
		//	sa.assertAll();
			
		}
		
		
	
}
