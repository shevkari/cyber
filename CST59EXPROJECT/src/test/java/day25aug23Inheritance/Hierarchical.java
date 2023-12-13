package day25aug23Inheritance;

public class Hierarchical {

	public static void main(String[] args) {

		HDFC hc = new HDFC();
		
		hc.HDFCROI=9.8f;
		hc.ROI=8.0f;
		hc.PrintROI();
		hc.changeROI(8.1f);
		
		
		
		SBI sb = new SBI();
		sb.SBIROI=9.5f;
		sb.ROI=8.0f;
		sb.displayROI();
		sb.changeROI(8.5f);
		
	}

}
