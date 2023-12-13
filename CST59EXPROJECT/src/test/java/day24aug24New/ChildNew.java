package day24aug24New;

import day24aug24Inheritance.Parent;

public class ChildNew extends Parent {

	
	ChildNew()
	{
		super("XYZ");
		System.out.println("Child Condtruction is called");
	}
	
	
	public static void main(String[] args) {

		ChildNew Chn = new ChildNew();
		
	}

}
