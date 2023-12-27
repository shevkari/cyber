package day27nov23ParamaterAssertation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassing {

	@Parameters("browser")
	@Test
	public void Amazon(String st)
	{
		System.out.println("Amazon Opens on browser " + st);
		
	}
	
	@Parameters({"browser","RCode"})
	@Test
	public void Google(String s, String rc)
	{
		System.out.println("Google opens on browser "+ s +" and Response code is " + rc );
		
	}
	
}
