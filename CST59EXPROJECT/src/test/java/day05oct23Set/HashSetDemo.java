package day05oct23Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<Integer> hs = new HashSet<>();
		hs.add(12);
		hs.add(23);
		hs.add(34);
		hs.add(45);
		
		System.out.println(hs);
		
		Set<Integer> hs1 = new HashSet<>(Set.of(12,13,14,15));
		
		System.out.println(hs1);
		
		Set<Integer> hs2 = new HashSet<>();
		
			{
				hs2.add(54);
				hs2.add(55);
				hs2.add(56);
				hs2.add(55);
			}
		System.out.println(hs2);
		
		Iterator<Integer> itr = hs.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
			
			List<Integer> ll = new LinkedList<>(List.of(55,57,78,34));
			
			Set<Integer> hs3 = new HashSet<>(ll);
			System.out.println(hs3);
			hs3.addAll(hs);
			System.out.println(hs3);
			
		
		
	}

}
