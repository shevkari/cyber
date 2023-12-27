package day22nov23Annotations;

import org.testng.annotations.Test;

public class AnnotationDemo5 {


	@Test(timeOut=20000) // timeout should be in millisecond
	public void reg() throws InterruptedException // test method
	{
		Thread.sleep(2000l);
	//	Random rnd = new Random();
	//	int i = rnd.nextInt(5000);
		System.out.println("User try to registered");
	//	System.out.println("user_"+i);
	}
	
	@Test(timeOut=2)
	public void Login() throws InterruptedException
	{
		
		System.out.println("User try to log in");
	}
		
	
	
	
}
