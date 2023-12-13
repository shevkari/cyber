package day24aug24Inheritance;

public class Vehicle {
	
	protected int vNo;
	protected String Name;
	
	protected void transferVehicle()
	{
		System.out.println("Vehicle Transferred");
	}
	
		
	public int getvNo() {
		return vNo;
	}

	public String getName() {
		return Name;
	}



	protected Vehicle()
	{
		
		System.out.println("Vehicle Construction");
	}

}
