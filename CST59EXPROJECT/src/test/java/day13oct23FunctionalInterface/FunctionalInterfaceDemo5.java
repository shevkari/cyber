package day13oct23FunctionalInterface;

	interface I5	
	{
		void m1(int a, int b);
	}

	

public class FunctionalInterfaceDemo5 {

	public static void main(String[] args) {

		I5 i = (int m, int n)->
			{System.out.println("m1() implementation using lambda Expression : "+ m*n);};
		
		// Or we reduce it also
		
		I5 i1 = (int m, int n)-> System.out.println("m1() implementation using lambda Expression : " + (m+n));;
		
		i.m1(5,10);
		i1.m1(10,20);
	}

}
