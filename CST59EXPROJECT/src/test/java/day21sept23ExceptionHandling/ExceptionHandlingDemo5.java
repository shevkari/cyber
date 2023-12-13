package day21sept23ExceptionHandling;

public class ExceptionHandlingDemo5 {

	public static void main(String[] args) {

		System.out.println("Program Stars : ");
		int res = 0;
		
		try
		{
			int a=10, b=1;
			res = a/b;
		
		}
		
		finally 		// Cleaning Activity
		{
			System.out.println("Try will complete only when there is catch or finally");
		}
		System.out.println("res : -> " + res);
		System.out.println("Program Ends");
	}

}
