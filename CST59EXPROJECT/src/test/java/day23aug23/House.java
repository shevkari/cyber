package day23aug23;

public class House {

	String name;
	int noOfRooms;
	Bathroom br;
	
	public House(String name, int noOfRooms, Bathroom br)
	{
		this.name=name;
		this.noOfRooms=noOfRooms;
		this.br=br;
		
	}
	
	public String toString()
	{
		return name + " : " + noOfRooms +" : " + br;
	}
	
	public static void main(String[] args) {
		Bathroom B2 = new Bathroom (4,5);
		House H1 = new House("Krupa", 10, B2);
		System.out.println(H1);
	}

}
