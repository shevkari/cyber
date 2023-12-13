package classProg_day05sept23;

import java.util.Scanner;

public class Fib {
	


		public static int fibonacci(int n1) {
		  int n=n1;
			//  if (n <= 1) {
		    //    return n;
		   // }
		    int fib = 0;
		    int nextFib = 1;
		    int temp = 0;
		    for (int i = 1; i < n; i++) {
		        temp = fib;
		        fib = fib+ nextFib;
		        nextFib = temp;
		    }
		    return fib;
		}
		    	public static void main(String[] args) {
		    	    Scanner scanner = new Scanner(System.in);
		    	    System.out.print("Enter the index of the Fibonacci number: ");
		    	    int n = scanner.nextInt();
		    	    scanner.close();
		    	    System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
		    	}

		        
		    

}
