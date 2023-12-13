package day25aug23Inheritance;

public class HDFC extends RBI{

	
		protected float HDFCROI;
		
		public HDFC()
		{ 
			super();
			System.out.println("HDFC constructor...");
		}
		
		public void PrintROI()
		{
			System.out.println("HDFC ROI : " + this.HDFCROI);
		}
		
		
		

}
