package day13oct23FunctionalInterface;

	interface I6	
	{
		void m1(String fName , String lName);
	}

	

public class FunctionalInterfaceDemo6 {

	public static void main(String[] args) {

		I6 i = (String m, String n)->
			{System.out.println("m1() implementation using lambda Expression : "+ m +"- " +m.length()+ " : " + n + "- " + n.length());};
		
		// Or we reduce it also
		
		I6 i1 = (String m, String n)-> System.out.println("m1() implementation using lambda Expression : " + m+n);;
		
		i.m1("Rohit", "Sharma");
		i1.m1("Virat ","Kohli");
	}

}
