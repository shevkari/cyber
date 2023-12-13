package day21sept23ExceptionHandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		int res=0;
		
		try {
			
			//int a = 10, b=0;
			//res = a / b;
			//System.out.println(res);
			
			//String str = null;
			//System.out.println(str.length());
			
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

}
