package day23nov23DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestDemo {


	@Test(dataProvider = "getValues")
	public void Login(String UN, String pwd, String age)
	{
		System.out.println("Login with details : UN--> " + UN + " and Pwd--> " + pwd +" Age--> "+ age);
	}
	
	@DataProvider
	public Object[][] getValues()
	{
		Object [] [] data = new Object [4] [3] ; 
		
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
