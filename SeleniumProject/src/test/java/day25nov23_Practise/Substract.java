package day25nov23_Practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Substract {

	@Test
	@Parameters({"a","b"})
	public void Sub(int c, int d)
	{
		System.out.println(c-d);
	}
}
