package Mock;

public class Palindrome {

	public static void main(String[] args) {

		String str = "NITIN";
		String starArr="";
		for(int i= str.length()-1; i>=0; i-- )
		{
			starArr = starArr + str.charAt(i);
			
		}
		
		System.out.println(starArr);
		if(str.equals(starArr))
		{
			System.out.println("Palindrome");
		}
			
	}

}
