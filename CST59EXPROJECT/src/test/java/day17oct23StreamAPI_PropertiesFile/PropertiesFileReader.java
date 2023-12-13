package day17oct23StreamAPI_PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

	public static void main(String[] args) {

		try {
			FileInputStream  fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/day17oct23StreamAPI_PropertiesFile/config.properties");

			
			//	System.out.println(System.getProperty("user.dir"));
			Properties prop = new Properties();
			prop.load(fis);
		
			System.out.println(prop.getProperty("browser"));
			System.out.println(prop.getProperty("os"));
			System.out.println(prop.getProperty("laptop"));
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
	}

}
