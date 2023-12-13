package day04oct23LinkedList;

import java.util.LinkedList;
import java.util.List;


public class LinkedListDemo {

		public static void main(String[] args) {
 
		LinkedList<Integer> ll = new LinkedList<>(List.of(1,24,5,65,87,43,6,65,35));
		Integer llS = ll.size();
		System.out.println(llS);
		System.out.println(ll);
		System.out.println(ll.get(0));
		
		for (Integer X : ll) {
			System.out.println(X);
			
		}
	
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		
		
		
			System.out.println(ll.peek());
			System.out.println(ll.poll());
		System.out.println(ll.pop());
		System.out.println(ll);
		ll.add(11);
		System.out.println(ll);
		System.out.println(ll.remove(0));
		ll.addFirst(1);
		System.out.println(ll);
		
	}

}
