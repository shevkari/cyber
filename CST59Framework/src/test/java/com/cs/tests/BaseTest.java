package com.cs.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cs.Driver.Driver;

public class BaseTest {

	protected BaseTest() {}
	
	
		
	@BeforeMethod
	public void setUp() throws Exception
	{
		Driver.initdriver();
		
	}
	
	@AfterMethod
	public void tearDown() 
	{
		Driver.quitDriver();
	}
	
}
