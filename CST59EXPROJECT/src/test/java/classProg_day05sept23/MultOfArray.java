package classProg_day05sept23;

public class MultOfArray {

	public static void main(String[] args) {

		
		int[][] a = {
				{1,2,3},
				{4,5,6}
		};
		int[][] b = {
				{10,11,12},
				{13,14,15}
		};
		
		int[][] c =  new int[a.length][b.length];
		
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
		
				c [i][j]  = a[i][j] * b[i][j] ;
			}
		}
		
		System.out.println("result ->");
		for(int r=0;r<a.length;r++)
		{
			for(int d=0;d<a[0].length;d ++)
				System.out.print(c[r][d] + "\t");
			System.out.println();
		}
	}

}
