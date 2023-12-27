package com.cs.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.cs.Driver.DriverManager;

public final class LoginTests extends BaseTest {

	private LoginTests() {}
	
	@Test
	public void Test1() {
		
		
		DriverManager.getTL().findElement(By.name("q")).sendKeys("Cyber",Keys.ENTER);
		
	}
	
	@Test
	public void Test2() {
				
		DriverManager.getTL().findElement(By.name("q")).sendKeys("Success",Keys.ENTER);

	}
	
	
	
	
	
}
