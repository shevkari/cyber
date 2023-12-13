package day23aug23;

public class Vehicle {

	String vehicleNo;
	String ownerName;
	boolean isElectric;
	Engine e;
	
	public Vehicle(String vehicleNo, String ownerName, boolean isElectric, Engine e)
	{
		this.vehicleNo=vehicleNo;
		this.ownerName=ownerName;
		this.isElectric=isElectric;
		this.e=e;
	}
	
	public String toString()
	{
		return vehicleNo + " : " + ownerName + " : " + isElectric + " : " + e ; 
	}
	
	public static void main(String[] args) {
		
		Engine E2 = new Engine(4,"petrol",1000);
		Vehicle V1 = new Vehicle("MH 14 GM 1866", "Amol Shevkari", false , E2);
		System.out.println(V1);
	}

}
