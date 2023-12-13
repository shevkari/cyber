package day06sept23_Array;

public class ArrayDesc {

	public static void main(String[] args) {

		int[] arr = {21,4,2,3,67,78};
//		int[] arr = {21,21,21,21,21,21};
		
		int temp;
		for(int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++ )
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
				  arr[i] = arr [j];
				 arr [j] = temp;
				}
		}
		
	}

//	for (int i=0; i<arr.length; i++)
//	{
//		System.out.println(arr[i]);
//	}
	
	for (int i : arr) {
		System.out.println(i);
		
	}
}
}