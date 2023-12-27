package day23nov23DataProvider;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestDemo2 {

	@Test(dataProvider="getValue")
	public void Login(Map<String,String> map)
	{
		System.out.println("Login with details : un--> " + map.get("name")+ " pwd--> " + map.get("pwd") 
		+ " age-->" + map.get("age"));
	}
	
	@DataProvider
	public Object[] getValue()
	{
		Object[] data = new Object[4];
		
		Map<String,String> map1 = new HashMap<>();
		map1.put("name","Virat");
		map1.put("pwd", "Virat@123");
		map1.put("age", "34");
		data[0] = map1;
		
		Map<String,String> map2 = new HashMap<>();
		map2.put("name","Rohit");
		map2.put("pwd","Rohit@123");
		map2.put("age", "36");
		data[1]=map2;
		
		Map<String,String> map3 = new HashMap<>();
		map3.put("name","Shikhar");
		map3.put("pwd","Shikhar@123");
		map3.put("age","37");
		data[2]=map3;
		
		Map<String, String> map4 = new HashMap<>();
		map4.put("name", "Rahul");
		map4.put("pwd", "Rahul@123");
		map4.put("age", "31");
		data[3]=map4;
		
		return data;
	}
}
