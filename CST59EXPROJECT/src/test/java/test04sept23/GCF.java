package test04sept23;

import java.util.Scanner;

public class GCF {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st number");
	int a = sc.nextInt();
	System.out.println("Enter 2nd number");
	int b = sc.nextInt();
	sc.close();
	int GCF = 0;
	for (int i=1; i<=a || i<=b; i++)
	{
		if(a % i == 0 && b % i == 0)
		{
			GCF = i;
		}
	}
	System.out.println("GCF of Given Number's " + a +" & " + b +" = " + GCF);
	}
}