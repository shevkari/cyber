package day24aug24Inheritance;

public class Child extends Parent {

	Child()
	{
		// super();
		super("XYZ");
		System.out.println("Child Condtruction is called");
	}
	
	
	public static void main(String[] args) {

		Child Ch = new Child();
		
	}

}
