package com.cs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cs.Driver.DriverManager;
import com.cs.constants.FrameworkConstants;
import com.cs.enums.WaitStratergy;
import com.cs.reports.ExtentLogger;

public class BasePage {

	protected void click(By by,WaitStratergy waitStratergy,String elementName) {
		
		explicitlyWaitForelement(by,waitStratergy);
		DriverManager.getTL().findElement(by).click();
		ExtentLogger.pass(elementName+" Clicked");
	}
	
	protected void sendKeys(By by,String value, WaitStratergy waitStratergy,String elementName) {
		explicitlyWaitForelement(by,waitStratergy);
		DriverManager.getTL().findElement(by).sendKeys(value);
		ExtentLogger.pass(value + " is entered successfully in "+ elementName);
	}
	
	public static String getTitle() {
		return DriverManager.getTL().getTitle();
	}

	
	private void explicitlyWaitForelement(By by, WaitStratergy waitStratergy) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getTL(),
								FrameworkConstants.getexplicitwait());
		if(waitStratergy==WaitStratergy.PRESENCE || waitStratergy==WaitStratergy.NONE)
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		else if(waitStratergy==WaitStratergy.CLICKABLE)
			wait.until(ExpectedConditions.elementToBeClickable(by));
		else if(waitStratergy==WaitStratergy.VISIBLE)
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
}