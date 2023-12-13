package day10oct23ComparabaleaANDcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		al.add(54);
		al.add(45);
		al.add(33);
		al.add(60);
		al.add(59);
		
		System.out.println(al);
		
		System.out.println(Collections.max(al));
		
		System.out.println(Collections.min(al));
		
		Collections.sort(al);
		
		System.out.println(al);
		
		Integer index = Collections.binarySearch(al,54);
		System.out.println(index);
	}

}
