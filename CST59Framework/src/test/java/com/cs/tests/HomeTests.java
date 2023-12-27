package com.cs.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.cs.Driver.DriverManager;

public final class HomeTests extends BaseTest {
	
	private HomeTests() {}

	@Test
	public void test3() {
		DriverManager.getTL().findElement(By.name("q")).sendKeys("Training",Keys.ENTER);
		
	}

}
