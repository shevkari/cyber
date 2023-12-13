package day25sept23Misc;

public class StringParameterDemo {

	 static void m1(String s)
	 {
		 System.out.println(s);
		 s= "Mumbai";
	 }
	
	static void m2(String str1) {
		System.out.println(str1);
		str1 = "Navlakh Umbre";
		//System.out.println(str1);
		str1 = "dfh";
		
		}
	
	static void m3(StringBuffer sb1)
	{
		System.out.println(sb1);
		sb1.append("Shevkari");
	}
	
	public static void main(String[] args) {
		String str = "Pune";
		m1(str);
		System.out.println(str);
		
	//	String str1 = new String("Talegaon");
	//	m2(str1);
	//	System.out.println(str1);
		
		char[] Carr = {'a','b','c','d'}; 
		String ss = new String(Carr);
		m2(ss);
		System.out.println(ss);	
		
	
		StringBuffer sB = new StringBuffer("AMOL");
	m3(sB);
	System.out.println(sB);
	}

}
