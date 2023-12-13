package day25sept23Misc;

import com.github.javafaker.Faker;

public class FakerDemo {

	public static void main(String[] args) throws InterruptedException {

		for (int i=0; i<=10; i++)
		{
		Faker fr = new Faker();
		String str = fr.name().firstName();
		System.out.println(str);
		 str = fr.name().lastName();
		 System.out.println(str);
		 
		 str = fr.address().fullAddress();
		 System.out.println(str);
		 System.out.println();
		 Thread.sleep(1000l);

		// str = fr.file().fileName("\\w[a-z,A-Z]", "Z", "a", "z")+fr.number().numberBetween(0, 9)+".txt";
		 //System.out.println(str);
		}
	}

}
