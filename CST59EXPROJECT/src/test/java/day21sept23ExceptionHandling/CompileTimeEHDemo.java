package day21sept23ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeEHDemo {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("a.txt");
			//FileInputStream fis = new FileInputStream("D:/Eclipse Installation/CST59EXPROJECT/src/test/java/day21sept23ExceptionHandling/IfswitchDemo.java");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
