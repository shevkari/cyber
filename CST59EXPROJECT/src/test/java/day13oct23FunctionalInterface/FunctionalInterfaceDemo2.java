package day13oct23FunctionalInterface;

	interface I2	
	{
		void m1();
		void m2();
	}

	

public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) {

		I2 i = new I2() {
			@Override
			public void m1() {
				System.out.println("m1() method implementation by Anonymous class ");
							}
			
			@Override
			public void m2()
				{
				System.out.println("m1() method implementation by Anonymous class ");
				}
			
			};
			
			i.m1();
			i.m2();
		
		
	}

}
