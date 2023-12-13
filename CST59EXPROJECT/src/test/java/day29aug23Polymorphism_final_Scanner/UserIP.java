package day29aug23Polymorphism_final_Scanner;

import java.util.Scanner;

public class UserIP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How may numbers do you want");
		int no = sc.nextInt();
		int sum =0;
		while (no >=1)
		{
			System.out.println("Enter Number : ");
			int n = sc.nextInt();
			sum = sum + n;
			no--;
		}
		System.out.println("Sum = " + sum);
		sc.close();
	}

}
