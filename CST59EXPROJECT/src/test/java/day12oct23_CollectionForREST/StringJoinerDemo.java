package day12oct23_CollectionForREST;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoinerDemo {

	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner("###");
		sj.add("I").add("am").add("In").add("Cyber").add("Success");
		System.out.println(sj);
		
		StringJoiner sj1 = new StringJoiner("##","[","]");
		sj1.add("FC").add("Road").add("Pune");
		System.out.println(sj1);
		
		Stream<String> str1 = Stream.of("Opposite","Goodluck cafe","Deccan","Pune");
		String SS1 = str1.collect(Collectors.joining(" ","[","]"));
		System.out.println(SS1);
		
		
		Stream<String> str = Stream.of("Opposite","Goodluck cafe","Deccan");
		String SS =	str.collect(Collectors.joining(" ","[","]")).toString();
		System.out.println(SS);
	}

}
