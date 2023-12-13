package day11sept23ObjVarLenArPassingAnonymousArray;

public class Car {

	int Price;
	String Name;
	
	public Car(int Price, String Name)
	{
		this.Price=Price;
		this.Name=Name;
	}
	
	public void setPrice(int Price) {
		this.Price=Price;
	}
	
	public int getPrice() {
		return Price;
	}
	
	public void setName(String Name) {
		this.Name=Name;
	}
	
	
	public String getName() {
		return Name;
	}
	
	
	public String toString() {
		return Price + " : "+ Name;
	}
}
