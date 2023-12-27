package day26oct23NavigateToFindElementsRadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndGetDemo {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.hdfc.com";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
		driver.findElement(By.id("explore-more-btn")).click();
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000l);
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(4000l);
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
