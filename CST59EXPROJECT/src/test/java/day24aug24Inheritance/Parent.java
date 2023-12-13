package day24aug24Inheritance;

public class Parent {
	
	private Parent() {
		System.out.println("Default Parent constructor is call");
	}
	
	protected Parent(String Name) {
		System.out.println("One parameter Constructor is called ");
	}
	
	
}
