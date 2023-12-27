package com.cs.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cs.Driver.DriverManager;
import com.cs.constants.FrameworkConstants;
import com.cs.enums.WaitStratergy;


public class ExplicitWaitFactory {

	public static WebElement performExplicitWait(WaitStratergy waitStratergy, By by) {
		WebElement element = null;
		if (waitStratergy == WaitStratergy.CLICKABLE)
		{
		WebDriverWait wait = new
		WebDriverWait(DriverManager.getTL(),
		FrameworkConstants.getexplicitwait());
		element =wait.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if (waitStratergy == WaitStratergy.PRESENCE)
		{
		WebDriverWait wait = new
		WebDriverWait(DriverManager.getTL(),
		FrameworkConstants.getexplicitwait());
		element =wait.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if (waitStratergy == WaitStratergy.VISIBLE)
		{
		WebDriverWait wait = new
		WebDriverWait(DriverManager.getTL(),
		FrameworkConstants.getexplicitwait());
		element =wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if (waitStratergy == WaitStratergy.NONE)
		element = DriverManager.getTL().findElement(by);

		return element;
	}
}
