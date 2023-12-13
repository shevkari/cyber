package day07sept23;

public class TwoDArrayDemo {

	public static void main(String[] args) {

		int[][] arr = new int[3][2];
		// row # 1
		arr[0][0] = 10;
		arr[0][1] = 20;
	 
		// row # 2
		arr[1][0] = 30;
		arr[1][1] = 40;
		
		// row # 3
		arr[2][0] = 50;
		arr[2][1] = 60;
		
		System.out.println("Row length : " + arr.length); //3
		System.out.println("Col length : " + arr[0].length); //2
		System.out.println("Col length : " + arr[1].length); //2
		System.out.println("Col length : " + arr[2].length); //2
		
		for(int r=0;r<arr.length;r++)   // row iteration
		{
			for(int c=0;c<arr[0].length;c++)
				System.out.print(arr[r][c] + " ");
			System.out.println();
		}
		
	}

}
