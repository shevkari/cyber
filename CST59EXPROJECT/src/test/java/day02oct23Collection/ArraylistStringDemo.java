package day02oct23Collection;

import java.util.ArrayList;
import java.util.List;


public class ArraylistStringDemo {

	
	public static void main(String[] args) {
		
		ArrayList<String> arst = new ArrayList<>();
		
		arst.add("Amol");
		arst.add("Premraj");
		arst.add("Akash");
		arst.add("Rohit");
		arst.add("Sky");
		System.out.println(arst);
		System.out.println("-".repeat(25));
		arst.add("Ishan");
		
		System.out.println(arst);
		
		System.out.println("-".repeat(25));
		
		arst.add(2, "Tilak");
		
		System.out.println(arst);
		
		System.out.println("-".repeat(25));
		
		String str = arst.remove(5);
		
		System.out.println(str);
		System.out.println(arst);
		
		System.out.println("-".repeat(25));
		
		for (String x : arst) {
			System.out.println(x.toUpperCase());
		}
		
		System.out.println("-".repeat(25));
		
		List<String> l = new ArrayList<>();
		l.add("Rahul");
		l.add("Shikhar");
		
		System.out.println(l);
		
		System.out.println("-".repeat(25));
		
		boolean res = arst.addAll(l);
		System.out.println(res);
		System.out.println(arst);
		
		System.out.println("-".repeat(25));
		
		res = arst.addAll(3, l);
		
		System.out.println(arst);
	}
	
	
	
	
}
