package day15sept23StringMethod;

public class StringFunctions {

	public static void main(String[] args) {

		String s1 = "ABCDEF";
		String s2 = "ABCDEF";
		String s3 = "BCDEF";
		
		// Lexographical Comparison
		
		System.out.println(s1.compareTo(s2)); 	// 0 (65-65)
		System.out.println(s1.compareTo(s3));	// -1 (65-66)
		System.out.println(s3.compareTo(s1));	// 1 (66-65)
		
		String str = "AMOL";
		String str1 = "amol";
		String str2 = "abcdef";
		System.out.println(str.compareToIgnoreCase(str1)); //0
		System.out.println(s1.compareTo(str2));	//32
		
		System.out.println(s1.concat(str));
		
		System.out.println(s3.concat(str2).concat(" CST"));
		
		System.out.println(s1.contains(s3));	// true
		System.out.println(str.contains("ol"));		// false
		
		
		
		System.out.println();

		System.out.println(str.indexOf("M")); // 1
		System.out.println(str.indexOf("L")); // 3

		byte[] bArr = str1.getBytes();
		for (byte b : bArr) {
			System.out.print(b+" ");	
		}
	
		System.out.println(str1.indexOf("a"));	// 0
		System.out.println(str1.indexOf("m"));	// 1
		System.out.println(str1.indexOf("o"));	// 2
		System.out.println(str1.indexOf("l"));	// 3
		System.out.println(str1.indexOf("L"));	// -1		
		
		// indexOf() accepts one more parameter which specifies the index value 
		// from where the character to start searching. this is useful to find nth 
		// occurrence of a given char/string 
	
		
		String str4 = "Cyber Success";
		System.out.println(str4.indexOf("c")); // 	8
		System.out.println(str4.indexOf("e")); // 	3
		System.out.println("2nd occurance of e : " + str4.indexOf("e",4)); // 	10
		
		System.out.println(str4.indexOf("Success"));	// 6
		
		System.out.println(str4.lastIndexOf("e"));	// 10
		System.out.println(str4.lastIndexOf("S"));	// 6
		System.out.println(str4.lastIndexOf("d"));	// -1
		System.out.println(str4.lastIndexOf("e"));	// 10
		System.out.println(str4.lastIndexOf("e",9));	// 3
		
		System.out.println(str4.repeat(5)); // Cyber SuccessCyber SuccessCyber SuccessCyber SuccessCyber Success
		System.out.println("Amol".repeat(10));	// AmolAmolAmolAmolAmolAmolAmolAmolAmolAmol
		
		System.out.println("=".repeat(10));	// ==========

		System.out.println(str4.replace("C", "SS"));	// SSyber Success
		
		System.out.println(str4.replace("Cyber", "SUCCESS"));	// SUCCESS Success
		
		String str5 = "   Cyber Success   ";
		System.out.println(str5.length()); 	// 19
		System.out.println(); 
		System.out.println(str5.strip()); 	// Cyber Success
		System.out.println(str5.stripLeading());	// Cyber Success   
		System.out.println(str5.stripTrailing());	//    Cyber Success 
		System.out.println(str5.stripIndent());	 // Cyber Success
		
		
		char[] cArr = str5.toCharArray();		
		for (char c : cArr) {
		System.out.print(c+" ");	
		}
		
		// How to convert string into a string? using toString()
		String str6 = str5.toString();
		System.out.println("\n"+str6);
		System.out.println(str6.length()); 	// 19
		
		
		// IQ: how to convert int into String? valueOf()
		String val = String.valueOf(100); // valueOf is a static method
		System.out.println(val + 213); // 100213
		
		val = String.valueOf(true);
		System.out.println(val+"false"); 	// truefalse
		System.out.println(val+10); 	// true10
		
		val = String.valueOf(12.3455f);
		System.out.println(val+987); 	// 12.3455987
		
		
		
		
		
		
	}

}
