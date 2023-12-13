package day01sept23_Interface;

public class KEM implements Hospital {

	@Override
	public void admitPatient() {
		System.out.println("KEM - admitPatient()");
	}

	@Override
	public void billing() {
		System.out.println("KEM - billing()");
	}

	
	void Cleaning()
	{
		System.out.println("KEM - Cleaning()");
	}
	
	public static void main(String[] args) {
		KEM kem = new KEM();
		System.out.println(Hospital.Hospial_Name);
		kem.admitPatient();
		kem.casulty();
		kem.billing();
		kem.Cleaning();
		Hospital.Salary();
		
		/*
		//up casting / top casting/ run time polymorphism
		// polygraphic ref / polymorphic ref
		
		Hospital SH = new KEM();
		//System.out.println(Hospital.Hospial_Name);
		SH.admitPatient();
		SH.casulty();
		SH.billing();
		*/
	}
}
