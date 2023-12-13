package day21sept23ExceptionHandling;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {

		int a=10, b=0;
		int res = 0;
		System.out.println("Program Stars : ");
		res = a / b; // Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println("res : -> " + res);
		System.out.println("Program Ends");
	}

}
