package day25aug23Inheritance;

public class RBI {

	protected float ROI;
	
	protected RBI()
	{
		super();
		System.out.println("RBI Constructor.... ");
	}
	
	void changeROI(float rate)
	{
		System.out.println(this.ROI=rate);
	}
}
