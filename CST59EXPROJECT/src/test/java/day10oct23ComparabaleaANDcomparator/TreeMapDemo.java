package day10oct23ComparabaleaANDcomparator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		Map<Integer,String> TM = new TreeMap<>();
		TM.put(1, "Rohit");
		TM.put(4, "Virat");
		TM.put(6, "Shikhar");
		TM.put(8, "Ishan");
		TM.put(9, "SKY");
		
		System.out.println(TM);
		boolean res = TM.containsKey(8);
		System.out.println(res);
		
		Set <Integer> key = TM.keySet();
		
		System.out.println(key);
		
		System.out.println(TM.putIfAbsent(9, "Raj"));
		
		System.out.println(TM.toString());
		System.out.println(TM.toString().length());
		
		
		
		
		
		
	}

}
