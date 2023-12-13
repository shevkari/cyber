package day05oct23Set;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set<Integer> ls = new LinkedHashSet<>();
		ls.add(12);
		ls.add(34);
		ls.add(45);
		ls.add(55);
	
		
		System.out.println(ls);
		
		Set <Integer> ls1 = new LinkedHashSet(List.of(3,4,67,89));
		System.out.println(ls1);
		
		System.out.println(ls1.addAll(ls));
		ls1.addAll(ls);
		System.out.println(ls1);

		
		ls1.add(88);
		
		boolean res = 	ls1.contains(89);
	
		System.out.println(res);
		System.out.println(ls1);
	
	}

}
