package day22sept23ExceptionHandling;


class LowBalanceException extends Exception
{
	
	public String toString()
	{
		return "Insufficient Balance";
	}
	
}


public class ThrowsDemo2 {

	
	public static void main(String[] args) throws Exception{

		int bal = 2000;
		
		if (bal<10000)
		{
			throw new LowBalanceException();
		}
		else
		{
			System.out.println("You can Withdrawl amount : " + (bal-5000));
		}
	}



}
