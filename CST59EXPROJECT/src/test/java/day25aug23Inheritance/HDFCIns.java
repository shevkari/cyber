package day25aug23Inheritance;

public class HDFCIns extends HDFC {
	
	protected int SumAssured;
	
	
	public HDFCIns()
	{
		super();
		System.out.println("HDFCIns constructor...");
	}
	
	void displaySumAssured()
	{
		System.out.println("Sum Assured : " + this.SumAssured );
	}

	public static void main(String[] args) {

		HDFCIns HI = new HDFCIns();
		HI.SumAssured=100000;
		HI.displaySumAssured();
		
	}

}
