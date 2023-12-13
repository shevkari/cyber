package day31aug23AbstractClassInterface;

public abstract class Bank {
	// IV
	protected String name;
	static String branch;
	// constructor
	Bank()
	{
		System.out.println("In Bank constructor");
		name = "SBI";
		//branch = "talegaon";
	}
	
}