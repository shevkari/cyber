package day28aug23MethodOverride;

public class Car extends vehicle {

	void disp()
	{
		System.out.println("zero argument disp() method in Car class");
	}
	
	public Car() {
		super();
	}
	
	
	public static void main(String[] args) {
		
		Car C = new Car();
		C.disp();
		C.getObject();
		vehicle vc = new Car();
		vc.disp();
		
	}

	
	
	
}
