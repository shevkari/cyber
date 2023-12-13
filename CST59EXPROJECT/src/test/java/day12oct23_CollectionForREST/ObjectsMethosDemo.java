package day12oct23_CollectionForREST;

import java.util.Objects;

public class ObjectsMethosDemo {

	public static void main(String[] args) {

		String S= null;
		System.out.println(Objects.isNull(S)); // true
		System.out.println(Objects.nonNull(S));	// false
	
		
		Student s1 = new Student(1,"Virat");
		System.out.println(Objects.isNull(s1)); // fasle
		System.out.println(Objects.nonNull(s1));	// true
	
		
	}

}
