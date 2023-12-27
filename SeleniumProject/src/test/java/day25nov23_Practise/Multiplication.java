package day25nov23_Practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiplication {

	@Test
	@Parameters({"a","b"})
	public void mult(int c, int d)
	{
		System.out.println(c*d);
	}
}
