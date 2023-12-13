package day13sept23StringMethodPrograms;

public class StringFunctionsMisc {

	public static void main(String[] args) {

		String s1  = "https://www.cybersuccess.biz/";
		System.out.println("length of String "+s1 +" is : "+s1.length());
		System.out.println("String in upper Case : " +s1.toUpperCase());
		
		s1 = s1.toUpperCase();
		System.out.println(s1.toLowerCase());
		
	String s2 = null;
	String s3 = null;
	
	if(s2==s3)
		System.out.println(s2 == s3);
	else
		System.out.println(s2 != s3);
	
	
		
	/*
	 * if(s2.equals(s3)) // " java.lang.NullPointerException: System.out.println(s2
	 * == s3); else System.out.println(s2 != s3);
	 */	}

}
