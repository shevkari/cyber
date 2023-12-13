package day23aug23;

public class Engine {

	int noOfCylinder;
	String fuelType;
	int rpm;
	
	public Engine(int noOfCylinder, String fuelType, int rpm)
	{
		this.noOfCylinder=noOfCylinder;
		this.fuelType=fuelType;
		this.rpm=rpm;
	}
	
	public String toString()
	{
		return noOfCylinder + " : " + fuelType + " : " + rpm ; 
	}
	
	public static void main(String[] args) {

		Engine E1 = new Engine(6,"Petrol",1200);
		System.out.println(E1);
		
	}

}
