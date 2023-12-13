package day29aug23Polymorphism_final_Scanner;

public class Dog extends Animal {

	{
		System.out.println("Instance Block #1 Parent class Dog");
	}
	
	{
		System.out.println("Instance Block #2 Parent class Dog");
	}
	
	
	public Dog()
	{
		System.out.println("Zero parametrized Constructor of Parent class Dog");
	}
	
	public static void main(String[] args) {

		Dog d = new Dog();
		//1. it will give a call to Parents constructor
		// 1.1. then it calls instance blocks of parent class
		// 2. then it will give a call to child constructor
		// 2.1 then it calls instance blocks of child class
		
	
	}

}
