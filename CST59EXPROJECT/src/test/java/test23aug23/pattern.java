package test23aug23;

public class pattern {

	public static void main(String[] args) {
		int count=1;
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
				System.out.print(count++ +" ");
			System.out.println();
		}
		
	}

}
