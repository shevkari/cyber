package day08nov23KeysEnumSVGScreenShots;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysEnumDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300);","");
		
	
		
		driver.findElement(By.id("userName")).sendKeys("ABC");
		driver.findElement(By.id("userEmail")).sendKeys("xyz.gmail.com");
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("ABCXYZ.com");
		
		String str = Keys.chord(Keys.CONTROL,"A");
		address.sendKeys(str);
		
		 str = Keys.chord(Keys.CONTROL,"C");
		address.sendKeys(str);
		
		Keys.chord(Keys.TAB);
		
		WebElement pAdd = driver.findElement(By.id("permanentAddress"));
		str = Keys.chord(Keys.CONTROL,"V");
		pAdd.sendKeys(str);
		
		
		
	}

}
