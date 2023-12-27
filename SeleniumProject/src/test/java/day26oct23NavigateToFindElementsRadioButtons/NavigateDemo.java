package day26oct23NavigateToFindElementsRadioButtons;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateDemo {

	public static void main(String[] args) {

		String url = "https://www.letskodeit.com/practice";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
		WebElement element = driver.findElement(By.id("openwindow"));
	
		element.click(); 	// there will be 2 windows opened by an application
							// focus is still on the 1st window

		Set<String> windoids = driver.getWindowHandles();	
		
		Iterator<String> iter = windoids.iterator();
		String firstWindow = iter.next();
		System.out.println("1st Wind id: " + firstWindow);
		
		String secondWindow = iter.next();
		System.out.println("2nd Wind id: " + secondWindow);
		
		driver.switchTo().window(secondWindow);
		System.out.println("2nd window URL: " + driver.getCurrentUrl());
		driver.close(); // will close second window
	
		driver.switchTo().window(firstWindow);
		System.out.println("1st window URL: " + driver.getCurrentUrl());
		driver.close();// will close first window
		
	}

}
