package day11oct23ArraysPriorityQueueStack;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		int[] arr = {1,49,5,6,78,97,4,3,7,43};
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(arr).length());
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0; i<arr.length;i++)
			arr[i] = arr[i] *-1;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i=0; i<arr.length; i++) {
			arr[i] = arr[i] * -1;
		}

		System.out.println(Arrays.toString(arr));
		
		
		Arrays.binarySearch(arr,49);
	}

}
