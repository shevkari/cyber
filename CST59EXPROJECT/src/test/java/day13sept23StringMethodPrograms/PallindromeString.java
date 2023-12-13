package day13sept23StringMethodPrograms;

public class PallindromeString {

	public static void main(String[] args) {

		String s1 = "NITIN";
		
		System.out.println(s1.length());
		System.out.println();
		System.out.println(s1.charAt(3));
		System.out.println();
	
		String revStr="";
		for(int i=s1.length()-1; i>=0; i--)
			revStr = revStr + s1.charAt(i);
			System.out.print(revStr);
		System.out.println();
		
		System.out.println();
		
		if(s1.equals(revStr)) 
			System.out.println(s1 +"  is palindrome String");
		else
			System.out.println(s1 +"  is Not a palindrome String");
	}

}
