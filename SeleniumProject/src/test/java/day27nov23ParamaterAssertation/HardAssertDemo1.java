package day27nov23ParamaterAssertation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo1 {

		@Test
		public void test1String()
		{
			String s1 = "Pune";
			String s2 = "Pune1";
			
			int i1=100;
			int i2=100;
			
			Float f1 = 100.30f;
			Float f2 = 100.30f;
			
			Assert.assertEquals(s1, s2,"s1 is not equal to s1");
			
			Assert.assertEquals(i1, i2, " i1 is not Equal to i2");
			
			Assert.assertEquals(f1, f2,"f1 is not equal to f2 ");
		
		}
		
	

}
