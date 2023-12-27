package com.cs.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cs.pages.OrangeHRMSLoginPage;
import com.cs.reports.ExtentReport;

public class orangeHRMSTests extends BaseTest{
	
	@Test(dataProvider="logintestdata")
	public void LoginLogoutTest(String un, String pw) {
		
		//ExtentReport.createTest("LoginLogoutTest");
		OrangeHRMSLoginPage ohlp = new OrangeHRMSLoginPage();
		String actualTitle = ohlp.enterUserName(un).enterPassword(pw).clickBtn().clickProfilePic().clickLogout().getTitle();
	
		String expectedTitle = "OrangeHRM";
		
		Assert.assertEquals(actualTitle, expectedTitle,"not matches");
	}
	
	@DataProvider(name="logintestdata",parallel=true)
	public Object[][] getData(){
		return new Object[][] {
			
				{"Admin","admin123"},
				{"admin","admin12345"}
			};
		
				
	}

}
