package day23nov23DataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestDemo1 {

	@Test(dataProvider="DP")
	public void Login(String un, String pwd, String age)
	{
		if(un.equals("Shikhar"))
		Assert.fail("Test fail");
		
		System.out.println("Login with details : "+" UN--> " + un +" pwd--> "+ pwd  +" age--> "+ age );
	}
	
	@DataProvider(name="DP")
//	public Object[][] getValue()
	public String[][] getValue()
	{
	//	Object[][] data = new Object[4][3];
		
		String[][] data = new String [4][3];
		
		data[0][0] = "Virat";
		data[0][1] = "Virat@123";
		data[0][2] = "34";
		
		data[1][0] = "Rohit";
		data[1][1] = "Rohit@123";
		data[1][2] = "36";
		
		data[2][0] = "Shikhar";
		data[2][1] = "Shikhar@123";
		data[2][2] = "37";
		
		data[3][0] = "Rahul";
		data[3][1] = "Rahul@123";
		data[3][2] = "31";
		
		return data;
	}

}
