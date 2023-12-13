package test23aug23;

import java.util.*;
public class keithNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to find keith number");
		int no = sc.nextInt();
		sc.close();
		if (no>99 && no<1000)
		{
		
	int r1,r2,r3, sum;
			 
		r1= no % 10;
		int n1 = no /10;
		r2= n1 % 10;
		 int n2 = n1/10;
		 r3 = n2 % 10;

		 System.out.println(r1+ " : " + r2 + " : " + r3);
		 
		 sum = r3 + r2 +r1;
		 System.out.println(sum);
		 
		 while (sum <=no)
		 {
		 
		 r3=r2;
		 r2=r1;
		 r1=sum;
		 
		 
		 System.out.println(r1+ " : " + r2 + " : " + r3);
		 
		 sum = r3+ r2+r1;
		 
		 System.out.println(sum);
	
		 
		if(sum==no)
		{
			System.out.println(no+"  is a kieth number");
			 break;
		 }
		else {
			System.out.println(no+ " is not a keith number");
		}
		 }

		}
		else if (no>99 && no<10000)
		 
		 System.out.println("XYZ");
	 
	}

}
