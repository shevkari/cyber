package day11sept23ObjVarLenArPassingAnonymousArray;

public class ArrayPassingDemo1 {

	// parameter passed by value - default 
	// parameter passed by reference 
	
	private static void m1(int[] b) {
		b[0]=100;
		b[1]=200;
		b[2]=300;
		b[3]=400;
	}
	
	public static void main(String[] args) {
		int [] a = {1,2,3,4};
				System.out.println("Before calling method m1 : ");
				for (int x : a) {
					System.out.println(x);
				}
		
		m1(a);
		
			System.out.println("After calling method m1 : ");
			for (int x : a) {
				System.out.println(x);
		}
	}
}
