package day13sept23StringMethodPrograms;

public class StringFunctionsDemo {

	public static void main(String[] args) {

		String s1 = "Amol";
		String s2 = "Premraj";
		String s3 = "Vaibhav";

		System.out.println("the length of given String " + s1 + " is : " + s1.length());
		System.out.println("the length of given String " + s2 + " is : " + s2.length());
		System.out.println("the length of given String " + s3 + " is : " + s3.length());

		/*
		 * s1 = null; System.out.println("the length of given String " + s1
		 * +" is : "+s1.length()); // Exception in thread "main"
		 * java.lang.NullPointerException Cannot invoke "String.length()" because "s1" is null
		 */
		System.out.println("---------------------");
		s1 = "";
		System.out.println("the length of given String " + s1 + " is : " + s1.length());
		
		System.out.println("------------------------");
		s1 = " ";
		System.out.println("the length of given String " + s1 + " is : " + s1.length());
		}

}
