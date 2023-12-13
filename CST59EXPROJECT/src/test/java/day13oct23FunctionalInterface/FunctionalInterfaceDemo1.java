package day13oct23FunctionalInterface;

	interface I1	
	{
		void m1();
	}

	class A implements I1
	{
		@Override
		public void m1()
		{
			System.out.println("m1() implement in class A");
		}
	}

public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {

		A a = new A();
		a.m1();
		
		I1 i = new A();
		i.m1();
		
		
	}

}
