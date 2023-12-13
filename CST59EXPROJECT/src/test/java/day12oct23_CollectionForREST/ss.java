package day12oct23_CollectionForREST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ss {

		public static void main(String[] args) {
			
			Map<String,Map<String, List<Integer>>> mml = new HashMap<>();
			
			List<Integer> al1 = new ArrayList<>();
			al1.add(10);al1.add(20);al1.add(30);
			Map<String, List<Integer>> ml1 = new HashMap<>();
			ml1.put("Virat", al1);
			mml.put("Outer1", ml1);
					
			List<Integer> al2 = new ArrayList<>();
			al2.add(40);al2.add(50);al2.add(60);
			Map<String, List<Integer>> ml2 = new HashMap<>();
			ml2.put("Rohit", al2);
			mml.put("Outer2", ml2);
			
			List<Integer> al3 = new ArrayList<>();
			al3.add(70);al3.add(80);al3.add(90);
			Map<String, List<Integer>> ml3 = new HashMap<>();
			ml3.put("Shikhar", al3);
			mml.put("Outer3", ml3);
			
			
			System.out.println(mml);
			
			
			Set<String> ks = mml.keySet();
			for (String s : ks) 
			{
				Map<String, List<Integer>> mmlr = mml.get(s);
				Set<String> kss = mmlr.keySet();	
				for (String kv : kss) 
				{
					List<Integer> li = mmlr.get(kv);
					System.out.println(s+ " : " + kv + " : " + li);
				}
			}
			
			
			
			
			
			
			
			
			

		}
	}
	

