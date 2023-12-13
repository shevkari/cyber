package day11sept23ObjVarLenArPassingAnonymousArray;

public class VariableArrayPassing {

	private static void add(int... a) {
		int sum = 0;
		for (int x : a) {
		 sum = sum + x;
		}
		System.out.println("Sum of elements in given array :  "+sum);
	}
	
	public static void main(String[] args) {

		int [] a = {1,2};
		add(a);
		add(new int[]{1,2,3});
		
	}

	

}
