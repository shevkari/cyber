package text16oct23;

public class Oops {

	int age;
	static String Name;
	
	public Oops()
	{
		System.out.println("in Zero parameterized Constructor");

	}
	
	public Oops(int age)
	{
		System.out.println("in single parameterized Constructor");

		this.age=age;
	}
	
	protected void getStudent()
	{
		System.out.println("getstudent() method from Oops class");
	}
	
	public static void getName11()
	{
		System.out.println("getName() is static method");
	}
	
	public static String getName() {
		return Name;
	}

	public void setAge(int age)
	{
		this.age = age;
		
	}
	
	public int getAge()
	{
		return age;
	}
	
	
	
	
	
	
	public String getCOLLEGENAME() {
		return COLLEGENAME;
	}

	public static void setName(String name) {
		Name = name;
	}






	final String COLLEGENAME= "CYBER SUCCESS"; 
	
	public String toString()
	{
		return age + COLLEGENAME;
	}

//	@Override
//	public String toString() {
//		return  age +  COLLEGENAME;// + ", getAge()=" + getAge() + ", getClass()="
				//+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
	
	
	
}
