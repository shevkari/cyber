package com.cs.constants;

import java.time.Duration;

public final class FrameworkConstants {
	
	private static final String ResourcePath = System.getProperty("user.dir");
	private static final String ConfigPath = ResourcePath+"/src/test/resources/config/config.properties";
	private static final Duration explicitwait = Duration.ofSeconds(5);
	
	public static String  getResourcePath() {
		return ResourcePath;
	}
	
	public static String getConfigPath() {
		return ConfigPath;		
	}
	
	public static Duration getexplicitwait() {
		return explicitwait;
	}
}
