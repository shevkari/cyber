package day18aug23;

public class Vehicle {

	int VehicleNo;
	static String Name;
	
	void disp()
	{
		System.out.println(VehicleNo);
		System.out.println(Name);
		print();
		show();
	}
	
	static void show()
	{
		// static method can access only static variables/methods
		// Cannot make a static reference to the non-static field vehicleNo
//		System.out.println(VehicleNo);	//static method can access only static variables/methods
		System.out.println(Name);
		//not allowed ->	disp(); 	// non-static method calling not allowed
	}
	
	void print()
	{
		show();	// non-static method can call static method
	}
	
	
	public static void main(String[] args) {

		// can I directly make use of non static variables?
	    // No, we need to create an object of a class to refer non static variable/instance variable
	
		Vehicle v = new Vehicle();
		System.out.println("v.vehicleNo: " + v.VehicleNo);
				
//		System.out.println(VehicleNo);	// Not allowed to call directly to non-static or instance 
										//	variable. We have to used object of class i.e v.VehicleNo 
		
		
		System.out.println(Vehicle.Name); // this will work in all classes including current class
		System.out.println(Name); // this will only work in this class but not in other classes
		
	}

}
