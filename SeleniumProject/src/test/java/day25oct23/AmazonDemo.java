package day25oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("iphone 14");
		Thread.sleep(2000l);
		element = driver.findElement(By.id("nav-search-submit-button"));
		element.click();
		
	}

}
