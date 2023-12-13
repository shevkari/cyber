package day24aug24Inheritance;

public class GrandParent {

	protected String Name;
	protected char Gender;
	protected int Age;
	
		public String getName() {
		return Name;
	}

	public char getGender() {
		return Gender;
	}

	public int getAge() {
		return Age;
	}

	GrandParent()
	{
		System.out.println("Grand Parent Costructor");
	}
}
