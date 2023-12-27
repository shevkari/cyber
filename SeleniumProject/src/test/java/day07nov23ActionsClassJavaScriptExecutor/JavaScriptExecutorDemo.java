package day07nov23ActionsClassJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000);", "");
		
		js.executeScript("window.scrollBy(0,-2000);","");
		
		WebElement txtBox =driver.findElement(By.xpath("//input"));
		
	//	js.executeScript("arguments[0].value='Amol';", txtBox);
		String str = "Nikhil";
		js.executeScript("arguments[0].value='"+ str +"';",txtBox);
		
		WebElement abt = driver.findElement(By.xpath("//a[@href='https://jqueryui.com/about/']"));
		
		js.executeScript("arguments[0].click();",abt);
		
		WebElement lnkTwitter = driver.findElement(By.xpath("//li/a[@class='icon-twitter']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", lnkTwitter);
		
		driver.quit();
		
		}

}
