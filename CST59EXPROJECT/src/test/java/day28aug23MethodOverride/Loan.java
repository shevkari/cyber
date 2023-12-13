package day28aug23MethodOverride;


public class Loan {
	int intRate;
	int principle;
	
	Loan()
	{
		System.out.println("Default constructor Loan() is being called...");
	}
	
	Loan(int intRate, int principle)
	{
		System.out.println("2 parameterized constructor Loan(int, int) is being called...");
		System.out.println("intRate = " + (this.intRate = intRate) + " : " +  "principle = " +(this.principle = principle));
	
	}
	
		
}
