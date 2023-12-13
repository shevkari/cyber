package day21aug23AccessModifierEncapsulation;

public class Student {

	// instance variable / non-static variables
	
	public int rollNo;
	String name;
	float weight;
	boolean result;
	
	public Student(int rollNo, String name, float weight,boolean result)
	{
		this.rollNo = rollNo;
		this.name   = name;
		this.weight = weight;
		this.result = result;
		
	}
	
	public int getRollNo()
	{
		return this.rollNo;
	}
	
	
	public String getName()
	{
		return this.name;
		
	}
	
	public float getWeight()
	{
		return this.weight;
	}
	
	public boolean getResult()
	{
		return this.result;
	}
	
	
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setWeight(float weight)
	{
		this.weight=weight;
	}
	
	public void setResult(boolean result) 
	{
		this.result= result;
	}
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101,"virat",55f,true);
		
		System.out.println("s1.rollNO = " + s1.getRollNo());
		System.out.println("s1.name = " + s1.getName());
		System.out.println("s1.weight = " + s1.getWeight());
		System.out.println("s1.result = " + s1.getResult());
		
		
		s1.setRollNo(200);
		s1.setName("Rohit");
		s1.setWeight(65f);
		s1.setResult(false);
		
		System.out.println("s1.rollNo = " + s1.getRollNo());
		System.out.println("s1.name = "+s1.getName());
		System.out.println("s1.weight = " +s1.getWeight());
		System.out.println("s1.result  = "+s1.getResult());
	}

}

