package day13sept23StringMethodPrograms;

public class ReverseStringPrinting {

	public static void main(String[] args) {

		String s1 = "Rohit Sharma";
		int c = s1.length();
		System.out.println("Length of String : " + c);
		
		for (int i= s1.length()-1; i>=0; i--)
			System.out.print(s1.charAt(i) +" ");
		
		System.out.println("\n"+"----------------");
		s1 = "Sachin Tendulkar";
		System.out.println(s1);
		String revStr = "";
		for(int i=s1.length()-1; i>=0; i--)
		{
			revStr = revStr + s1.charAt(i);
			
		}
		System.out.println("\n" +"Reverse String is : "+revStr);
		
		System.out.println("Length of reverse String : "+ revStr.length());
	}

}
