package day01sept23_Interface;

public class C4 extends C5 implements I2, I1{

	@Override
	public void changeLocation() {
		System.out.println("C4 - changeLocation()");
	}

	@Override
	public void TransferToDoctor() {
		System.out.println("C4 - TransferToDoctor()");	
	}

	void Claim()
	{
		System.out.println("C4 -Claim() ");
	}
	
	public static void main(String[] args) {
		 
		C4 c4 = new C4();
		c4.Claim();
		c4.changeLocation();
		c4.TransferToDoctor();
		c4.FollowUp();
	}
	
}
