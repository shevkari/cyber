package day13oct23FunctionalInterface;

	interface I7	
	{
		public int getLength(String Name);
	}

	

public class FunctionalInterfaceDemo7 {

	public static void main(String[] args) {

		I7 i1 = str-> str.length();
		System.out.println(i1.getLength("Rohit"));
		
		I7 i2 = str-> {return str.length();};
		System.out.println(i2.getLength("Rohit Sharma"));
		
		I7 i3 = (str) -> {return str.length();};
		System.out.println(i3.getLength("Viart Kohli"));
		
	}

}
