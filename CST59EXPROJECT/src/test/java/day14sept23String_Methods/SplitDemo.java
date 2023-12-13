package day14sept23String_Methods;

public class SplitDemo {

	public static void main(String[] args) {

		String s1 = "My name is Rohit";
		System.out.println("By split & print Single element of array");
		String[] sArr = s1.split(" ");
		System.out.println(sArr[0]);
		System.out.println(sArr[1]);
		System.out.println(sArr[2]);
		System.out.println(sArr[3]);
		
		
		System.out.println("----------------------");
		System.out.println("By split & print Single element of array using for loop");

		String s2 = "Rohit Gurunath Sharma";
		String[] S2 = s2.split(" ");
		for(int i=S2.length-1; i>=0; i--)
			System.out.println(S2[i]);
		
		System.out.println("----------------------");
		System.out.println("By split & print Single element of array using Foreach loop");

		for (String x : S2)
			System.out.println(x);
		
		System.out.println("----------------------");
		System.out.println("By split & print Reverse array");

		for (int i=S2.length-1; i>=0; i--)
			System.out.println(S2[i]);
		
		System.out.println("----------------------");
		 

			for(int i=s2.length()-1; i>=0; i--)
			System.out.print(s2.charAt(i));
			System.out.println();
			System.out.println("----------------------");
			
			String SS = "Rs 153/-"; 		// we have to seprate 153
			System.out.println(SS.split(" ")[1].split("/")[0]); // Method Chaining -> Real time used
	
			/*
			 * String[] s1Arr = SS.split(" "); 
			 * System.out.println(s1Arr[0]+ " : " +s1Arr[1]);
			 * String[] s2Arr = s1Arr[1].split("/");
			 * System.out.println(s2Arr[0]);
			 */
			
			System.out.println();
			System.out.println("----------------------");

			String s = "https://www.cybersucess.biz";
			String[] s3Arr = s.split("\\.");
			System.out.println(s3Arr.length);
			for (String x : s3Arr) {
				System.out.println(x);
			}
			
			
			
			
			System.out.println();
			System.out.println("----------------------");
			String s5 = "Rohit\\kumar\\sharma"; 
			System.out.println(s5);
			
			String[] arr = s5.split("\\\\");
			System.out.println(arr.length);
			for (String x : arr) {
				System.out.println(x);
			}

			
	}

}

