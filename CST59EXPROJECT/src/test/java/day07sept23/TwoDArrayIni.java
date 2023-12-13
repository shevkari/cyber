package day07sept23;

public class TwoDArrayIni {

	public static void main(String[] args) {

		int[][]  arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
		System.out.println(arr.length);
		System.out.println(arr[0].length + " : "+ arr[1].length +" : "+ arr[2].length + " : "+ arr[3].length);
		System.out.println();
		// control+shift+F : format the code in eclipse 
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			//	System.out.print(arr[r][c] + "\t");
				System.out.printf("%-4d",arr[r][c]);
		    System.out.println();
	     }    
	}

}
