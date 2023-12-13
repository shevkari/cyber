package day12oct23_CollectionForREST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapOfMapOfList {

	public static void main(String[] args) {
		
		List<Integer> AL = new ArrayList<>(List.of(12,23,34));
		Map<String,List<Integer>> ML = new HashMap<>();
		ML.put("Rohit",AL);
		Map<String,Map<String,List<Integer>>> MML = new HashMap<>();
		
		List<Integer> AL1 = new ArrayList<>(List.of(11,22,33));
		Map<String,List<Integer>> ML1 = new HashMap<>();
		ML1.put("Virat",AL1);
		
		List<Integer> AL2 = new ArrayList<>(List.of(10,20,30));
		Map<String,List<Integer>> ML2 = new HashMap<>();
		ML2.put("Rohit",AL2);

		MML.put("India", ML);
		MML.put("IND", ML1);
		MML.put("IN", ML2);
		
		System.out.println(MML);
		/*//Set<String> ks = mml.keySet();
		//	for (String s : ks) 
		//	{
			//	Map<String, List<Integer>> mmlr = mml.get(s);
				Set<String> kss = mmlr.keySet();	
				for (String kv : kss) 
				{
					List<Integer> li = mmlr.get(kv);
					System.out.println(s+ " : " + kv + " : " + li);
				}
			}*/
		
		
		Set<String> SK =MML.keySet();
		for (String x : SK)
		{
			Map<String,List<Integer>> MLI = MML.get(x);
			Set<String> SMLI = MLI.keySet();
			for(String XX:SMLI)
			{
				List<Integer> L = MLI.get(XX);
				
				System.out.println(x+" : " + SMLI +" : " + L);
				
			}
			
			
		}
	}

}
