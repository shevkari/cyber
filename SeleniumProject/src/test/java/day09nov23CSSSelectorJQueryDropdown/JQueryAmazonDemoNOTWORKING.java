package day09nov23CSSSelectorJQueryDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryAmazonDemoNOTWORKING {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.cssSelector("")).click();
		
		
		driver.findElement(By.cssSelector("span[class='_30XB9F']")).click();
		
		List<WebElement> low=driver.findElements(By.xpath("//span[@class='_1XjE3T']"));
		System.out.println(low.size());
		for(WebElement x:low) {
			low=driver.findElements(By.xpath("//span[@class='_1XjE3T']"));
			 System.out.println(x.getText());
			if(x.getText().equals("Fashion"))
				{;
				x.click();
				break;
				}
			
		//	driver.switchTo().window(null)
		}
		
		
		//List<WebElement> low1 
		low = driver.findElements(By.cssSelector("div[class='_3YgSsQ']"));
		System.out.println(low.size());
		
		for(WebElement ele : low)
		{
			low = driver.findElements(By.cssSelector("div[class='_3YgSsQ']"));
		//	System.out.println(driver.getTitle());

			ele.click();
			//driver.navigate().back();
		}
	
	}

}
