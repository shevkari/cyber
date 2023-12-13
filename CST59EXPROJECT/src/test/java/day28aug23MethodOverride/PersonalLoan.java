package day28aug23MethodOverride;

public class PersonalLoan extends Loan{
	int PIntRate;
	
	PersonalLoan()
	{
		super.intRate = 12;
		
		System.out.println("default constructor PersonalLoan() is being called");
	}
	
	PersonalLoan(int pIntRate)
	{
		super(pIntRate, 100000);
		System.out.println("1 parameterrized constructor PersonalLoan(int) is being called");
		System.out.println("PLintersest = " + (this.PIntRate = pIntRate));
	}
	
	public static void main(String[] args) {
		
		PersonalLoan pl = new PersonalLoan();
		System.out.println(pl.PIntRate=15);
		
		PersonalLoan pl1 = new PersonalLoan(14);
		//System.out.println(pl1.intRate=11);
		
	}
	
}
