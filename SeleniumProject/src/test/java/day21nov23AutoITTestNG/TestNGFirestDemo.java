package day21nov23AutoITTestNG;

import org.testng.annotations.Test;

public class TestNGFirestDemo {

	@Test
		public void reg()
		{
		System.out.println("Test script 1");
		}
		
	@Test
	public void login()
	{
		System.out.println("Test script 2");
		int i=11;
		if(i/2==0)
			System.out.println("pass");
		else
			System.out.println("failed");
	}
		
		@Test
		public void logout()
		{
			System.out.println("Test script 3");
		}

}
