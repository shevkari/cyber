package day13nov23NewPredefinedIntefaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(List.of(10,50,40,30,20));
		
		Stream<Integer> s = list.stream();
	//	s.forEach(x->System.out.print(x+" ,"));
	//	s.forEach(z->System.out.println(z )); // java.lang.IllegalStateException: stream has already been operated upon or closed
		s.forEach(System.out::println); // method Reference
		
		
		System.out.println("Sorted list " + "-".repeat(10));
		
		list.stream().sorted().forEach(x->System.out.println(x));
		
		System.out.println("ASC Sorted list using comparable ==========> ");
		list.stream().sorted((x,y)->x.compareTo(y)).forEach(x->System.out.println(x));
		
		System.out.println("DESC Sorted list using comparable ==========> ");
		list.stream().sorted((x,y)->y.compareTo(x)).forEach(x->System.out.println(x));
		
		System.out.println("DESC Sorted list using comparable ==========> ");
		list.stream().sorted((x,y)->-(x-y)).forEach(x->System.out.println(x));
		
		System.out.println("ASC Sorted list using comparable ==========> ");
		list.stream().sorted((x,y)->(x-y)).forEach(x->System.out.println(x));
		
		System.out.println();
		System.out.println();
		
		System.out.println("Even numbers from List");
		
		list.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		
		System.out.println("Odd numbers from List");
		list.stream().filter(x->x%2!=0).forEach(x->System.out.println(x));

		
		List<String> ls = new ArrayList<>();
		ls.add("Virat");
		ls.add("Arjun");
		ls.add("Dhoni");
		ls.add("Rohit");
		ls.add("Rishabh");
		ls.add("Shikhar");
		ls.add("Dhoni");
		
		System.out.println();
		ls.stream().forEach(x->System.out.println(x));
		
		System.out.println();
		ls.stream().filter(x->x.startsWith("R")).filter(x->x.length()>5).forEach(System.out::println);
		
		System.out.println();
		ls.stream().distinct().forEach(System.out::println);
		
		System.out.println();
	//	ls.stream().map(x->x.toUpperCase()).forEach(x->System.out.println(x));
		ls.stream().forEach(x->System.out.println(x.toUpperCase()));
		
		System.out.println();
		ls.stream().map(x->x.toLowerCase()).forEach(x->System.out.println(x));
	//	ls.stream().forEach(x->System.out.println(x.toLowerCase()));
		
		System.out.println();
		ls.stream().distinct().sorted().forEach(x->System.out.println(x.toUpperCase()));
		
		System.out.println();
		List l1 = ls.stream().sorted().collect(Collectors.toList());
		System.out.println(l1);
		
		System.out.println();
		long cnt = list.stream().filter(x->x%2==0).count();
		System.out.println(cnt);
		
		System.out.println();
		list.stream().forEach(x-> System.out.println(x*x));
		
		System.out.println();
		Set<Integer> set = list.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(set);
		
		System.out.println();
		List<Integer> ll = list.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(ll);
		
		System.out.println();
		ls.stream().map(x->x.replace('R', 'Z')).forEach(x->System.out.println(x));
		
		System.out.println();
		Integer I = list.stream().reduce(0,(n1,n2)->(n1+n2) );
		System.out.println(I);
		
		System.out.println();
		Optional<Integer> oi = list.stream().max((n1,n2)->Integer.compare(n1, n2));
		System.out.println(oi.get());
		
		System.out.println();
		oi  = list.stream().min((n1,n2)->Integer.compare(n1,n2 ));
		System.out.println(oi.get());
		
		System.out.println();
		List<Integer> EmptyList = new ArrayList<>();
		Optional<Integer> op = EmptyList.stream().min((n1,n2)->Integer.compare(n1,n2));
//		System.out.println(op.get()); // NoSuchElementException: No value present
		System.out.println(op.orElse(-1));
		
		System.out.println();
		Optional <Integer> aa = List.of(35,37,40).stream().filter(e->e%2==0).max((n1,n2)->Integer.compare(n1,n2));
		System.out.println(aa.isEmpty());
		System.out.println(aa.isPresent());
		System.out.println(aa.orElse(-1));
	}
	
	

}
