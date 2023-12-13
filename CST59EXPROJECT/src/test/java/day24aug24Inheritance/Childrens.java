package day24aug24Inheritance;

public class Childrens extends Parents{

	protected String ChildrenName;
	protected char ChildrenGender;
	protected int ChildrenAge;
	
	public String getChildrenName() {
	return ChildrenName;
	}

	public char getChildrenGender() {
		return ChildrenGender;
	}

	public int getChildrenAge() {
		return ChildrenAge;
	}

	Childrens()
	{
		System.out.println("Children Costructor");
	}
	
	public static void main(String[] args) {
		Childrens Ch = new Childrens();
		
		Ch.Name="ABC";
		Ch.Gender='M';
		Ch.Age=99;
		System.out.println("Grand Parent Details : " + Ch.getName() + " : " + Ch.getGender() + " : " + Ch.getAge());
		Ch.ParentName="PQR";
		Ch.ParentGender='M';
		Ch.ParentAge=60;
		System.out.println("Parent Details : " + Ch.getParentName() + " : " + Ch.getParentGender() + " : " + Ch.getParentAge());
		Ch.ChildrenName="XYZ";
		Ch.ChildrenGender='M';
		Ch.ChildrenAge=35;
		System.out.println("Children Details : " + Ch.getChildrenName() + " : " + Ch.getChildrenGender() + " : " + Ch.getChildrenAge());
	}

}
