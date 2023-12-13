package day01sept23_Interface;

public interface Hospital {

	final String Hospial_Name = "KEM";
	
	void admitPatient();
	public abstract void billing();
	
	default void casulty() {
		System.out.println("Hospital - casulty()");
	}
		
		static void Salary() {
			System.out.println("Hospital - salary()");
			Bonus();
		}
	
		private static void Bonus()
		{
			System.out.println("Hospital - Bonus()");
		}
		
		
}
