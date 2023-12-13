package day02oct23Collection;

import java.util.ArrayList;
import java.util.List;


public class ArrayListObjectDemo {

	public static void main(String[] args) {

		List<Object> lo = new ArrayList<>();
		
		lo.add(35);
		lo.add("Amol");
		lo.add('A');
		lo.add(34.54f);
		lo.add(true);
		lo.add(35.35);
		lo.add(64938694304850454L);
		
		byte b = 1;
		lo.add(b);
		
		short s = 23;
		lo.add(s);
		
		System.out.println(lo);
		System.out.println(lo.size());
		System.out.println(lo.get(5));
		
		boolean br =lo.contains(35.35);
		System.out.println(br);
		
		br = lo.isEmpty();
		System.out.println("-".repeat(25));
		System.out.println(br);
		
	}

}
