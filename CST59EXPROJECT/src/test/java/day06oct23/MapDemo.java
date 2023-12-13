package day06oct23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, Integer> md = new HashMap<>();
		
		System.out.println(md.size());
		
		md.put(1,3);
		md.put(3, null);
		md.put(null, 7);
		md.put(null, null);
		
		System.out.println(md);
		
		Set <Integer> ks = md.keySet();
		Iterator <Integer> itr = ks.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Integer kv = itr.next();
			System.out.println(kv + " : " + md.get(kv));
			
		}
		
		
		for (Entry<Integer, Integer> entry: md.entrySet() ) 
		{
			System.out.println(entry);
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}

}
