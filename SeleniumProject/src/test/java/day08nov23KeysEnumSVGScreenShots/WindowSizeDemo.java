package day08nov23KeysEnumSVGScreenShots;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSizeDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Dimension d = new Dimension(500,550);
		driver.manage().window().setSize(d);
		Point p = new Point(50,50);
		driver.manage().window().setPosition(p);
		
	}

}
