package day01sept23_Interface;

public class C1 implements I1, I2{

	@Override
	public void TransferToDoctor() {
		System.out.println("C1 - TransferToDoctor()");
	}

	@Override
	public void changeLocation() {
		System.out.println("C1 - changeLocation()");
	}

	void makeBill()
	{
		System.out.println("C1 - makeBill()");
	}

	public static void main(String[] args) {
		C1 c = new C1();
		c.changeLocation();
		c.TransferToDoctor();
		c.makeBill();
		
		I1 i1 = new C1();
		i1.changeLocation();
		
		I2 i2 = new C1();
		i2.TransferToDoctor();
	}
	
}
