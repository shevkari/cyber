package day08nov23KeysEnumSVGScreenShots;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		Point p = driver.manage().window().getPosition();
		System.out.println(p);
		
		Dimension d = driver.manage().window().getSize();
		System.out.println(d);
		
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		
	}

}
