package day20sept23RegularExpression;

public class SystemOutPrintlnDemo {

	/**
	 * m1 method returns a constant string Cyber
	 * @param str
	 * @return
	 */
			static String m1(String str)
		{
			System.out.println("I am inside a method m1()");
			return "Cyber " + str;
		}
		
		public static void main(String[] args) {
			System.out.println("Cyber Success");
			
			// System: final class
			// out   : public static final PrintStream class object
			// print/println: non static method of PrintStream class
			System.out.println(m1("success Deccan"));
		
	}

}
