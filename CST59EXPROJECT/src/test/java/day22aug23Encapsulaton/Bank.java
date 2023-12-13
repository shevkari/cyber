package day22aug23Encapsulaton;

public class Bank {

	String bankName;
	String banktype;
	String city;
	int balance;
	
	void changeAddress()
	{
		System.out.println("Changing bank address");
	}
	
	
	
	@Override
	public String toString() {
		return bankName + " : " + banktype + " : " +  city + " : " + balance;
		
					}



	public static void main(String[] args) {
		Bank B1 = new Bank();
		B1.balance  = 10000000;
		B1.bankName = "City";
		B1.banktype = "Private";
		B1.city     = "Pune";
		
		System.out.println(B1.toString());
		
		Bank B2 = new Bank();
		B2.balance  = 2000000;
		B2.bankName = "HDFC";
		B2.banktype = "Private";
		B2.city     = "Talegaon";
		
		System.out.println(B2);
		
	}

}
