package day26sept23WrapperClass;

import java.util.Random;

public class UniqueFileName {

	
	private static String getFileName(int n)
	{
		String validcharset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopkrstuvwxyz0123456789";
		Random rnd = new Random();
		String fn ="";
		for (int i=0; i<n; i++)
		{
			int j = rnd.nextInt(validcharset.length());
			fn = fn + validcharset.charAt(j);
		}
		return fn+".txt";
	}
	
	public static void main(String[] args) {

		int n=10;
		String str = getFileName(n);
		System.out.println(str);
		
	}

}
