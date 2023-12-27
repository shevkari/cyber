package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.enums.WaitStratergy;

public class orangeHRMSHomePage extends BasePage{
	
	private static final By profilePic = By.xpath("//span[@class='oxd-userdropdown-tab']");
	private static final By btnLogout  = By.xpath("(//a[@role='menuitem'])[4]");
	private static final By PIMOption = By.xpath("//div[@id='app']//ul/li[2]/a/span");
	
	public AddCustomerPage clickPIMOption()
	{
		click(PIMOption,WaitStratergy.CLICKABLE,"PIM Option");
		return new AddCustomerPage();
	}
	
	public orangeHRMSHomePage clickProfilePic() {
		click(profilePic,WaitStratergy.PRESENCE,"Profile Pic");
			return this;
	}

	public OrangeHRMSLoginPage clickLogout() {
		
		
		click(btnLogout,WaitStratergy.CLICKABLE,"Logout Option");
		return new OrangeHRMSLoginPage();
	}
}
