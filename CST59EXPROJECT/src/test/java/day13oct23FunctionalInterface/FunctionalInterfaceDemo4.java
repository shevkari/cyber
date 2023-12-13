package day13oct23FunctionalInterface;

	interface I4	
	{
		void m1(int a);
	}

	

public class FunctionalInterfaceDemo4 {

	public static void main(String[] args) {

		I4 i = (int n)->
			{System.out.println("m1() implementation using lambda Expression : "+ n*n);};
		
		// Or we reduce it also
		
		I4 i1 = (int n)-> System.out.println("m1() implementation using lambda Expression : " + n*n);;
		
		i.m1(5);
		i1.m1(10);
	}

}
