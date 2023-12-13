package day21aug23new;

import day21aug23AccessModifierEncapsulation.Student;

public class StudentRunnerNew {

	public static void main(String[] args) {

		Student S3 = new Student(400,"Shikhar",60f,false);
		System.out.println(S3.getRollNo());
		System.out.println(S3.getName());
		System.out.println(S3.getWeight());
		System.out.println(S3.getResult());
	}

}
