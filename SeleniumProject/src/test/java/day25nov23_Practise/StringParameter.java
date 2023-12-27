package day25nov23_Practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StringParameter {

	@Test
	
	@Parameters({"Name"})
	
	public void NameA(String str)
	{
		System.out.println(str);
	}
	
}
