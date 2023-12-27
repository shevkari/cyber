package com.cs.Driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

	private DriverManager() {}
	
	public static WebDriver driver;
	private static ThreadLocal<WebDriver> TL = new ThreadLocal<>();
	
	public static void setTL(WebDriver driverRef) {
		TL.set(driverRef);
	}
	
	public static WebDriver getTL() {
		return TL.get();
	}
	
	public static void unload() {
		TL.remove();
	}

	
}
