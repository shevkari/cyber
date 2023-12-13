package day11sept23ObjVarLenArPassingAnonymousArray;

public class ArrayPassingDemo2 {

	
	private static int[] m1(int[] b)
	{
		b[0]=101;
		b[1]=201;
		b[2]=301;
		b[3]=401;
		return b;
	}
	
	public static void main(String[] args) {

		int []a = {1,2,3,4};
		System.out.println("Before calling m1 :");
		for(int x : a)
		{
			System.out.println(x);
		}
		
		int [] c = m1(a);
		
		System.out.println("After calling m1 : ");
		for(int x : c )
		{
			System.out.println(x);
		}
	}

}
