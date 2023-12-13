package day07sept23;

public class Addition2DArray {

	public static void main(String[] args) {

		int[][] a = {
				{1,2,3},
				{4,5,6} 
		};
		int[][] b = {
				{10,11,12},
				{13,14,15}
		};
		System.out.println("a.length : " + a.length);
		System.out.println("a[0].length : " + a[0].length);
		System.out.println("a[1].length : " + a[1].length);

		System.out.println();
		System.out.println("b.length : " + b.length);
		System.out.println("b[0].length : " + b[0].length);
		System.out.println("b[1].length : " + b[1].length);
		
		int[][] res =  new int[a.length][a[0].length];
//		System.out.println(res);     //[[I@4517d9a3
		
		for(int r=0;r<a.length;r++)
			for(int c=0;c<a[0].length;c++)
				res[r][c] = a[r][c] + b[r][c];

		System.out.println("result ->");
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[0].length;c++)
				System.out.print(res[r][c] + "\t");
			System.out.println();
		}
		
		
		
	}

}
