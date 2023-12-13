package day07sept23;

public class ArrayDefinitions {

	public static void main(String[] args) {

		int  [][]a = new int[3][4];
		a[1][2] = 12;
		System.out.println(a[1][2]);

		
		int[][]b=new int[2][2];
		b[1][1] = 13;
		System.out.println(b[1][1]);
		
		int  []  []  c = new int[2][2];
		c[1][1] = 14;
		System.out.println(c[1][1]);
		
		int[]d[] = new int[2][2];
		d[1][1] = 15;
		System.out.println(d[1][1]);
		
		int[]e[], f[] = new int[2][2];
		e = new int[2][2];
		e[1][1] = 16;
		f[1][1] = 17;
		System.out.println(e[1][1] + " : " + f[1][1]);
		//int qq, cc=10;
		
		int [][]g, h[];
		g = new int[2][2];
		h = new int[2][2][2];   // 3 D
		
		
//		int [][]i, []j;  compilation error	
		
		
		int [][]k = new int[0][0];
		System.out.println(k);  // [[I@4517d9a3
//		k[0][0] = 18;   // ArrayIndexOutOfBoundsException 
//		System.out.println(k[0][0]);
		
		int[][] l = new int[2][];   // jagged array
		l[0] = new int[3];
		l[1] = new int[2];
		l[0][0] = 1;
		l[0][1] = 2;
		l[0][2] = 3;
		l[1][0] = 4;
		l[1][1] = 5;
		System.out.println("----------------");
		for(int r=0;r<l.length;r++)
		{
			for(int col=0;col<l[0].length;col++)
				System.out.print(l[r][col] + "\t");
			System.out.println();
		}
		
		
	}

}
