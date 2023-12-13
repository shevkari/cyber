package day25sept23Misc;

import java.util.Random;

public class RandomNumberGenreateDemo {

	public static void main(String[] args) {

		Random r = new Random();
		for (int i=1; i<=10; i++)
		{
		System.out.println(Math.abs(r.nextInt(100,500)));
		}
	}

}
