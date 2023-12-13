package day12sept23_String;

public class StringDemo {

	public static void main(String[] args) {

		// String has been created using literal way 
		
		String str = "Virat";
		
		System.out.println(str);
		System.out.println(str.hashCode());
		String str1 = "Rohit";
		String str2 = "Virat";
		String str3 = "Sachin";
		String str4 = "Virat";
		str = "Kapil";
		System.out.println(str1);
		System.out.println(str1.hashCode());
		System.out.println(str2);
		System.out.println(str2.hashCode());
		System.out.println(str3);
		System.out.println(str3.hashCode());
		System.out.println(str4);
		System.out.println(str4.hashCode());
		System.out.println(str);
		System.out.println(str.hashCode());
		
		System.out.println("----------------------------------------");
		// String is defined using new operator 
		
		String st = new String("Jasprit");
		System.out.println(st);
		System.out.println(st.hashCode());
		System.out.println("System.identityHashCode(st): " + System.identityHashCode(st));
		String st1 = new String("Kuldeep");
		String st2 = new String("Umesh");
		st = ("raj");
		System.out.println(st);
		System.out.println(st.hashCode());
		System.out.println("System.identityHashCode(st): " + System.identityHashCode(st));
		System.out.println(st1);
		System.out.println(st1.hashCode());
		System.out.println("System.identityHashCode(st1): " + System.identityHashCode(st1));
		System.out.println(st2);
		System.out.println(st2.hashCode());
		System.out.println("System.identityHashCode(st2): " + System.identityHashCode(st2));
		
		
		System.out.println("----------------------------------------");
		// String is defined using char Array char[] 
		
		char [] ch = {'A','M','O','L'};
		String s1 = new String(ch);
		System.out.println(s1);
		System.out.println("s1.hashCode(): " + s1.hashCode());
		System.out.println("System.identityHashCode(s1): " + System.identityHashCode(s1));
		
		
		char [] ch1 = {'1','2','3','4'};
		String s2 = new String(ch1);
		System.out.println(s2);
		System.out.println("s2.hashCode(): " + s2.hashCode());
		System.out.println("System.identityHashCode(s2): " + System.identityHashCode(s2));
		
		
		char [] ch2 =  {'A','M','O','L'};
		String s3 = new String(ch2);
		System.out.println(s3);
		System.out.println("s3.hashCode(): " + s3.hashCode());
		System.out.println("System.identityHashCode(s3): " + System.identityHashCode(s3));
		
		String aa = "1,2,3,4,5";
		String sttt = new String(aa);
		System.out.println(sttt);
		
	}

}
