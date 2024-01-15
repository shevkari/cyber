package day18aug23;

public class MainOverloading {

	
	public static void main(String args)
	{
		System.out.println("In Overloaded main method -> "+ args);
	}
	
//	public static void main(Integer args)
//	{
//		System.out.println("In Overloaded main method -> "+ args);
//	}
//	
	
	public static void main(String[] args) {

		System.out.println("In main method");
		main("rohit");
	//	main(999);
	}

}
