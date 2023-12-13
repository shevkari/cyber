package day28aug23MethodOverride;

public class vehicle {

	void disp()
	{
		System.out.println("zero argument disp() method in vehicle class");
	}

	public vehicle() {
		
	}
	
	
	vehicle getObject()
	{
		System.out.println();
		return new vehicle();
	}
	
}
