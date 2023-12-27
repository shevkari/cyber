package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.enums.WaitStratergy;

public final class OrangeHRMSLoginPage extends BasePage {

	
	private static final By username = By.name("username");
	private static final By password = By.name("password");
	private static final By btnLogin = By.xpath("//button[@type='submit']");
	
	
	public OrangeHRMSLoginPage enterUserName(String un) {
	
		sendKeys(username, un,WaitStratergy.CLICKABLE,"username");
		return this;
	}

	public OrangeHRMSLoginPage enterPassword(String pwd) {
		
		sendKeys(password, pwd,WaitStratergy.CLICKABLE,"password");
		return this;
	}
	
	public orangeHRMSHomePage clickBtn() {
		
		click(btnLogin,WaitStratergy.CLICKABLE,"Login Button");
		return new orangeHRMSHomePage();
	}
	
	
	
}
