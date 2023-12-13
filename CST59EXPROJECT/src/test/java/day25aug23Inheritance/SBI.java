package day25aug23Inheritance;

public class SBI extends RBI {

	protected float SBIROI;
	
	protected SBI() {
		super();
		System.out.println("SBI constructor....");
	}
	
	void displayROI()
	{
		System.out.println("SBI ROI : " + this.SBIROI);
	}
	
}
