package day10oct23ComparabaleaANDcomparator;

public class Student implements Comparable<Student> {

	int rollno;
	String name;
	
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	public String toString()
	{
		return rollno +" : "+ name;
	}
	
	public int compareTo(Student that)
	{
	//	return this.getRollno()-that.getRollno(); // ascending order to rollno
		
	//	return that.getRollno()-this.getRollno();	// descending order to rollno
		
	//	return this.getName().compareTo(that.getName());	// ascending order to name
		
		return that.getName().compareTo(this.getName());	// descending order to name
		
	}
	
}
