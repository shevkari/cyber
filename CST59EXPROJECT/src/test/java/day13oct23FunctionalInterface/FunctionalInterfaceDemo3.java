package day13oct23FunctionalInterface;

	interface I3	
	{
		void m1();
	}

	

public class FunctionalInterfaceDemo3 {

	public static void main(String[] args) {

		I3 i = ()->{
			System.out.println("m1() implementation using lambda Expression");
		};
		
		// Or we reduce it also
		
		I3 i1 = ()-> System.out.println("m1() implementation using lambda Expression");
		
		i.m1();
		i1.m1();
	}

}
