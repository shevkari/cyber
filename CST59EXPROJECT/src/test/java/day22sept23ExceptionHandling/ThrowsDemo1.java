package day22sept23ExceptionHandling;

public class ThrowsDemo1 {

	static void m1() throws InterruptedException
	{
		System.out.println("Entering in m1() method");
	/*	try {
			m2();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	*/
		
		m2();
		System.out.println("Returning from m1() method");
	}

	static void m2() throws InterruptedException
	{
		System.out.println("Entering in m2() method");
	/*	try {
			m3();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	*/
		
		m3();
		System.out.println("Returning from m2() method");
	}
	
	static void m3() throws InterruptedException
	{
		System.out.println("Entering in m3() method");
	/*	try {
			Thread.sleep(3000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	*/	
		
		Thread.sleep(3000l);
		System.out.println("Returning from m3() method");
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Starts");
	
	/*	try {
			m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	*/
		m1();
		System.out.println("Program Ends");
		
	}

}
