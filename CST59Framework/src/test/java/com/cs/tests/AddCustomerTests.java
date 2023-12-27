package com.cs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.AddCustomerPage;
import com.cs.pages.OrangeHRMSLoginPage;
import com.cs.pages.orangeHRMSHomePage;

public class AddCustomerTests extends BaseTest{
	
	@Test
	public void AddCustomerTest()
	{
		OrangeHRMSLoginPage ohlp = new OrangeHRMSLoginPage();
		orangeHRMSHomePage ohhp = ohlp.enterUserName("Admin").enterPassword("admin123").clickBtn();
	
		AddCustomerPage acp = ohhp.clickPIMOption().clickAddCustomerBtn();
		
		acp.clickAddCustomerBtn().enterFirstName("Rohit_"+System.currentTimeMillis())
			.enterMiddleName("Gurunath_"+System.currentTimeMillis())
			.enterLastName("Sharma_"+System.currentTimeMillis())
			.clickSaveCustomerBtn();
		try {
			Thread.sleep(50000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		String actSuccessMsg = acp.getSuccessMsg();
//		String expSuccessMsg = "Successfully Saved";
//		
//		Assert.assertEquals(expSuccessMsg,actSuccessMsg);
//		
	}

}
