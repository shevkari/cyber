package day14sept23String_Methods;

public class StartsAndEndsWithDemo {

	public static void main(String[] args) {

//		 The method startsWith(String) in the type String is not applicable 
//		for the arguments (char)
		
		String s1 = "www.cybersuccess.biz";
		System.out.println(s1.startsWith("w"));
		System.out.println(s1.endsWith("z"));
		System.out.println("------------------");
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.startsWith("s",9));
		
	}

}
