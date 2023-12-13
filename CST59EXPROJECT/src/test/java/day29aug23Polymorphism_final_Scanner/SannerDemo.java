package day29aug23Polymorphism_final_Scanner;

import java.util.Scanner;

public class SannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int no = sc.nextInt();
		
		System.out.println("Entered Number is : " + no);
		
		System.out.println("Enter name : ");
		String S = sc.next();
		System.out.println("Entered Name is  : " + S);
		
		System.out.println("Enter Name & Surname : ");
		String Name = sc.nextLine();
		System.out.println("Entered Name & Surname is  : " + Name);
		
		
		sc.close();
	}

}
