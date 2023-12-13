package day21aug23AccessModifierEncapsulation;

public class StudentRunner {

	public static void main(String[] args) {

		Student S2= new Student(300,"Dhoni",66f,true);
		System.out.println(S2.getRollNo());
		System.out.println(S2.getName());
		System.out.println(S2.getWeight());
		System.out.println(S2.getResult());
	
		S2.setRollNo(500);
		System.out.println(S2.getRollNo());
	}

}

