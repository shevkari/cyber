package day12oct23_CollectionForREST;

public class Student {

	int RollNo;
	String Name;
	
	public void setRollNo(int RollNo)
	{
		this.RollNo=RollNo;
	}
	
	public int getRollNo()
	{
		return RollNo;
	}
	
	public void setName(String name)
	{
		this.Name=name;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public String toString()
	{
		return Name + RollNo; 
	}
	
	
	
	public Student(int RollNo, String Name)
	{
		this.RollNo=RollNo;
		this.Name=Name;
	}
	
}
