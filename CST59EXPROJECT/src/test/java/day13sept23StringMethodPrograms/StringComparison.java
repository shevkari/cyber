package day13sept23StringMethodPrograms;

public class StringComparison {

	public static void main(String[] args) {

		String s1 ="Amol";
		String s2 = "Amol";
		
		if(s1==s2)
			System.out.println(s1 +" Equals " +s2);
		
		else 
			System.out.println(s1 +" Not Equals " +s2);
		
		
		if(s1.equals(s2))
			System.out.println(s1+ " equals " + s2);
		else
			System.out.println(s1+ " Not equals " + s2);
		
		System.out.println("-------------------------------");
		String s3 = new String ("Premraj");
		String s4 = new String ("Akash");
		
		if(s3==s4)
			System.out.println(s3 +" Equals " +s4);
		
		else 
			System.out.println(s3 +" Not Equals " +s4);
		
		
		if(s3.equals(s4))
			System.out.println(s3+ " equals " + s4);
		else
			System.out.println(s3+ " Not equals " + s4);
		
		
		
		
		
	}

}
