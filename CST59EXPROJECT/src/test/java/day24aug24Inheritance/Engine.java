package day24aug24Inheritance;

public class Engine extends Vehicle {
	// child class/subclass/derived class
	protected int eNo;
	protected int Price;
	
	
	void start()
	{
		System.out.println("Engine Starts");
	}
	
	void stop()
	{
		System.out.println("Engine Stop");
	}
	
	
	protected Engine()
	{
			System.out.println("Engine Construction");
	}
	
	
	
	public int geteNo() {
		return eNo;
	}

	public int getPrice() {
		return Price;
	}

	public static void main(String[] args) {
		Engine E1 = new Engine();
		
		E1.vNo=1234;
		E1.Name="Amol";
		E1.transferVehicle();
		E1.eNo=9999;
		E1.Price=40000;
		System.out.println(E1.getvNo() + " : " + E1.getName() + " : " + E1.geteNo() + " : " + E1.getPrice());
		E1.start();
		E1.stop();
	
		
		Vehicle V1 = new Vehicle();
		V1.vNo=9876;
		V1.Name="Prem";
		System.out.println(V1.getvNo()+" : " + V1.getName());
		V1.transferVehicle();
	}

}

