package day28nov23GroupsListeners;


import java.util.Date;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenerTestCases1 {

	@Test
	public void TC1() throws InterruptedException
	{
		Date dt = new Date();
		System.out.println(dt.toString());
		Thread.sleep(2000l);
		System.out.println("TC1 passed...");
		Assert.assertTrue(true,"Intentionally passing TC1...");
	}
	
	@Test
	public void TC2() throws InterruptedException
	{
		Date dt = new Date();
		System.out.println(dt.toString());
		Thread.sleep(2000l);
		System.out.println("TC2 failed...");
		Assert.assertTrue(false, "Intentionally failing TC2....");
	}
	
	@Test
	public void TC3() throws InterruptedException
	{
		Date dt = new Date();
		System.out.println(dt.toString());
		Thread.sleep(2000l);
		System.out.println("TC3 skipped...");
		throw new SkipException("Intentioannly Skipping TC3...");
	}
}
