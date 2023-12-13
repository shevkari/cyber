package day05oct23Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HetrogeniuousSetDemo {

	public static void main(String[] args) {

		Set ss = new HashSet();
		ss.add(45);
		ss.add('A');
		ss.add(34.45f);
		ss.add("Amol");
		ss.add(33.34);
		
		
		Iterator itr = ss.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		System.out.println(ss);
		
	}

}
