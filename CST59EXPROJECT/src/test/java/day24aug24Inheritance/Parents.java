package day24aug24Inheritance;

public class Parents extends GrandParent {
		
	protected String ParentName;
	protected char ParentGender;
	protected int ParentAge;
	
		public String getParentName() {
		return ParentName;
	}

	public char getParentGender() {
		return ParentGender;
	}

	public int getParentAge() {
		return ParentAge;
	}

	Parents()
	{
		System.out.println("Parent Costructor");
	}


	}


