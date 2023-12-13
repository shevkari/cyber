package day18aug23;

public class Car {
 
	
	int a =10;
	static int age =20;
	
	public static void main(String[] args) {
		System.out.println(Car.age); // Allowed because age is static / class variable.
	//	System.out.println(Car.a);	// Not allowed 
	}
}
