package day13sept23StringMethodPrograms;

public class PallindromeusingMethod {

	private static boolean isPalindrome(String str) {
		String revStr = "";
		boolean result = true;
		int i=str.length()-1;
		while(i>=0)
		{
		//for (int i=str.length()-1; i>=0; i--)
		
			revStr = revStr + str.charAt(i);
			i--;
		}
		if(str.equals(revStr))
			result = true;
		else
			result= false;
		
		return result;
		
	}
	
	public static void main(String[] args) {

		String s1 = "NITIN";
		s1 = "appa";
		boolean pallindrome = isPalindrome(s1);
		
		if(pallindrome)
			System.out.println("Given String "+s1 + "  is Palindrome");
		else
			System.out.println("Given String "+s1 + "  is NOT Palindrome");
		
	}

}
