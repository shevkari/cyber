package day02nov23ValueAttributeWebTableAlertsendKeysOpernTab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcersiseJquery {

	public static void main(String[] args) throws InterruptedException {

		String url ="https://jqueryui.com";
	
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	List<WebElement> WE = 	driver.findElements(By.xpath("//div[@class='dev-links']//a"));
		System.out.println(WE.size());
	for (WebElement x : WE) 
	 {
			 WE = driver.findElements(By.xpath("(//div)[14][@class='dev-links']/ul/li"));
			
		System.out.println(x.getText());
		x.click();
		//	System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
		}
		
	
	/*
		Set<String> str =	driver.getWindowHandles();
		Iterator<String> iter = str.iterator();
		String pwin = iter.next();
		String Cwin = iter.next();
		Thread.sleep(2000l);
		driver.switchTo().window(Cwin);
		String URl = driver.getCurrentUrl();
		System.out.println(URl);
		driver.switchTo().window(pwin);
		
		*/
		
		
		
	}

}
