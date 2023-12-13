package day21aug23AccessModifierEncapsulation;

public class Dog {

	private String name;
	private String breed;
	private float weight;
	private int age;
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setBreed(String breed)
	{
		this.breed=breed;
		
	}
	
	public void setWeight(float weight)
	{
		this.weight=weight;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	public String getBreed()
	{
		return this.breed;
	}
	
	public float getWeight()
	{
		return this.weight;
	}
	
	public int getAge()
	{
		return this.age;
	}
 
    
}

class DogRunner
	{
	
	public static void main(String[] args) {
		Dog d =new Dog();
		d.setName("Tyson");
		d.setBreed("J S");
		d.setWeight(20f);
		d.setAge(5);
		
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getWeight());
		System.out.println(d.getAge());
	}
}

