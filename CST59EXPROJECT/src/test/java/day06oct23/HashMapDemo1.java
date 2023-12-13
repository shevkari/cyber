package day06oct23;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<>();
		
		Map <Integer, String> hm1 = new HashMap<>(Map.of(1,"Rahul",2,"Rohit"));
		
		Map<Integer, String> hm2 = new HashMap<>(30);
		
		Map<Integer, String> hm3 = new HashMap<>(39,0.75f);
		
		Map <Integer, String> hm4 = new HashMap<>(hm1);
		
		Map <Integer,String> hm5 = new HashMap<>()
		{
			{
				put(3,"Virat");
				put(4, "null");
				put(null, null);
				put(null, "Shikar");
				put(5, null);
				put(4, "Sachin");
			}
		};
		
		System.out.println(hm);
		System.out.println(hm1);
		System.out.println(hm2);
		System.out.println(hm3);
		System.out.println(hm4);
		System.out.println(hm5);
		
	
		
		
	}

}
