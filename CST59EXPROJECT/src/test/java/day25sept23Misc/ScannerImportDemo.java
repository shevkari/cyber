package day25sept23Misc;

import java.util.Scanner;

public class ScannerImportDemo {

	public static void main(String[] args) {

		String str = "India is my Country";
		Scanner sc = new Scanner(str);
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
	//	System.out.println(sc.next()); // NoSuchElementException
		
		
		String str1 = "India is my Country, I am proud to be an Indian";
		Scanner sc1 = new Scanner(str1);
		
		while(sc1.hasNext())
		{
			System.out.println(sc1.next());
		}
		
	}

}
