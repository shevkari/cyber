package day29aug23Polymorphism_final_Scanner;

import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1 : ");
		int No1 = sc.nextInt();
		
		System.out.println("Enter Number2 : ");
		int No2 = sc.nextInt();
		
		System.out.println("Enter Operator : ");
		int operator = sc.nextInt();
		
		
		switch (operator) {
		
		case 1 : int sum = No1 + No2;   
				System.out.println(sum);
				break;
			
		case 2 :  int sub = No1 - No2;   
				System.out.println(sub);
				break;
		
		case 3 :  int mult = No1 * No2;   
				System.out.println(mult);
				break;
				
		case 4 :  float div =(float) No1 / No2;   
				System.out.println(div);
				break;	
				
		case 5 :  int mod = No1 % No2;   
				System.out.println(mod);
				break;	
				
		default : System.out.println("Wrong Choice : ");
		}
			
		sc.close();
		
	}

}
