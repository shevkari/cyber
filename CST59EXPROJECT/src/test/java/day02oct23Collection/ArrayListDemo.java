package day02oct23Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> arl = new ArrayList<>();
		
		System.out.println(arl.size());
		
		arl.add(876);
		arl.add(989);
		arl.add(123);
		arl.add(456);
		arl.add(789);
		arl.add(307);
		
		System.out.println(arl);
		
		System.out.println(arl.size());
	
		int remele=	arl.remove(4);
		System.out.println(remele);
		System.out.println(arl);
		System.out.println(arl.size());
		for (Integer x : arl) {
			System.out.println(x);
		}
		
		System.out.println("-".repeat(25));
		
		for (int i=0; i<arl.size(); i++)
		{
			System.out.println(arl.get(i));
		}
		
	}

}
