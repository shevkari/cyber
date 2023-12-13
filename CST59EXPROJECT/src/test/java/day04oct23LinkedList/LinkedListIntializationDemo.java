package day04oct23LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListIntializationDemo {

	public static void main(String[] args) {

		List<Integer> ll = new LinkedList<>();
		
		ll.add(45);
		ll.add(46);
		ll.add(23);
		ll.add(12);
		
		System.out.println(ll);
		ll.get(2);
		
	}

}
