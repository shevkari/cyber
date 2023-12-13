package day05oct23Set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TreeSetMethodDemo {

	public static void main(String[] args) {

		
				Set<String> s1 = new HashSet<>();
				s1.add("Virat");
				s1.add("Rohit");
				s1.add("Abhishek");
				s1.add("Vitthal");
				
				
				Set<String> s2 = new HashSet<>();
				s2.add("Virat");
				s2.add("Rohit");
				s2.add("Sharad");
				
				// intersection = common elements
				s1.retainAll(s2); // it retains only element which are common between s1 and s2
				System.out.println("s1 : " + s1);
				System.out.println(s1.size());  // 2
				boolean res = s1.remove("Virat");
				System.out.println("res : " + res);
				System.out.println("s1 : " + s1);
				res = s1.remove("Virat");
				System.out.println("res : " + res);
				System.out.println("s1 : " + s1);	
				s1.clear();
				System.out.println("s1 : " + s1);	
				System.out.println("s1 : " + s1.size());	

				System.out.println("s2 : " + s2);
				
				Set<String> s3 = new HashSet<>(List.of("Abhijeet","Anuj","Sharad","Virat"));
				res = s2.removeAll(s3);  // s2 - s3 
				System.out.println("s3 : " + s3);
				System.out.println("s2: " + s2);
				
			}
		}
		

