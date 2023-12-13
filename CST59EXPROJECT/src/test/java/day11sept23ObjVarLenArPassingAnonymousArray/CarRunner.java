package day11sept23ObjVarLenArPassingAnonymousArray;

public class CarRunner {

	private static void m1(Car e) {
		
		e.setPrice(20000);
		e.setName("Audi");
		
	}
	
	public static void main(String[] args) {

		Car c = new Car(10000,"BMW");
		System.out.println(c);
		
		m1(c); // non-Primitive data type - call by reference
		
		System.out.println(c);
		
	}

	

}
