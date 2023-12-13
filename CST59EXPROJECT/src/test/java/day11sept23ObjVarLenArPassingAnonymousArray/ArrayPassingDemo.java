package day11sept23ObjVarLenArPassingAnonymousArray;

public class ArrayPassingDemo {

	private static int m2(int b) {
		System.out.println("START->inside m1(), b = " + b);
		b = 10;
		System.out.println("END->inside m1(), b = " + b);
		return b;
	}
	
	private static void m1(int b) {
		System.out.println("START->inside m1(), b = " + b);
		b = 20;
		System.out.println("END->inside m1(), b = " + b);
	}
	
	public static void main(String[] args) {
		int a = 15;
		System.out.println("Before calling m1(), a = " + a);
		m1(a);
		System.out.println("After calling m1(), a = " + a);
		int c = m2(a);
		System.out.println("After calling m2(), c = " + c);
		
		
	}

	
}
