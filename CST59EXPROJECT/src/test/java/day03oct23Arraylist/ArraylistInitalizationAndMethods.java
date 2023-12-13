package day03oct23Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArraylistInitalizationAndMethods {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>(List.of(1,2,3,4,5,6));
		
		System.out.println(l1.size());
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		
		System.out.println(l2.size());
		System.out.println(l2);
		
		
		List<Integer> l3 = new ArrayList()
		{
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		
		System.out.println(l3.size());
		System.out.println(l3);
		
		
		List<Integer> l4 = new ArrayList<>(l3);
		System.out.println(l4.size());
		System.out.println(l4);
		
		l1.add(6, null);
		System.out.println(l1);
		
//		for(int i = l1.size()-1; i>=0; i--)
//			System.out.println(l1.get(i));
	
		l1.add(7);
		System.out.println(l1);
		
		l1.addAll(l2);
		System.out.println(l1);
	
		boolean res = l1.contains(2);
		System.out.println(res);
		
		res = l1.containsAll(l3);
		System.out.println(res);
		
		res = l1.remove(null);
		System.out.println(res);
		System.out.println(l1);
		
		List<Integer> l7 = l1.subList(3, 10);
		System.out.println(l7);
	}

}
