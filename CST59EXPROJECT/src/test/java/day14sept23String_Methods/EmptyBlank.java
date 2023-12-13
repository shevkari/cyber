package day14sept23String_Methods;

public class EmptyBlank {

	public static void main(String[] args) {

		String s = "";
		System.out.println(s.isEmpty()); // true
		System.out.println(s.isBlank()); // true
		
		
		String s1 = " ";
		System.out.println(s1.isEmpty()); // false - space is considered as Character
		System.out.println(s1.isBlank()); // true - blank space/ space does't considered
		
		System.out.println("======================");
		
		String s2 = "   Cyber Success   ";
		System.out.println(s2.trim()); // trim function removes leading & trailing spaces
		
		
		System.out.println("======================");

		String s4 = "cyber"; // 99121
		String s5 = "Cyber"; // 67121
		if (s4.equalsIgnoreCase(s5)) // this function checks content of both strings without considering case
			System.out.println("s4 == s5");
		else
			System.out.println("s4 != s5");
				
		
	}

}
