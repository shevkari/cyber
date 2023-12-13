package day18sept23StringBuilderStringBuffer;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Amol");
		System.out.println(sb); 
		System.out.println(sb.hashCode()); 	// 1159190947
		
		System.out.println(sb.length()); // 4
		
		sb.insert(4, " Shevkari Cyber");
		System.out.println(sb); 	  // Amol Shevkari Cyber
		System.out.println(sb.hashCode()); // 1159190947
		
		sb.delete(13, 20);
		System.out.println(sb); 	// Amol Shevkari
		System.out.println(sb.hashCode()); 	// 1159190947

		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity()); 	// 16
		sb1.append("AA");
		System.out.println(sb1.capacity()); 	// 16
		sb1.append("ABCDEFGHIJKLMNOPQRS");
		System.out.println(sb1.capacity()); 	// 34
	}

}
