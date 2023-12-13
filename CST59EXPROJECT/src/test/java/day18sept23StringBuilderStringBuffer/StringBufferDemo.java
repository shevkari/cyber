package day18sept23StringBuilderStringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Amol");
		System.out.println(sb.hashCode()); 	// 1159190947
		sb.append(" Shevkari");
		System.out.println(sb);
		System.out.println(sb.hashCode()); 	// 1159190947
		sb.append(" Cyber Success");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.delete(21, 27);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.deleteCharAt(20);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.delete(14,20);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.insert(14, "Cyber Success");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
	}

}
