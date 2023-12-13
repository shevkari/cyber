package day31aug23AbstractClassInterface;


public class KEM implements Hospital{

	@Override
	public void disp() {
		System.out.println("disp() method implemented in KEM hospital"); 
		
	}

	@Override
	public void print() {
		System.out.println("print() method implemented in KEM hospital"); 
	}
	
	

	public static void main(String[] args) {
		
		KEM kem = new KEM();
		kem.disp();
		kem.print();
		kem.show();
		Hospital.getDetails();
		
		// static methods defined in interface for a class is not accessible 
		
		System.out.println(Hospital.HOSPITAL_NAME);
		
	}
	
}
	
	
	
	
	
	
	