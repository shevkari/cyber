package day21sept23ExceptionHandling;

public class ExceptionHandlingDemo3 {

	/**
	 * m1 calls m2
	 */
	static void m1()
	{
			m2();
	}
	/**
	 * m2 calls m3
	 */
	static void m2()
	{
		m3();
	}
	
	/**
	 * m3 has try catch
	 */
	static void m3()
	{
int res=0;
		
		try {
			
			int a = 10, b=0;
			res = a / b;
			System.out.println(res);
			
			String str = null;
			System.out.println(str.length());
			
			int[] arr = {1,2,3,4,5};
			System.out.println(arr[11]);
		}
		
		catch(ArithmeticException e)
			{
			System.out.println("divide by zero! ");
			e.getMessage();
			e.printStackTrace();
			}
		
		catch(NullPointerException npe)
		{
			System.out.println("You are trying to get length of null String...");
			npe.getMessage();
			npe.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException ao)
		{
			System.out.println("You are trying to print value of more than length value");
			ao.getMessage();
			ao.printStackTrace();
		}
		System.out.println("res :-> " + res);
	}
	
	public static void main(String[] args) {

		System.out.println("In main Method :");
		m1();
		System.out.println("Again in \"main\" Method");
	}

}
