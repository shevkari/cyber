package day21oct23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args)  {

		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.selenium.com");
		
		try {
			Thread.sleep(4000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver = new EdgeDriver();
		
		driver.get("https:\\www.amazon.in");
		
	//	driver.close();
		driver.quit();
		
	}

}
