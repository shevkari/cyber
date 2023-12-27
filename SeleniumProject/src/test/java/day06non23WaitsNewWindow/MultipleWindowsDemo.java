package day06non23WaitsNewWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("htttps://www.google.com");
		String Google = driver.getWindowHandle();
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in");
		String Amazon = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com");
	//	String Flipkart = driver.getWindowHandle();
		
		driver.close();
		
		driver.switchTo().window(Amazon);
		driver.close();
		
		driver.switchTo().window(Google);
		driver.close();
		
	}

}
