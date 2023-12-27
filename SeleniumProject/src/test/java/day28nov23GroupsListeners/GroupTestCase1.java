package day28nov23GroupsListeners;

import org.testng.annotations.Test;

public class GroupTestCase1 {

	
		@Test(groups= {"payment", "smoke"})
		public void paymentTC1()
		{
			System.out.println("PaymentTC1 is running....");
		}
		
		@Test(groups= {"payment"})
		public void paymentTC2()
		{
			System.out.println("PaymentTC2 is running....");
		}

		@Test(groups= {"shipping"})
		public void ShippingTC3()
		{
			System.out.println("ShippingTC3 is running....");
		}
		
		@Test(groups= {"shipping", "regression"})
		public void ShippingTC4()
		{
			System.out.println("ShippingTC4 is running....");
		}
	
		
	
}
