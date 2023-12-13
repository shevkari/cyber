package day06oct23;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindOccurence {

	public static void main(String[] args) {

		List<Integer> ll = new LinkedList<>(List.of(1,1,2,3,4,5,6,7,6,4,3,1,3,4,55,6,7,8,6,3,2));
		
		Map<Integer,Integer> mm = new HashMap<>();
		
		for (Integer X : ll) {
			if(mm.get(X)==null)
				mm.put(X, 1);
			else
				mm.put(X,mm.get(X)+1);
			
		}
		System.out.println(mm);
		
		System.out.println("-".repeat(15));
		
		// find unique occ of a given number
		for(Map.Entry<Integer, Integer> entry: mm.entrySet())
			if (entry.getValue() == 1)
				System.out.println(entry.getKey());
		
		System.out.println("-".repeat(15));
		
		// find Other Than Unique occ of a given number
		
		for(Map.Entry<Integer, Integer> entry : mm.entrySet())
			if(entry.getValue()>=1)
				System.out.println(entry.getKey() + " : " + entry.getValue() );
	}

}
