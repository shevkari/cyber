package day06sept23_Array;

public class SumArray {

	public static void main(String[] args) {

		int[] arr = new int[] {21,12,3,2,9,50};
		
		float sum = 0.0f;
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of array elements are : "+sum);
		System.out.println("Average of array elements are :  "+ (sum/arr.length));
	}

}
