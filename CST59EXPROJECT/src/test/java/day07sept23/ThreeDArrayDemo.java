package day07sept23;

public class ThreeDArrayDemo {

	public static void main(String[] args) {

		int[] q = {1,2,3};
				
	    int[][] w = {
	    		{},
	    		{},
	    		{}
	    };
	    
		int[][][] a = {
				{  // row 0
					{1,2,3},  // subrow0
					{4,5,6}   // subrow1
				},
				{  // row 1
					{7,8,9},   // subrow0
					{10,11,12} // subrow1
				}
				
					};
		System.out.println("row    : " + a.length);
		System.out.println("subrow : " + a[0].length);
		System.out.println("col    : " + a[0][0].length);

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
					System.out.print(a[i][j][k] + "\t");
				System.out.println();	
			}
			System.out.println();
		}
		
		
		
	}

}
