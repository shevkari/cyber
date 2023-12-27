package day03nov23HeadlessEnableDisableDisplayFrameHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		List<WebElement> low = driver.findElements(By.xpath("//h1"));
		System.out.println(low.size());
	
		System.out.println(low.get(0).getText());
		
		

	//	driver.switchTo().frame(0);
		
	//	driver.switchTo().frame("courses-iframe");
	
	  //  driver.switchTo().frame("iframe-name");
	
	    
	    WebElement fr = driver.findElement(By.id("courses-iframe"));
		driver.switchTo().frame(fr);
		
		
		low = driver.findElements(By.xpath("//h1"));
		
		System.out.println(low.size());  
		System.out.println("inside frame text: " + low.get(0).getText());
		
		
	}

}
