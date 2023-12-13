package day21aug23AccessModifierEncapsulation;

//class Dog1
class DoggyRunner 
{
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

//class DoggyRunner {
class Dog1{
	public static void main(String[] args) {
		DoggyRunner d= new DoggyRunner();
		d.setAge(10);
		d.setName("Moti");
		System.out.println(d.getName() + " : " + d.getAge());
	}
}
