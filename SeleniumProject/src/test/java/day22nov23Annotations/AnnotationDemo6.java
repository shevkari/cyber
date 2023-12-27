package day22nov23Annotations;

import java.util.Random;

import org.testng.annotations.Test;

public class AnnotationDemo6 {


	@Test(expectedExceptions=NullPointerException.class)
	public void reg() // test method
	{
		String s="";
		System.out.println(s.length());
		Random rnd = new Random();
		int i = rnd.nextInt(5000);
		System.out.println("User try to registered");
		System.out.println("user_"+i);
	}
	
	@Test
	public void Login()
	{
		System.out.println("User try to log in");
	}
		
	
	
		
	
	
	
}
