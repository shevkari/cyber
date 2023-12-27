package day28nov23GroupsListeners;

import java.util.Date;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenerTestCases2 {

	@Test
	public void TC4() throws InterruptedException
	{
		Date dt = new Date();
		System.out.println(dt.toString());
		Thread.sleep(2000l);
		System.out.println("TC4 passed...");
		Assert.assertTrue(true,"Intentionally passing TC4...");
	}
	
	@Test
	public void TC5() throws InterruptedException
	{
		Date dt = new Date();
		System.out.println(dt.toString());
		Thread.sleep(2000l);
		System.out.println("TC5 failed...");
		Assert.assertTrue(false, "Intentionally failing TC5....");
	}
	
	@Test()
	public void TC6() throws InterruptedException
	{
		Date dt = new Date();
		System.out.println(dt.toString());
		Thread.sleep(2000l);
		System.out.println("TC6 skipped...");
		throw new SkipException("Intentioannly Skipping TC6...");
	}
}
