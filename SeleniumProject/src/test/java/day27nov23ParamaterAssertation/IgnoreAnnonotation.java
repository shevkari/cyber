package day27nov23ParamaterAssertation;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreAnnonotation {
	
	@Test
	public void Test1()
	{
		System.out.println("First Test Method");
	}

	@Ignore
	@Test
	public void Test2()
	{
		System.out.println("Second Test Method");
	}
}
