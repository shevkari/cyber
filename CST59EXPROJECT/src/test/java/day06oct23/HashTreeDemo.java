package day06oct23;

import java.util.Hashtable;
import java.util.Map;

public class HashTreeDemo {

	public static void main(String[] args) {

		Map<String, String> ht = new Hashtable<>();
		
		// HashTable is thread safe
				// null value in key or value is not allowed 
		
	//	ht.put(null, null);
		ht.put("Rohit", "Virat");
	//	ht.put("Sachin", null);
		ht.put("Rohitt", "Viratt");
		
		System.out.println(ht);
	}

}
