package day18aug23;

public class StaticBlockdemo {

	static int age;
	static String name;

	static
	{
	System.out.println("In static block #1");	
	   age = 23;
	}
	
	static
	{
		System.out.println("In static block #2");
		name ="Rohit";
		display();
	}
	
	static void display()
	{
		System.out.println("Display() method is called from #2 static block");
		age = age+10;
	}
	
	public static void main(String[] args) {
		System.out.println("In main mathod");
		System.out.println(age+10);
		
	}

}
