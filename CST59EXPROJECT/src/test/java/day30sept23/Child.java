package day30sept23;

public class Child extends Parent {

	int age;
	
	void m1()
	{
		System.out.println("m1() method of Child Class");
	}
	
	void disp()
	{
		System.out.println("disp() method of child class");
	}
	
	public static void main(String[] args) {
 
		Child c = new Child();
		c.m1();
		
		Parent p = new Parent();
		p.m1();
		c.price= 2000000;
		c.age = 25;
		 
		System.out.println(c.price);
		System.out.println(c.age);
		
		
		// upcasting or downcasting or polygraphic refe/polymorphic ref
		Parent p1 = new Child();
		p1.m1();
		p1.price =  2500000;
		System.out.println(p1.price);
		
		
/*		// down casting
		Child c1 = (Child) new Parent();   // ClassCastException: class Parent cannot be cast to class Child
		
		c1.age = 23;
		c1.price = 2543649;
		c1.m1();
*/		
	}

}
