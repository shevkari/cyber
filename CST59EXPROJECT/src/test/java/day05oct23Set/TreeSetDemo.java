package day05oct23Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<String> hs = new TreeSet<>();
		hs.add("SKY");
		hs.add("Rohit");
		hs.add("Virat");
		hs.add("SKY");
		
		System.out.println(hs);
		
		Set hs2 = new TreeSet<>(Set.of("Ishan","Rahul","Ravindra","Sachin"));
		
		System.out.println(hs2);
		
		hs.addAll(hs2);
		System.out.println(hs);
		
		Set hs3 = new HashSet<>(Set.of(34,56,78,44.44f,'A'));
		
		System.out.println(hs3);
		
		//hs.addAll(hs3);
		hs3.add(null);
		System.out.println(hs3);
		System.out.println(hs.addAll(hs2)); // Already Added
		
	}

}
