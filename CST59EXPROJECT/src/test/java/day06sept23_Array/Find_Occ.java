package day06sept23_Array;

public class Find_Occ {

	public static void main(String[] args) {

		int[] arr = {4,4,4,4,4,4,6,4,4,4};
		int no = 4, occ=0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i] == no)
				occ++;
		}
		System.out.println(no + " has ocurred " + occ + " times");
		
	
	}

}
