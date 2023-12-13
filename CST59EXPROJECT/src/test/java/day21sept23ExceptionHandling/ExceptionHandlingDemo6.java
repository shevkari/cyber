package day21sept23ExceptionHandling;

public class ExceptionHandlingDemo6 {

	public static void main(String[] args) {

		int res=0;
		
		try {
			
		/*	int a = 10, b=1;
			res = a / b;
			System.out.println(res);
			
			String str = null;
			System.out.println(str.length());
			
			int[] arr = {1,2,3,4,5};
			System.out.println(arr[11]);
			*/
			String st1 = "Pune";
			System.out.println(st1.charAt(4));
		}
		
	//	catch(Exception e)
	//	{
	//		System.out.println("This block has to be at the end of all catch block, not allowed first or middle : ");
	//	}
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
		
		catch(Exception e)
			{
				System.out.println("This block has to be at the end of all catch block, not allowed first or middle : ");
			}
		System.out.println("res :-> " + res);
	}

}
