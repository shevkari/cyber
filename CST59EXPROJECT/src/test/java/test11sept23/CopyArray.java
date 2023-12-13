package test11sept23;

public class CopyArray {

	
	private static void coArr(int[] a) {
	
	int [] b = new int[a.length];
	
	//for (int i=0; i<b.length; i++)
	//{
	//	b[i]=a[i];
	//}
	
	b[0]=a[0];
	b[1]=a[1];
	b[2]=a[2];
	b[3]=a[3];
	b[4]=a[4];
	
	for (int x : b) {
		
	System.out.println(x);
	}
		
	}
	
	
	public static void main(String[] args) {
		int [] a = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		coArr(a);
	}

	

	
	
}
