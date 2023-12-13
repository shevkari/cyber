package day06sept23_Array;

public class ArrayMaxMin {

	public static void main(String[] args) {

		int[] arr = {211,12,3,999,9,500,999};
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		 
	}

}
