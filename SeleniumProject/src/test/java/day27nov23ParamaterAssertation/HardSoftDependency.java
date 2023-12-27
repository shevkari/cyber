package day27nov23ParamaterAssertation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardSoftDependency {

	@Test
	//Hard Dependency
	public void Reg()
	{
		Assert.fail();
		System.out.println("User Registerd");
		
	}
	
	@Test(dependsOnMethods="Reg")
	public void Login()
	{
		System.out.println("User login");
	}
	
	@Test(dependsOnMethods={"Login","Reg"},alwaysRun=true)
	// Soft Dependency
	public void Logout()
	{
		System.out.println("User Logout");
	}
	
	
}
