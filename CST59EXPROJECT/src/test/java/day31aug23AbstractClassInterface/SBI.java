package day31aug23AbstractClassInterface;

public class SBI extends Bank{

	SBI()
	{
		System.out.println("In SBI constructor");
	}
	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		System.out.println(sbi.name);
		//System.out.println(sbi.branch);
		
		// Upcasting
		Bank b = new SBI();
		System.out.println(b.name);

		Bank.branch = "Deccan";
		SBI.branch = "Aundh";
		System.out.println(Bank.branch);
		System.out.println(SBI.branch);
	}
	
}
