package day06sept23_Array;

public class PrintEvenOddNos {

	public static void main(String[] args) {

		int[] a = {2,7,6,9, 10};
		for (int x : a) {
			if (x % 2 == 0)
				System.out.println("EVEN - " + x);
			else
				System.out.println("ODD - " + x);
				
			
		}
		
	}

}
