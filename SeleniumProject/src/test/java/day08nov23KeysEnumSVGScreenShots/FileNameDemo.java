package day08nov23KeysEnumSVGScreenShots;

import java.util.Date;

public class FileNameDemo {

	public static void main(String[] args) {

		Date dt = new Date();
		String st = dt.toString().replaceAll(" ","_").replaceAll(":","_");
		System.out.println(st);
		
	}

}
