package Mock;

public class MethodOverloadingDemo {

	public static void add(int a, int b)
	{
		System.out.println("Addition of two int :" + (a+b));
	}
	
	public static void add(int a, int b, int c)
	{
		System.out.println("Addition of three int :" + (a+b+c));
	}
	
	public static void add(float a, int b)
	{
		System.out.println("Addition of float & int  :" + (a+b));
	}
	
	public static void main(String[] args) {

		add(19,28);
		add(1,35,56);
		add(34.45f,55);
		
	}

}
