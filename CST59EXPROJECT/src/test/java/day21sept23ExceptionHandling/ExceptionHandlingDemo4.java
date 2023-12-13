package day21sept23ExceptionHandling;

public class ExceptionHandlingDemo4 {

	public static void main(String[] args) {
		int res = 0;
		System.out.println("Program Stars : ");
		try {
			System.out.println("In try Block :");
		int a=10, b=0;
		res = a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("In catch block :");
			System.out.println("You are trying to divide by zero ");
			ae.getMessage();
			ae.printStackTrace();
		}
		
		finally {
			System.out.println("Finally block executed every time, it is used to cleaning process ");
		}
		System.out.println("res : -> " + res);
		System.out.println("Program Ends");
	}

}
