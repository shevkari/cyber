package day25oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorNameDemo {

	public static void main(String[] args) throws  Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement web = driver.findElement(By.name("q"));
		web.clear();
		web.sendKeys("Cyber Success");
	//	web.click();
		Thread.sleep(2000l);
	//	web = driver.findElement(By.name("btnk"));
	//	web.click();
	}

}
