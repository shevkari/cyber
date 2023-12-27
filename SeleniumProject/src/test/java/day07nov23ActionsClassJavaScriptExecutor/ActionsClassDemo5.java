package day07nov23ActionsClassJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo5 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//li/a[text()='Resizable']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300);","");
		
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("(//div[@style='z-index: 90;'])[3]"));
		Actions action = new Actions(driver);
		
		action.clickAndHold(ele).moveByOffset(110, 110).build().perform();
		
	}

}
