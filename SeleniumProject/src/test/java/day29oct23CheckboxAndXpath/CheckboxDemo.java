package day29oct23CheckboxAndXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
	//	driver.manage().window().minimize();
	//	Thread.sleep(2000l);
		driver.manage().window().maximize();
		
		boolean b = driver.findElement(By.id("bmwcheck")).isSelected();
		System.out.println(b);
		driver.findElement(By.id("bmwcheck")).click();
		Thread.sleep(2000l);
		 b = driver.findElement(By.id("bmwcheck")).isSelected();
		System.out.println(b);
		
		 b = driver.findElement(By.id("benzcheck")).isSelected();
			System.out.println(b);
		driver.findElement(By.id("benzcheck")).click();
		
		 b = driver.findElement(By.id("benzcheck")).isSelected();
			System.out.println(b);
		Thread.sleep(2000l);
		
		 b = driver.findElement(By.id("hondacheck")).isSelected();
			System.out.println(b);
		driver.findElement(By.id("hondacheck")).click();
		 b = driver.findElement(By.id("hondacheck")).isSelected();
			System.out.println(b);
	}

}
