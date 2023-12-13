package day01sept23_Interface;

public class C2 implements I3{

	@Override
	public void changeLocation() {
		
	}

	@Override
	public void Dischare() {
		
	}

	public void BillPaid()
	{
		System.out.println("C2 - Bill paid()");
	}
	
	public static void main(String[] args) {
		C2 c2 = new C2();
		c2.changeLocation();
		c2.Dischare();
		c2.BillPaid();
	}
}
