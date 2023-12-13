package day06sept23_Array;

public class PrintEvenOddNos1 {

	public static void main(String[] args) {

		int[] a = {2,7,6,9, 10};
		
		System.out.println("Below are EVEN nos: ");
		for (int x : a) 
		{
			if ( x%2 == 0)
				System.out.println(x);
		}
		
		System.out.println("Below are ODD nos: ");
		for (int x : a) 
		{
			if ( x % 2 != 0)
				System.out.println(x);
		}
	}

}
