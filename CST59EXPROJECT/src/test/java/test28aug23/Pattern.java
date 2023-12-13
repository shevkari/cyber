package test28aug23;

public class Pattern {

	
	
	public static void main(String[] args) {
		char A= 'A';
		
		for(int i=1; i<=5; i++)
		{
			for (int sp=4; sp>=i; sp--)
				{
					System.out.print(" ");
				}
			A= 'A';
			for(int j=1; j<=i; j++)
			{
				System.out.print(A +" ");
				A++;
			}
			System.out.println();
		}
	}
	
}
