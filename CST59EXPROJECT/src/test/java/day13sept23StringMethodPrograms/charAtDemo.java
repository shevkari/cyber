package day13sept23StringMethodPrograms;

public class charAtDemo {

	public static void main(String[] args) {

		String s1 = "CYBER SUCCESS";
		System.out.println("s1 length :"+s1.length());
		
		System.out.println(s1.charAt(6)); //S
		
		/* System.out.println(s1.charAt(14)); // Exception in thread "main"
		 * java.lang.StringIndexOutOfBoundsException: Index 14 out of bounds for length 13
		 */
		
	//	System.out.println(s1.charAt(-1)); // java.lang.StringIndexOutOfBoundsException
		
	//	s1 = null;
	//	System.out.println(s1.charAt(0)); // java.lang.NullPointerException
		
		for (int i=s1.length()-1; i>=0; i--)
		{
			System.out.print(s1.charAt(i) + " ");
			
		}
		
		String s2 = new String ("12345");
		System.out.print("Length of String \"\n" + s2+ " : " + s2.length());
		System.out.println("\n"+s2.charAt(3));
		
		System.out.println("-----------------");
		s2 = "1234567890-=!@#$%^&*()_+";
		System.out.print("Length of String \"\n" + s2+ " : " + s2.length());
		System.out.println("\n"+s2.charAt(13));
	}

}
