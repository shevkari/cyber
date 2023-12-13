package day04sept23_Array;

public class C1 implements I1,I2 {

	public void m1()
	{
		System.out.println("I Am in C1 Class");
	}
	
	
	public static void main(String[] args) {

		C1 c = new C1(); 
		c.m1();
		
		I1 i1 = new C1();
		i1.m1();
		
		I2 i2 = new C1();
		i2.m1();
	}

}
