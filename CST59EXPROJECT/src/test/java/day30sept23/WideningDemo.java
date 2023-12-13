package day30sept23;

public class WideningDemo {

	public static void main(String[] args) {

		byte b = 19;
//		byte b = 140; // invalid byte range
		
		System.out.println(b);
		
		
		System.out.println("-".repeat(25));
		
		
		int i;
//		System.out.println(a);	//	The local variable i may not have been initialized 
		
		i = 23+45;
		
		System.out.println(i);
		
		i = b; 		// widening or implicit data type casting/conversion
		System.out.println(i);
		
		System.out.println("-".repeat(25));
		
		int j= 1200; // 4 bytes
		
		// explicit conversion:  
		b = (byte) j;  //Type mismatch: cannot convert from int to byte
		System.out.println("b : " + b);
		
		System.out.println("-".repeat(25));
		
		
		int k = 140;
		float f = k;
		System.out.println("f : " + f);
		
		System.out.println("-".repeat(25));
		
		float q = 156.65f;
		int i1 = (int) q; 
		System.out.println("i1 : " + i1);
//		4 byte = float 4 bytes
		
		System.out.println("-".repeat(25));
		
		b = 65;  // 1 byte <-128 to +127)
		char ch = (char) b;   // 2 bytes <-- 1 byte
		System.out.println("ch =  " + ch);
		
		System.out.println("-".repeat(25));
		
		
		float ff = 12.34f;
		double d;
		d = ff;
		System.out.println("d = " + d);
		
		double d1 = ff;
	 
		System.out.println("-".repeat(25));
		
		float f2 = 34.56f;
		long l = (long) f2;
		System.out.println("l : " + l);
		
		double ddd = l;
		
		System.out.println("-".repeat(25));
		
		
		// Converting string into int
		
		String s = "123";
//		a = (byte) s;    // this will never happen with the help type casting
//		int i2 = (int) s;
		int i3 = Integer.parseInt(s);
		System.out.println("i3 : " + (i3+100));
		
		System.out.println("-".repeat(25));
		
		// Converting int into String
		int i2 =345;
//		String str1 = (String) i2;
		String str1 = String.valueOf(i2);
		System.out.println("str1 : " + (str1+100));
		
		System.out.println("-".repeat(25));
		
		String s1 = "174.34f";
		// conversion of String into Float
		float f4 = Float.parseFloat(s1);
		System.out.println("f4 : " + (f4+100));
		
	}

}
