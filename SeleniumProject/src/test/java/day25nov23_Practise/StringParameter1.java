package day25nov23_Practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StringParameter1 {

	@Test
	
	@Parameters({"Name"})
	
	public void NameB(String str)
	{
		System.out.println(str);
	}
	
}
