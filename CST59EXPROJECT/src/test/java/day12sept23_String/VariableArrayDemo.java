package day12sept23_String;


public class VariableArrayDemo {

	// The variable argument type int of the method disp must be the 
	// last parameter
	
	private static void m1(int b, int... a) {
		System.out.println("Single Variable : " +b);
		System.out.println("Array Elements : ");
		for (int i : a) {
			
			System.out.print(i+" ");
}
		
	}

	
	public static void main(String[] args) {

		int [] a = {1,2,3,4};
		m1(10,a);
		
	}

	

}
