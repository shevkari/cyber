package day25sept23Misc;

public class EnumRunner {

	public static void main(String[] args) {

		
		System.out.println(Ganapati.KASBA);
		System.out.println(Ganapati.TAMBDIJOGESHWARI);
		System.out.println(Ganapati.GURUJITALIM);
		System.out.println(Ganapati.TULSIBAUG);
		System.out.println(Ganapati.KESARI);
		System.out.println();
		Ganapati[] g = Ganapati.values();
		for (Ganapati ganapati : g) {
			System.out.println(ganapati);
		}
		
		
	}

}
