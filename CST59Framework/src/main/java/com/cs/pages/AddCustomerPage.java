package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;
import com.cs.enums.WaitStratergy;

public class AddCustomerPage extends BasePage {
	
	private static final By Addbtn = By.xpath("//div[@id='app']//div[2]/div[1]/button");
	private static final By txtFirstName = By.name("firstName");
	private static final By txtMiddleName = By.name("middleName");
	private static final By txtLastName = By.name("lastName");
	private static final By Savebtn = By.xpath("//button[@type='submit']");
	private static final By successMsg = By.xpath("//div[@id='oxd-toaster_1']//div[2]/p[2]");
	
	public AddCustomerPage clickAddCustomerBtn() {
		click(Addbtn,WaitStratergy.CLICKABLE,"Add Customer Button");
		return this;
	}
	
	public AddCustomerPage enterFirstName(String FN) {
		sendKeys(txtFirstName,FN,WaitStratergy.PRESENCE,"First Name");
		return this;
	}
	
	public AddCustomerPage enterMiddleName(String MN) {
		sendKeys(txtMiddleName,MN,WaitStratergy.PRESENCE,"Middle Name");
		return this;
	}
	
	public AddCustomerPage enterLastName(String LN) {
		sendKeys(txtLastName,LN,WaitStratergy.PRESENCE,"Last Name");
		return this;
	}

	public void clickSaveCustomerBtn() {
		click(Savebtn,WaitStratergy.CLICKABLE,"Save Button");
		
	}
	
	public String getSuccessMsg()
	{
		return DriverManager.getTL().findElement(successMsg).getText();
	}
	
}
