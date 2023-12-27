package com.cs.Driver;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.cs.enums.configProperty;

import utlils.PropertyUtils;


public final class Driver {
	
	private Driver() {}
		
	public static void initdriver() throws Exception
	{
		if(Objects.isNull(DriverManager.getTL())) {
			
		
			 DriverManager.setTL(new ChromeDriver());
		DriverManager.getTL().get(PropertyUtils.getValue(configProperty.URL));
		DriverManager.getTL().manage().window().maximize();
		DriverManager.getTL().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	}

	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getTL())){
			DriverManager.getTL().quit();
			DriverManager.unload();
		}
	}
}
