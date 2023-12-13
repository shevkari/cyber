package text16oct23;

public class ForCalling extends Oops{

	public static void main(String[] args) {

		ForCalling fc = new ForCalling();
		fc.age=24;
		System.out.println(fc.getAge());
		fc.setName("Rohit");
		fc.getName(); 
		fc.getStudent();
		fc.getName11();	// not a good practise
		System.out.println(fc.getCOLLEGENAME());
		fc.toString();
		
		Oops fc1 = new Oops(56);
		System.out.println(fc1.getAge());
		
		System.out.println("-".repeat(20));
		
		
		Oops ops = new Oops();
		Oops ops1 = new Oops(70);
		ops.age=71;
		System.out.println(ops.getAge());
	//	System.out.println(ops.COLLEGENAME);
		System.out.println(ops.getCOLLEGENAME());
		ops.getStudent();
		ops.setName("Hardik");
		System.out.println(ops.getName());
		
		ops.getName11(); //	Not a good Practise
		ops.Name="Raj";
		ops.toString();
		
		System.out.println("=".repeat(15));
		
		Oops ops11 = new ForCalling();
		ops11.age=10;
		System.out.println(ops11.getAge());
		System.out.println(ops11.COLLEGENAME);
		ops11.getStudent();
		ops11.toString();
		ops11.Name="Virat";
		ops11.setName("Ishan");
		System.out.println(ops11.getName());
		ops11.getName11();
		
		ops11.setAge(56);
		
	}

}
