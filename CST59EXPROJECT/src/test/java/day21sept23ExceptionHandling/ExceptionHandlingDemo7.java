package day21sept23ExceptionHandling;

public class ExceptionHandlingDemo7 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int res=0;
		
		try {
			
			try
			{
			int a = 10, b=0;
			res = a / b;
			System.out.println(res);
			}
			catch(ArithmeticException e)
			{
			System.out.println("divide by zero! "); 
			e.getMessage();
			e.printStackTrace();
			}
			
			try
			{
			String str = null;
			System.out.println(str.length());
			}
			catch(NullPointerException npe)
			{
				System.out.println("You are trying to get length of null String...");
				npe.getMessage();
				npe.printStackTrace();
			}
			
			
			try
			{
			int[] arr = {1,2,3,4,5};
			System.out.println(arr[11]);
			}
			
			catch(ArrayIndexOutOfBoundsException ao)
			{
				System.out.println("You are trying to print value of more than length value");
				ao.getMessage();
				ao.printStackTrace();
			}
			
			
			String st1 = "Pune";
			System.out.println(st1.charAt(4));
		
		
		}
		
		
		catch(Exception e)
			{
			System.out.println("Outer try :");
			e.getMessage();
			e.printStackTrace();
			}
		
		System.out.println("res :-> " + res);
		System.out.println("Program ends");
	}

}
