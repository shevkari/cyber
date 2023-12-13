package day31aug23AbstractClassInterface;

 
public interface Hospital {
	// public static final - by default
		String HOSPITAL_NAME = "ADITYA BIRLA";
		
		
		         void disp();
		abstract void print();
		
		default  void show()
		{
			System.out.println("default method show() in Hospital interface");
		}
		
		static void getDetails()
		{
			System.out.println("getDetails method is being called");
		}
		
	}