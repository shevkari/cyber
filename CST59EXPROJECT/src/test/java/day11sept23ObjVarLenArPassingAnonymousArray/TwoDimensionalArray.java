package day11sept23ObjVarLenArPassingAnonymousArray;

public class TwoDimensionalArray {

	private static void m1(int[][] b) {
		
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

		b[0][0]=100;
		b[0][1]=200;
		b[0][2]=300;
		b[1][0]=400;
		b[1][1]=500;
		b[1][2]=600;
		b[2][0]=700;
		b[2][1]=800;
		b[2][2]=900;
		
		
	}

	
	public static void main(String[] args) {

		int [][]a = new int[3][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40; 
		a[1][1]=50;
		a[1][2]=60;
		a[2][0]=70;
		a[2][1]=80;
		a[2][2]=90;
		
		
//		for(int i=0; i<a.length; i++)
//		{
//			for(int j=0; j<a.length; j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		m1(a);
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

	
}
