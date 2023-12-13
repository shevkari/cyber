package day24aug24New;


public class Spparow {
	
	String Color;
	
	void Sound()
	{
		System.out.println("Sound chiew chiew");
	}
	
	
	public String getColor() {
		return Color;
	}



	public static void main(String[] args) {

		Spparow Sp = new Spparow();
		Sp.Color="Brown";
		Sp.Sound();
		System.out.println(Sp.getColor());
		/* if protected access modifier then in class for members then 
		that are not accessible in other non-subclass in other package
		Sp.name;
		Sp.Weight;
		Sp.fly();
		*/
	}

}
