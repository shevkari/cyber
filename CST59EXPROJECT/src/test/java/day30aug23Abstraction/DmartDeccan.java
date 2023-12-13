package day30aug23Abstraction;

public class DmartDeccan extends Dmart{

	@Override
	void cashCounter() {

		System.out.println("Override method of abstract parent class");
	}
	
	void purchase()
	{
		System.out.println("purchase items");
	
	}
	
	
	public static void main(String[] args) {
	
		DmartDeccan DD = new DmartDeccan();
		DD.cashCounter();
		DD.purchase();
		DD.Queue();
		
		// up casting/top casting/ polymorphic refernce / polygraphic references
		Dmart D = new DmartDeccan();
		D.cashCounter();
		D.Queue();
		
		
		
	}

}
