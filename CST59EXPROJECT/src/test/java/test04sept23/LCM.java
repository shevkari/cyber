package test04sept23;

import java.util.Scanner;

class LCM {

	static int isLCM(int a, int b)
	{
		int result, mult =1;
		
		for (int i=1; i<=a || i<=b;  i++)
		{
			if (a % i == 0 && b % i==0)
			{
				System.out.println(i);
				mult = i;
				
			}
		}
		
		result = (a * b )/mult;
		
		return result;
	}
	
	public static void main(String[] args) {
		//int a=15,b=20;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		System.out.println("LCM of given number " + a +" & "+ b  + " = " + isLCM(a,b));
	sc.close();
	
	}

}
