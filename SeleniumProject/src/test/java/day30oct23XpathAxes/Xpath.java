package day30oct23XpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("q"));//.sendKeys("samsung");
		//element = driver.findElement(By.xpath("//button[@type='submit']"));
		
		element.sendKeys("Samsung");
		//Thread.sleep(2000l);
		element = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(2000l);
		element.click();
		driver.findElement(By.xpath("(//div/div[@class='_10UF8M'])[3]")).click();
	}

}
