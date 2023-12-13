package day12oct23_CollectionForREST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListOfMapOfList {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>(List.of(10,20,30));
		
		Map<String,List<Integer>> Ml= new HashMap<>();
		Ml.put("Virat", al);
		
	//	System.out.println(Ml);
		
		List<Map<String,List<Integer>>> LML = new ArrayList<>();
		LML.add(Ml);
	//	System.out.println(Ml);
		
		List<Integer> al2 = new ArrayList<>(List.of(40,50,60));
		
		Map<String,List<Integer>> Ml2= new HashMap<>();
		Ml.put("Rohit", al2);
		
		LML.add(Ml2);
			
		List<Integer> al3 = new ArrayList<>(List.of(70,80,90));
		
		Map<String,List<Integer>> Ml3= new HashMap<>();
		Ml.put("Shikhar", al3);
		
		LML.add(Ml3);
		
		System.out.println(LML);
		
		for(int i=0; i<LML.size(); i++)
		{
			Map<String,List<Integer>> MOLOL =  LML.get(i);
			Set<String> keyset = MOLOL.keySet();
			
			for(String s:keyset)
			{
				List<Integer> L =MOLOL.get(s);
				for(Integer j :L)
				{
					System.out.println(s+":" + j);
				}
				
			}
		}
		
	}

}
