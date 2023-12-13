package day10oct23ComparabaleaANDcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arral {

	public static void main(String[] args) {

		List<Student> al = new ArrayList<>();
		Student s1 = new Student(40,"Sachin");
		Student s2 = new Student(20,"Rahul");
		Student s3 = new Student(30,"Virat");
		Student s4 = new Student(45,"Rohit");
		Student s5 = new Student(10,"Shikhar");
		Student s6 = new Student(15,"Ishan");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		
		
		System.out.println(al);
		
		
		Collections.sort(al);
		
		
		System.out.println(al);
	}

}
