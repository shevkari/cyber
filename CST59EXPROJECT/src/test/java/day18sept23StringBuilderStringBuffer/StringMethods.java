package day18sept23StringBuilderStringBuffer;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Pune";
		String res = String.join(" OR ","Pune","Mumbai","Nagpur","Satara");
		System.out.println(res);
		// output: Pune OR Mumbai OR Nagpur OR Satara

		res = String.join("--","Pune","Mumbai","Nagpur","Satara");
		System.out.println(res);
		// output: Pune--Mumbai--Nagpur--Satara

		// string format
		int a = 12;
		System.out.printf("***%5d",a); //   12
		System.out.printf("\n***%-5d",a); //12   
		System.out.println();
		System.out.println(String.format("***%5d", a));        //   12
		System.out.println(String.format("***%-5d", a));       //12   
		System.out.println(String.format("%05d", a));          //00012   
		System.out.println(String.format("%(5d", -12));        // (12)   
		System.out.println(String.format("%(5d", 12));         //12   
		System.out.println(String.format("%7.2f", 12.34167f)); //   12.34
		System.out.println(String.format("%7.2f", 12.34567f)); //   12.35
		System.out.println(String.format("%10s", "Nagpur"));   //    Nagpur
		System.out.println(String.format("%-10s", "Nagpur"));  //Nagpur    
		System.out.println(String.format("%7.3f", 12.34567));  //   12.356
		
		System.out.println("is this a string? " + str instanceof String);
		System.out.println("is this a string? " + str instanceof Object);
	//	System.out.println("is this a string?" + str instanceof int); str is not a type of int
	
	//	int in = 123;
	//	System.out.println("is this a string?" + in instanceof int); in is not a type of int, instanceof is function of Strinf
		
}
}