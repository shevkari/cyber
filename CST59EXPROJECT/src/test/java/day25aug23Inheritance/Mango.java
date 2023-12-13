package day25aug23Inheritance;

public class Mango extends Fruits {

	protected String subName;
	protected int price;
	
	
	// Method define in child class only
	public void eat()
	{
		System.out.println("Eat Mango");
	}
	
	
	// Method Overriden
	public void getWeight()
	{
		System.out.println("Mangoes in dozens");
	}
	
	
	
	
	public static void main(String[] args) {

		// upcasting/polygraphic reference/top casting/run time polymorphism 
	     // parent          child
		Fruits fs = new Mango();
		// an object of child - Mango is created of type Fruits	

		
		/*
		 * fr will have access to all parent's members	
		 * fr will have access to  overridden methods from its child class 
		 * fr will not have access to child methods which are solely written for child class
		 */
		System.out.println(fs.Name="abc");
		System.out.println(fs.colour="Red");
		fs.Taste();
		fs.getWeight();
		
		
	}

}
