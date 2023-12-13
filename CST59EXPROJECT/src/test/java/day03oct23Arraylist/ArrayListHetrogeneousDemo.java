package day03oct23Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListHetrogeneousDemo {

	public static void main(String[] args) {
		List ll = new ArrayList<>();
		ll.add(45);
		ll.add(45.54f);
		ll.add('A');
		ll.add(546.45d);
		ll.add(false);
		ll.add(4364975980l);
		
		byte b = 5;
		short s =33;
		ll.add(b);
		ll.add(s);
		ll.add("Amol");
		
		// way #1
		System.out.println(ll);
		
		System.out.println("-".repeat(15));
		// way #2
		for(int i=0; i<ll.size(); i++)
			System.out.println(ll.get(i));
		
		System.out.println("-".repeat(15));
		
		// way #3
		
		for (Object x : ll) {
			System.out.println(x);
			}
		
		System.out.println("-".repeat(15));
		
		// way #4 - Universal iterator : List, Set
		Iterator itr = ll.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("-".repeat(15));
		
		
		// way #5 - applicable only to ArrayList
		
		ListIterator lis = ll.listIterator(); 
		
		while(lis.hasNext())
		System.out.println(lis.next());
		
		System.out.println("-".repeat(15));
		
		while(lis.hasPrevious())
			System.out.println(lis.previous());
		
		
	}
	
}
