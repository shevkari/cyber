package day10oct23ComparabaleaANDcomparator;

public class Employee {

	int empid;
	String name;
	
	public int getEmpid()
	{
		return empid;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public void setEmpid(int empid)
	{
		this.empid = empid;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Employee(int empid, String name)
	{
		this.empid=empid;
		this.name=name;
	}
	
	public String toString()
	{
		return empid + " : " + name; 
	}
}
