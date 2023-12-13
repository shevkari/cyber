package day20sept23RegularExpression;

import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		
		/*
		// Pattern class : A pattern object is compiled representation of a regular 
		//                 expression
		// Matcher class: A Matcher Object is the engine that interprets the 
			//            pattern and perform operations against an input string
		*/	
	
		/*
		 [abc]: either a or b or c
		 [^abc]: any character except a or b or c
		 [a-z]: char between a to z
		 [A-Z]: char between A to Z
		 [a-zA-Z]: char between a to z or A-Z
		 [0-9]: digit between 0 to 9
		 []?:  char/digit 0 or 1 times
		 []+:  char/digit 1 or more times
		 []*:  char/digit 0 or more times
		 []{n}: Occurs n times
		 []{n,}: Occurs n or more times
		 []{a,b}: Occurs at least a times but below b times
		 \d: [0-9]
		 \D:[^0-9]
		 \w:[a-zA-Z0-9]
		 \W:[^\w]
		 */
		
		System.out.println(Pattern.matches("[abc]","a"));	// true
		System.out.println(Pattern.matches("[abc]", "b"));	// true
		System.out.println(Pattern.matches("[abc]", "c"));	// true
		System.out.println(Pattern.matches("[abc]","d")); 	// false
		
		System.out.println(Pattern.matches("[abc]","ab"));	// false
		System.out.println(Pattern.matches("[abc]", "bc"));	// false
		System.out.println(Pattern.matches("[abc]", "ca"));	// false
		System.out.println(Pattern.matches("[abc]","abc")); // false
		System.out.println();
		System.out.println(Pattern.matches("[^abc]","a"));	// false
		System.out.println(Pattern.matches("[^abc]", "b"));	// false
		System.out.println(Pattern.matches("[^abc]", "c"));	// false
		System.out.println(Pattern.matches("[^abc]","abc")); // false
		System.out.println(Pattern.matches("[^abc]","d"));	// true
		System.out.println(Pattern.matches("[^abc]", "ab"));	// false
		System.out.println(Pattern.matches("[^abc]", "ca"));	// false
		System.out.println(Pattern.matches("[^abc]","abc")); // false
		
		System.out.println();
		
		System.out.println(Pattern.matches("[a-z]","a"));	// true
		System.out.println(Pattern.matches("[a-z]","z"));	// true
		System.out.println(Pattern.matches("[a-z]","d"));	// true
		System.out.println(Pattern.matches("[a-z]","ab"));	// false
		System.out.println(Pattern.matches("[a-z]","D"));	// false
		
		
		System.out.println();
		System.out.println(Pattern.matches("[A-Z]", "B"));	// true
		System.out.println(Pattern.matches("[A-Z]","DA"));	// false
		System.out.println(Pattern.matches("[A-Z]", "M"));	// true
		System.out.println(Pattern.matches("[A-Z]","a"));	// false
		System.out.println(Pattern.matches("[A-z]", "bc"));	// false

		System.out.println();
		System.out.println(Pattern.matches("[a-zA-Z]","A"));	// true
		System.out.println(Pattern.matches("[a-zA-Z]","d"));	// true
		System.out.println(Pattern.matches("[a-zA-Z]","AB"));	// false
		System.out.println(Pattern.matches("[a-zA-Z]","Am"));	// false
		System.out.println(Pattern.matches("[a-zA-Z]","jD"));	// false
		System.out.println(Pattern.matches("[a-zA-Z]","cd"));	// false
		
		
		System.out.println();
		System.out.println(Pattern.matches("[^a-zA-Z]","9"));	// true
		System.out.println(Pattern.matches("[^a-zA-Z]","d"));	// false
		System.out.println(Pattern.matches("[^a-zA-Z]","AB"));	// false
		System.out.println(Pattern.matches("[^a-zA-Z]","Am"));	// false
		System.out.println(Pattern.matches("[^a-zA-Z]","jD"));	// false
		System.out.println(Pattern.matches("[^a-zA-Z]","cd"));	// false
		
		
		System.out.println();
		// {5}: Quantifier
		System.out.println(Pattern.matches("[SM][onali]{5}","Sonali")); //true
		System.out.println(Pattern.matches("[SM][onali]{5}","Monali")); //true
		System.out.println(Pattern.matches("[SM][onali]{5}","Donali")); //false
		System.out.println(Pattern.matches("[SM][onali]{5}","Soonni"));  //true
		System.out.println(Pattern.matches("[SM][onali]{5}","Siiiii"));  //true
		System.out.println(Pattern.matches("[SM][onali]{5}","Diiiii"));  //false
		System.out.println(Pattern.matches("[SM][onali]{5}","Siiiiiiii"));  //false
		System.out.println(Pattern.matches("[SM][onali]{5}","Siiirt"));  //false
		System.out.println(Pattern.matches("[SM][onali]{5}","Siii"));  //false
		
		
		System.out.println();
		
		// ? : represents zero or max one character

		System.out.println(Pattern.matches("[xyz]?","x")); //true
		System.out.println(Pattern.matches("[xyz]?","")); // true
		System.out.println(Pattern.matches("[xyz]?","y")); //true
		System.out.println(Pattern.matches("[xyz]?","z")); //true
		System.out.println(Pattern.matches("[xyz]?","xy")); //false
		System.out.println(Pattern.matches("[xyz]?","xx")); //false
		System.out.println(Pattern.matches("[xyz]?","X")); //false
		System.out.println(Pattern.matches("[xyz]?","9")); //false
		
		
		System.out.println();
		// + : represents one or more character

		System.out.println(Pattern.matches("[xyz]+","x")); //true
		System.out.println(Pattern.matches("[xyz]+","")); // false
		System.out.println(Pattern.matches("[xyz]+","y")); //true
		System.out.println(Pattern.matches("[xyz]+","z")); //true
		System.out.println(Pattern.matches("[xyz]+","xy")); // true
		System.out.println(Pattern.matches("[xyz]+","xx")); // true
		System.out.println(Pattern.matches("[xyz]+","X")); //	false
		System.out.println(Pattern.matches("[xyz]+","9")); //false
		
		System.out.println();
		// * : represents zero or more character

		System.out.println(Pattern.matches("[xyz]*","x")); //true
		System.out.println(Pattern.matches("[xyz]*","")); // true
		System.out.println(Pattern.matches("[xyz]*","y")); //true
		System.out.println(Pattern.matches("[xyz]*","z")); //true
		System.out.println(Pattern.matches("[xyz]*","xy")); // true
		System.out.println(Pattern.matches("[xyz]*","xxyy")); // true
		System.out.println(Pattern.matches("[xyz]*","X")); //	false
		System.out.println(Pattern.matches("[xyz]*","9")); //false
		System.out.println(Pattern.matches("[xyz]*","xyzxyz")); // true
		
		System.out.println();
		//Metacharacter [0-9]   = \d
		
		System.out.println(Pattern.matches("\\d","1")); //true
		System.out.println(Pattern.matches("\\d","6")); //true
		System.out.println(Pattern.matches("\\d","9")); //true
		System.out.println(Pattern.matches("\\d{2}","12")); //true
		System.out.println(Pattern.matches("\\d{2}","56")); //true
		System.out.println(Pattern.matches("\\d{2}","563")); //false
		System.out.println(Pattern.matches("\\d{2}","ab")); //false
		System.out.println(Pattern.matches("\\d","b")); //false
		
		
		
		System.out.println();
		
		// \\d represents 0-9 {1,3} -> either 1 or 2 or max 3
				System.out.println(Pattern.matches("\\d{1,3}","1"));     //true
				System.out.println(Pattern.matches("\\d{1,3}","23"));    //true
				System.out.println(Pattern.matches("\\d{1,3}","567"));   //true
				System.out.println(Pattern.matches("\\d{1,3}","8768"));  //false
				System.out.println(Pattern.matches("\\d{1,5}","98765")); //true
				System.out.println(Pattern.matches("\\d{1,5}","abcde")); //false
				System.out.println(Pattern.matches("\\d{1,3}","1234")); //false
				
		System.out.println();
		
		//w: metacharacter [a-zA-Z0-9]  
				System.out.println(Pattern.matches("\\w{1,3}","abc")); //true
				System.out.println(Pattern.matches("\\w{1,3}","abcde")); //false
				System.out.println(Pattern.matches("\\w{1,3}","ab1")); //true
				System.out.println(Pattern.matches("\\w{1,3}","123")); //true
				System.out.println(Pattern.matches("\\w{1,3}","ABC")); //true
				System.out.println(Pattern.matches("\\w{1,3}","abcd")); //false
				System.out.println(Pattern.matches("\\w{1,3}","aB1")); //true
				System.out.println(Pattern.matches("\\w{1,3}","aB&")); //false
			
				
			System.out.println();
			
			// \\D: [a-zA-Z]  All alphabets
			System.out.println(Pattern.matches("\\D","1")); //false
			System.out.println(Pattern.matches("\\D","12")); //false
			System.out.println(Pattern.matches("\\D","A")); //true
			System.out.println(Pattern.matches("\\D","a")); //true
			System.out.println(Pattern.matches("\\D","ab")); //false
		
		
		System.out.println();
		
		// . represents a single character
				System.out.println(Pattern.matches("..m","alm")); //true
				System.out.println(Pattern.matches("alm","alm")); //true
				System.out.println(Pattern.matches("alm","apq")); //false
				System.out.println(Pattern.matches("...","apq")); //true
				System.out.println(Pattern.matches("...","123")); //true
				System.out.println(Pattern.matches("...","&&&")); //true
				System.out.println(Pattern.matches("...","...")); //true
		
		System.out.println();
		
		System.out.println(Pattern.matches(".o","monali")); //false
		System.out.println(Pattern.matches("[mo][onali]{5}","monali")); //true
		System.out.println(Pattern.matches(".o[nali]{4}","monali")); //true
		System.out.println(Pattern.matches(".o[nali]{5}","monali")); //false
		System.out.println(Pattern.matches(".o[nali]{5}","monnnnn")); //true
		
		System.out.println();
		
		System.out.println(Pattern.matches("[xyz]?","xxx")); //false
		System.out.println(Pattern.matches("[xyz]?","x")); //true
		System.out.println(Pattern.matches("[xyz]?","y")); //true
		System.out.println(Pattern.matches("[xyz]?","z")); //true
		System.out.println(Pattern.matches("[xyz]?","xy")); //false
		System.out.println(Pattern.matches("[xyz]?","")); //true
		System.out.println(Pattern.matches("[xyz]?","ABC")); // false
		System.out.println(Pattern.matches("[xyz]?","A")); // false
		
		
		System.out.println();
		
		System.out.println(Pattern.matches("[xyz]*","x")); //true
		System.out.println(Pattern.matches("[xyz]*","xx")); //true
		System.out.println(Pattern.matches("[xyz]*","xX")); //false
		System.out.println(Pattern.matches("[xyz]?","xy")); //false
		System.out.println(Pattern.matches("[xyz]*","8")); //false
		System.out.println(Pattern.matches("[xyz]*","xyxyz")); //true
		
		System.out.println();
		
		// Write a program to validate a mobile no which is of 10 
				// digits and starts with either 7/8/9
				// ex: 552588168
				System.out.println(Pattern.matches("[789][0-9]{9}","7552588168")); //true
				System.out.println(Pattern.matches("[789][0-9]{9}","8552588168")); //true
				System.out.println(Pattern.matches("[789][0-9]{9}","9525881681")); //true
				System.out.println(Pattern.matches("[789][0-9]{9}","1552588168")); //false
				System.out.println(Pattern.matches("[789][0-9]{9}","955258")); //false
				System.out.println(Pattern.matches("[789][0-9]{9}","9552581234455555")); //false
				System.out.println(Pattern.matches("[789][0-9]{9}","95525ABCDe")); //false
				
				
				//eg: 197-267-3345
				System.out.println(Pattern.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{3}","955-258-876")); //true
				System.out.println(Pattern.matches("[0-9]{3}[-]{2}[0-9]{3}[-]{1}[0-9]{3}","955-258-876")); //false
				System.out.println(Pattern.matches("[0-9]{3}[-]{2}[0-9]{3}[-]{1}[0-9]{3}","955--258-876")); //true
		
		System.out.println();
				// find a character(upper case alphabet) and contains lower case 
				// alphabet, only one digit is allowed in between
			    // [A-Z][a-z]*[0-9][a-z]*
					System.out.println(Pattern.matches("[A-Z][a-z]*[0-9][a-z]*","Bcyber5success")); //true
					System.out.println(Pattern.matches("[A-Z][a-z]*[0-9][a-z]*","Bcyber35success")); //false
					System.out.println(Pattern.matches("[A-Z][a-z]*[0-9][a-z]*","Bcyber3")); //true	
					System.out.println(Pattern.matches("[A-Z][a-z]*[0-9][a-z]*","BAcyber3fhjsu")); // false
					
				
			System.out.println();
			
			// validation of an email
			//sonali789@gmail.com or monali@gmail.org or cybersuccess@gmail.edu
					
		 	System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]{1}gmail\\.com|org|edu","sonAli1@gmail.com")); //true  
		 	System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]{1}gmail\\.[com]*|[org]*|[edu]*","sonAli1@gmail.ccc")); //true  
			System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]gmail[\\.][com]*[org]*[edu]*","sonali123@gmail.com")); //true
			System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]gmail\\.[com]*[org]*[edu]*","sonali123@gmail.org")); //true	
			System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]gmail\\.[com]*[org]*[edu]*","sonali123@gmail.edu")); //true
			System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]gmail\\.[com]*[org]*[edu]*",	"sonali123@gmail.gov")); //false

				
	}

}
