package day14sept23String_Methods;

public class SubstringDemo {

	public static void main(String[] args) {

		String s1 = "My name is Rohit";
		
		String SArr = s1.substring(0,3);
		System.out.println(SArr);   // My
		SArr = s1.substring(11);
		System.out.println(SArr);	// Rohit
		SArr = s1.substring(3,7);
		System.out.println(SArr);	  // name
	}

}
