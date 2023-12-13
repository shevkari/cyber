package day21aug23AccessModifierEncapsulation;

public class Car {

	
	int age;
	
	{
		age = 12;
		System.out.println("i am in instance block#2 : "+age);
	}
	
	{
		age = age + 10;
		System.out.println("i am in instance block#1 : "+age);
	}
	
	Car()
	{
		System.out.println("I am in zero parameter constructor");
	}
	
	Car(int age)
	{
		this.age=age + 20;
	}
	
	public static void main(String[] args) {
		//Car c1 = new Car();
		Car C2 = new Car(100);
		System.out.println("C2.age = " +C2.age);
	}

}


