package test11sept23;

public class PallindromeNumber {

	private static int isPalindrone(int orgNo) {
        int r, sum = 0;
        int n=orgNo;
		while (n!=0)
		{
			r = n % 10;
		sum = sum * 10 + r;
		
		n = n /10;
		}
		//System.out.println(sum);
		
		return sum;
	}

		
	public static void main(String[] args) {

		int pn =1235321;

		//for (int pn=0; pn<1000; pn++)
		//{
		int NO =isPalindrone(pn);
		
		if(NO == pn) 
			System.out.println("Given Number "+ pn +" is Palindrome");
		
		else
			System.out.println("Given Number "+ pn +" is NOT Palindrome");
		}
	//}

}
